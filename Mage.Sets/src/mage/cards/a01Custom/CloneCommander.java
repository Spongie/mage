package mage.cards.a01Custom;

import java.util.List;
import java.util.UUID;
import mage.MageInt;
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
import mage.game.permanent.Permanent;
import mage.game.permanent.PermanentCard;
import mage.game.permanent.token.EmptyToken;
import mage.players.Player;
import mage.util.CardUtil;

/**
 *
 * @author Entercyber
 */
public class CloneCommander extends CardImpl {

    public CloneCommander(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[] { CardType.CREATURE }, "{G}{U}{B}{4}");
        this.subtype.add("Demon");
        this.rarity = rarity.MYTHIC;
        this.power = new MageInt(3);
        this.toughness = new MageInt(6);
        this.supertype.add("Legendary");
        
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(new CloneCommanderEffect(), TargetController.YOU, false));
    }
    
    public CloneCommander(final CloneCommander original){
        super(original);
    }
    
    @Override
    public Card copy() {
        return new CloneCommander(this);
    }
}

class CloneCommanderEffect extends OneShotEffect{
    
    public CloneCommanderEffect(){
        super(Outcome.PutCreatureInPlay);
        staticText = "for each other creature you control, put a token onto the battlefield thats a copy of that creature";
    }

    public CloneCommanderEffect(final CloneCommanderEffect original){
        super(original);
    }
    
    @Override
    public boolean apply(Game game, Ability source) {
        
        Player controller = game.getPlayer(source.getControllerId());
        List<Permanent> allPermanents = game.getBattlefield().getAllActivePermanents(controller.getId());
        
        for (int i = 0; i < allPermanents.size(); i++){
            Permanent permanent = allPermanents.get(i);
            
            
            if (((PermanentCard)permanent).getCard().getClass() == CloneCommander.class){
                continue;
            }
            
            if (permanent.getCardType().contains(CardType.CREATURE)){
                EmptyToken token = new EmptyToken();
                CardUtil.copyTo(token).from(permanent);
                
                token.putOntoBattlefield(1, game, source.getSourceId(), source.getControllerId());
            }
        }
        
        return true;
    }

    @Override
    public Effect copy() {
        return new CloneCommanderEffect(this);
    }
    
}