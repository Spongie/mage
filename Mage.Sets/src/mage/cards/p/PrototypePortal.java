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
package mage.cards.p;

import java.util.UUID;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.VariableCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.costs.mana.ManaCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.EmptyToken;
import mage.players.Player;
import mage.target.TargetCard;
import mage.util.CardUtil;

/**
 * @author nantuko
 */
public class PrototypePortal extends CardImpl {

    public PrototypePortal(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{4}");

        // Imprint - When Prototype Portal enters the battlefield, you may exile an artifact card from your hand.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new PrototypePortalEffect(), true));

        // {X}, {tap}: Put a token that's a copy of the exiled card onto the battlefield. X is the converted mana cost of that card.
        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, new PrototypePortalCreateTokenEffect(), new ManaCostsImpl("{X}"));
        ability.addCost(new TapSourceCost());
        this.addAbility(ability);
    }

    public PrototypePortal(final PrototypePortal card) {
        super(card);
    }

    @Override
    public void adjustCosts(Ability ability, Game game) {
        Permanent card = game.getPermanent(ability.getSourceId());
        if (card != null) {
            if (card.getImprinted().size() > 0) {
                Card imprinted = game.getCard(card.getImprinted().get(0));
                if (imprinted != null) {
                    ability.getManaCostsToPay().add(0, new GenericManaCost(imprinted.getConvertedManaCost()));
                }
            }
        }

        // no {X} anymore as we already have imprinted the card with defined manacost
        for (ManaCost cost : ability.getManaCostsToPay()) {
            if (cost instanceof VariableCost) {
                cost.setPaid();
            }
        }
    }

    @Override
    public PrototypePortal copy() {
        return new PrototypePortal(this);
    }
}

class PrototypePortalEffect extends OneShotEffect {

    public PrototypePortalEffect() {
        super(Outcome.Benefit);
        staticText = "exile an artifact card from your hand";
    }

    public PrototypePortalEffect(PrototypePortalEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        MageObject sourceObject = game.getObject(source.getSourceId());
        if (controller != null && sourceObject != null) {
            if (controller.getHand().size() > 0) {
                TargetCard target = new TargetCard(Zone.HAND, StaticFilters.FILTER_CARD_ARTIFACT);
                controller.choose(Outcome.Benefit, controller.getHand(), target, game);
                Card card = controller.getHand().get(target.getFirstTarget(), game);
                if (card != null) {
                    controller.moveCardsToExile(card, source, game, true, source.getSourceId(), sourceObject.getIdName() + " (Imprint)");
                    Permanent permanent = game.getPermanent(source.getSourceId());
                    if (permanent != null) {
                        permanent.imprint(card.getId(), game);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public PrototypePortalEffect copy() {
        return new PrototypePortalEffect(this);
    }

}

class PrototypePortalCreateTokenEffect extends OneShotEffect {

    public PrototypePortalCreateTokenEffect() {
        super(Outcome.PutCreatureInPlay);
        this.staticText = "Put a token that's a copy of the exiled card onto the battlefield. X is the converted mana cost of that card";
    }

    public PrototypePortalCreateTokenEffect(final PrototypePortalCreateTokenEffect effect) {
        super(effect);
    }

    @Override
    public PrototypePortalCreateTokenEffect copy() {
        return new PrototypePortalCreateTokenEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Permanent permanent = game.getPermanent(source.getSourceId());
        if (permanent == null) {
            return false;
        }

        if (permanent.getImprinted().size() > 0) {
            Card card = game.getCard(permanent.getImprinted().get(0));
            if (card != null) {
                EmptyToken token = new EmptyToken();
                CardUtil.copyTo(token).from(card);
                token.putOntoBattlefield(1, game, source.getSourceId(), source.getControllerId());
                return true;
            }
        }

        return false;
    }

}
