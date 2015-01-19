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
package mage.sets.fatereforged;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.costs.mana.ManaCost;
import mage.abilities.costs.mana.ManaCosts;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continious.BecomesFaceDownCreatureEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.Rarity;
import mage.constants.Zone;
import mage.filter.common.FilterCreatureCard;
import mage.game.Game;
import mage.game.events.ZoneChangeEvent;
import mage.game.permanent.PermanentCard;
import mage.players.Player;
import mage.target.TargetPlayer;
import mage.target.targetpointer.FixedTarget;

/**
 *
 * @author LevelX2
 */
public class GhastlyConscription extends CardImpl {

    public GhastlyConscription(UUID ownerId) {
        super(ownerId, 70, "Ghastly Conscription", Rarity.MYTHIC, new CardType[]{CardType.SORCERY}, "{5}{B}{B}");
        this.expansionSetCode = "FRF";

        // Exile all creature cards from target player's graveyard in a face-down pile, shuffle that pile, then manifest those cards.<i> (To manifest a card, put it onto the battlefield face down as a 2/2 creature. Turn it face up at any time for its mana cost if it's a creature card.)</i>
        this.getSpellAbility().addEffect(new GhastlyConscriptionEffect());
        this.getSpellAbility().addTarget(new TargetPlayer());
    }

    public GhastlyConscription(final GhastlyConscription card) {
        super(card);
    }

    @Override
    public GhastlyConscription copy() {
        return new GhastlyConscription(this);
    }
}

class GhastlyConscriptionEffect extends OneShotEffect {

    public GhastlyConscriptionEffect() {
        super(Outcome.PutCreatureInPlay);
        this.staticText = "Exile all creature cards from target player's graveyard in a face-down pile, shuffle that pile, then manifest those cards.<i> (To manifest a card, put it onto the battlefield face down as a 2/2 creature. Turn it face up at any time for its mana cost if it's a creature card.)</i>";
    }

    public GhastlyConscriptionEffect(final GhastlyConscriptionEffect effect) {
        super(effect);
    }

    @Override
    public GhastlyConscriptionEffect copy() {
        return new GhastlyConscriptionEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        Player targetPlayer = game.getPlayer(getTargetPointer().getFirst(game, source));
        if (controller != null && targetPlayer != null) {
            ArrayList<Card> cardsToManifest = new ArrayList<>();
            for(Card card: targetPlayer.getGraveyard().getCards(new FilterCreatureCard(), game)) {
                cardsToManifest.add(card);
                controller.moveCardToExileWithInfo(card, null, "", source.getSourceId(), game, Zone.GRAVEYARD);
                card.setFaceDown(true);
            }
            Collections.shuffle(cardsToManifest);
            game.informPlayers(controller.getName() + " shuffles the face-down pile");
            for (Card card: cardsToManifest) {
                //Manual zone change to keep the cards face-down.
                ZoneChangeEvent event = new ZoneChangeEvent(card.getId(), source.getSourceId(), source.getControllerId(), Zone.EXILED, Zone.BATTLEFIELD);
                if (!game.replaceEvent(event)) {
                    game.getExile().removeCard(card, game);
                    game.rememberLKI(card.getId(), event.getFromZone(), card);
                    PermanentCard permanent = new PermanentCard(card, event.getPlayerId());
                    game.addPermanent(permanent);
                    game.setZone(card.getId(), Zone.BATTLEFIELD);
                    game.setScopeRelevant(true);
                    permanent.entersBattlefield(source.getSourceId(), game, event.getFromZone(), true);
                    game.setScopeRelevant(false);
                    game.applyEffects();
                    game.fireEvent(new ZoneChangeEvent(permanent, event.getPlayerId(), Zone.EXILED, Zone.BATTLEFIELD));
                    ManaCosts<ManaCost> manaCosts = null;
                    if (card.getCardType().contains(CardType.CREATURE)) {
                        manaCosts = card.getSpellAbility().getManaCosts();
                        if (manaCosts == null) {
                            manaCosts = new ManaCostsImpl<>("{0}");
                        }
                    }
                    ContinuousEffect effect = new BecomesFaceDownCreatureEffect(manaCosts, true, Duration.Custom);
                    effect.setTargetPointer(new FixedTarget(card.getId()));
                    game.addEffect(effect, source);
                    game.informPlayers(controller.getName() + " puts facedown card from exile onto the battlefield");
                }
            }
            return true;
        }
        return false;
    }
}