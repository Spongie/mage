package mage.cards.a01Custom;

import java.util.UUID;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.keyword.StormAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

public class BrainPower extends CardImpl {
    
    public BrainPower(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{B}{U}");

        this.getSpellAbility().addEffect(new DrawCardSourceControllerEffect(1));
        this.addAbility(new StormAbility());
    }
    
    public BrainPower(final BrainPower original) {
        super(original);
    }
    
    @Override
    public Card copy() {
        return new BrainPower(this);
    }
    
}
