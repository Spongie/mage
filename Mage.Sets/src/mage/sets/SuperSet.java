/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mage.sets;

import java.util.Date;
import mage.cards.ExpansionSet;
import mage.cards.a01Custom.ObergsWisdom;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Johan
 */
public class SuperSet extends ExpansionSet {
    
    private static final SuperSet fINSTANCE = new SuperSet();

    public static SuperSet getInstance() {
        return fINSTANCE;
    }
    
    public SuperSet(String name, String code, Date releaseDate, SetType setType) {
        super(name, code, releaseDate, setType);
    }
    
    private SuperSet(){
        super("TESTSET", "TST", ExpansionSet.buildDate(2000, 1, 1), SetType.CORE);
        
        this.blockName = "TESTSET";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        
        cards.add(new SetCardInfo("Öbergs Wisdom", 1, Rarity.MYTHIC, ObergsWisdom.class));
    }
    
}
