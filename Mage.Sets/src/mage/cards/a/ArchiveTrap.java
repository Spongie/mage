/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 * 
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 * 
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 * 
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */

package mage.cards.a;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.condition.Condition;
import mage.abilities.costs.AlternativeCostSourceAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.PutLibraryIntoGraveTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.WatcherScope;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.players.Player;
import mage.target.common.TargetOpponent;
import mage.watchers.Watcher;

/**
 * @author BetaSteward_at_googlemail.com
 */
public class ArchiveTrap extends CardImpl {

    public ArchiveTrap(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.INSTANT},"{3}{U}{U}");
        
        this.subtype.add("Trap");

        // If an opponent searched his or her library this turn, you may pay {0} rather than pay Archive Trap's mana cost.
        this.addAbility(new AlternativeCostSourceAbility(new GenericManaCost(0), OpponentSearchesLibCondition.getInstance()), new ArchiveTrapWatcher());
        
        // Target opponent puts the top thirteen cards of his or her library into his or her graveyard.
        this.getSpellAbility().addTarget(new TargetOpponent());
        this.getSpellAbility().addEffect(new PutLibraryIntoGraveTargetEffect(13));               
    }

    public ArchiveTrap(final ArchiveTrap card) {
        super(card);
    }

    @Override
    public ArchiveTrap copy() {
        return new ArchiveTrap(this);
    }
}

class ArchiveTrapWatcher extends Watcher {

    Set<UUID> playerIds = new HashSet<>();
    
    public ArchiveTrapWatcher() {
        super("LibrarySearched", WatcherScope.GAME);
    }

    public ArchiveTrapWatcher(final ArchiveTrapWatcher watcher) {
        super(watcher);
        this.playerIds.addAll(watcher.playerIds);
    }

    @Override
    public ArchiveTrapWatcher copy() {
        return new ArchiveTrapWatcher(this);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() == EventType.LIBRARY_SEARCHED) {
            playerIds.add(event.getPlayerId());
        }
    }

    @Override
    public void reset() {
        super.reset();
        playerIds.clear();
    }

    
    public Set<UUID> getPlayersSearchedLibrary() {
        return playerIds;
    }
}

class OpponentSearchesLibCondition implements Condition {

    private static final OpponentSearchesLibCondition fInstance = new OpponentSearchesLibCondition();
    
    public static Condition getInstance() {
        return fInstance;
    }

    @Override
    public boolean apply(Game game, Ability source) {
        ArchiveTrapWatcher watcher = (ArchiveTrapWatcher) game.getState().getWatchers().get("LibrarySearched");
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null && watcher != null) {
            for (UUID playerId : watcher.getPlayersSearchedLibrary()) {
                if (game.isOpponent(controller, playerId)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "If an opponent searched his or her library this turn";
    }
    
}
