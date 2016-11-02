package mage.cards.a01Custom;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.game.Game;
import mage.players.Player;

/**
 *
 * @author Entercyber
 */
public class SoulCollection extends CardImpl {
    
    public SoulCollection(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{B}{B}");  
        
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(new SoulCollectionTriggeredAbility(), TargetController.YOU, false));
    }
    
    public SoulCollection(final SoulCollection original) {
        super(original);
    }
    
    @Override
    public Card copy() {
        return new SoulCollection(this);
    }
}

class SoulCollectionTriggeredAbility extends OneShotEffect {

    public SoulCollectionTriggeredAbility(final SoulCollectionTriggeredAbility ability){
        super(ability);
    }
    
    public SoulCollectionTriggeredAbility() {
        super(Outcome.DrawCard);
        staticText = "loose half your life (rounded up) draw that many cards";
    }

    @Override
    public boolean apply(Game game, Ability source) {
        
        Player player = game.getPlayer(source.getControllerId());
        
        if (player != null) {
            int amount = (player.getLife() + 1) / 2;
            
            if (amount > 0) {
                player.loseLife(amount, game, false);
                
                player.drawCards(amount, game);
                
                return true;
            }
        }
        
        return false;
    }

    @Override
    public Effect copy() {
        return new SoulCollectionTriggeredAbility(this);
    }
}
