/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mage.cards.a01Custom;

import java.util.UUID;

import mage.constants.CardType;
import mage.ObjectColor;
import mage.abilities.Ability;
import mage.abilities.DelayedTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.mana.ManaCosts;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.DrawCardTargetEffect;
import mage.abilities.effects.common.continuous.BoostAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.Rarity;
import mage.constants.Zone;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.mageobject.ColorPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.players.Player;

public class ObergsWisdom extends CardImpl {
    
    public ObergsWisdom(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[] { CardType.SORCERY}, "{U}");
        this.rarity = Rarity.MYTHIC;
        this.getSpellAbility().addEffect(new DrawCardSourceControllerEffect(7));
        this.getSpellAbility().addEffect(new CreateDelayedTriggeredAbilityEffect(new ObergsWisdomTriggeredAbility(), false));
    }
    
    public ObergsWisdom(final ObergsWisdom card) {
        super(card);
    }
    
    @Override
    public ObergsWisdom copy() {
        return new ObergsWisdom(this);
    }
}

class ObergsWisdomTriggeredAbility extends DelayedTriggeredAbility {

    public ObergsWisdomTriggeredAbility() {
        super(new ObergsWisdomEffect());
    }

    public ObergsWisdomTriggeredAbility(ObergsWisdomTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public ObergsWisdomTriggeredAbility copy() {
        return new ObergsWisdomTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.END_TURN_STEP_PRE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        return game.getActivePlayerId().equals(this.getControllerId());
    }

    @Override
    public String getRule() {
        return "At the beginning of your next endstep you lose the game,  lul.";
    }
}

class ObergsWisdomEffect extends OneShotEffect {


    public ObergsWisdomEffect() {
        super(Outcome.Neutral);
        staticText = "you lose the game";
    }

    public ObergsWisdomEffect(final ObergsWisdomEffect effect) {
        super(effect);
    }

    @Override
    public ObergsWisdomEffect copy() {
        return new ObergsWisdomEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player != null) {
            player.lost(game);
            return true;
        }
        return false;
    }

    

}
