package mage.cards.a01Custom;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.combat.CantBeBlockedSourceEffect;
import mage.abilities.keyword.InspiredAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Zone;

/**
 *
 * @author Entercyber
 */
public class MerfolkCrawler extends CardImpl {
    
    public MerfolkCrawler(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[] { CardType.CREATURE }, "{U}");
        this.subtype.add("Merfolk");
        this.subtype.add("Crawler");
        this.rarity = rarity.RARE;
        this.power = new MageInt(0);
        this.toughness = new MageInt(1);
        
        this.addAbility(new InspiredAbility(new DrawCardSourceControllerEffect(1)));
        
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD,
                new CantBeBlockedSourceEffect(Duration.EndOfTurn),
                new ManaCostsImpl<>("{3}{U}")));
    }
    
    public MerfolkCrawler(final MerfolkCrawler original){
        super(original);
    }
    
    @Override
    public Card copy() {
        return new MerfolkCrawler(this);
    }
}
