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
package mage.cards.f;

import java.util.UUID;

import mage.constants.CardType;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.predicate.mageobject.CardTypePredicate;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.SaprolingToken;
import mage.players.Player;

/**
 *
 * @author jeffwadsworth
 */
public class FungalSprouting extends CardImpl {

    public FungalSprouting(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{3}{G}");


        // Put X 1/1 green Saproling creature tokens onto the battlefield, where X is the greatest power among creatures you control.
        this.getSpellAbility().addEffect(new FungalSproutingEffect());
    }

    public FungalSprouting(final FungalSprouting card) {
        super(card);
    }

    @Override
    public FungalSprouting copy() {
        return new FungalSprouting(this);
    }
}

class FungalSproutingEffect extends OneShotEffect {
    
    private static final FilterPermanent filter = new FilterPermanent();
    
    static {
        filter.add(new CardTypePredicate(CardType.CREATURE));
        filter.add(new ControllerPredicate(TargetController.YOU));
    }

    public FungalSproutingEffect() {
        super(Outcome.PutCreatureInPlay);
        this.staticText = "Put X 1/1 green Saproling creature tokens onto the battlefield, where X is the greatest power among creatures you control";
    }

    public FungalSproutingEffect(final FungalSproutingEffect effect) {
        super(effect);
    }

    @Override
    public FungalSproutingEffect copy() {
        return new FungalSproutingEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player != null) {
            int amount = 0;
            for (Permanent p : game.getBattlefield().getActivePermanents(new FilterControlledCreaturePermanent(), source.getControllerId(), game)) {
                if (p.getPower().getValue() > amount)
                    amount = p.getPower().getValue();
            }
            SaprolingToken token = new SaprolingToken();
            token.putOntoBattlefield(amount, game, source.getSourceId(), source.getControllerId());
            return true;
        }
        return false;
    }
}
