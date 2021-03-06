/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
*/

package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.SetType;
import mage.constants.Rarity;

/**
 *
 * @author fireshoes
 */
public class EternalMasters extends ExpansionSet {

    private static final EternalMasters fINSTANCE = new EternalMasters();

    public static EternalMasters getInstance() {
        return fINSTANCE;
    }

    private EternalMasters() {
        super("Eternal Masters", "EMA", ExpansionSet.buildDate(2016, 6, 10), SetType.SUPPLEMENTAL);
        this.blockName = "Reprint";
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Abundant Growth", 156, Rarity.COMMON, mage.cards.a.AbundantGrowth.class));
        cards.add(new SetCardInfo("Ancestral Mask", 157, Rarity.UNCOMMON, mage.cards.a.AncestralMask.class));
        cards.add(new SetCardInfo("Animate Dead", 78, Rarity.UNCOMMON, mage.cards.a.AnimateDead.class));
        cards.add(new SetCardInfo("Annihilate", 79, Rarity.UNCOMMON, mage.cards.a.Annihilate.class));
        cards.add(new SetCardInfo("Arcanis the Omnipotent", 39, Rarity.RARE, mage.cards.a.ArcanisTheOmnipotent.class));
        cards.add(new SetCardInfo("Argothian Enchantress", 158, Rarity.MYTHIC, mage.cards.a.ArgothianEnchantress.class));
        cards.add(new SetCardInfo("Armadillo Cloak", 195, Rarity.UNCOMMON, mage.cards.a.ArmadilloCloak.class));
        cards.add(new SetCardInfo("Ashnod's Altar", 218, Rarity.UNCOMMON, mage.cards.a.AshnodsAltar.class));
        cards.add(new SetCardInfo("Avarax", 117, Rarity.COMMON, mage.cards.a.Avarax.class));
        cards.add(new SetCardInfo("Aven Riftwatcher", 1, Rarity.COMMON, mage.cards.a.AvenRiftwatcher.class));
        cards.add(new SetCardInfo("Balance", 2, Rarity.MYTHIC, mage.cards.b.Balance.class));
        cards.add(new SetCardInfo("Baleful Strix", 196, Rarity.RARE, mage.cards.b.BalefulStrix.class));
        cards.add(new SetCardInfo("Ballynock Cohort", 3, Rarity.COMMON, mage.cards.b.BallynockCohort.class));
        cards.add(new SetCardInfo("Battle Squadron", 118, Rarity.UNCOMMON, mage.cards.b.BattleSquadron.class));
        cards.add(new SetCardInfo("Beetleback Chief", 119, Rarity.UNCOMMON, mage.cards.b.BeetlebackChief.class));
        cards.add(new SetCardInfo("Benevolent Bodyguard", 4, Rarity.COMMON, mage.cards.b.BenevolentBodyguard.class));
        cards.add(new SetCardInfo("Blightsoil Druid", 80, Rarity.COMMON, mage.cards.b.BlightsoilDruid.class));
        cards.add(new SetCardInfo("Blood Artist", 81, Rarity.UNCOMMON, mage.cards.b.BloodArtist.class));
        cards.add(new SetCardInfo("Bloodbraid Elf", 197, Rarity.UNCOMMON, mage.cards.b.BloodbraidElf.class));
        cards.add(new SetCardInfo("Bloodfell Caves", 236, Rarity.COMMON, mage.cards.b.BloodfellCaves.class));
        cards.add(new SetCardInfo("Blossoming Sands", 237, Rarity.COMMON, mage.cards.b.BlossomingSands.class));
        cards.add(new SetCardInfo("Borderland Marauder", 120, Rarity.COMMON, mage.cards.b.BorderlandMarauder.class));
        cards.add(new SetCardInfo("Brago, King Eternal", 198, Rarity.RARE, mage.cards.b.BragoKingEternal.class));
        cards.add(new SetCardInfo("Braids, Cabal Minion", 82, Rarity.RARE, mage.cards.b.BraidsCabalMinion.class));
        cards.add(new SetCardInfo("Brainstorm", 40, Rarity.UNCOMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Brawn", 159, Rarity.UNCOMMON, mage.cards.b.Brawn.class));
        cards.add(new SetCardInfo("Burning Vengeance", 121, Rarity.UNCOMMON, mage.cards.b.BurningVengeance.class));
        cards.add(new SetCardInfo("Cabal Therapy", 83, Rarity.UNCOMMON, mage.cards.c.CabalTherapy.class));
        cards.add(new SetCardInfo("Calciderm", 5, Rarity.UNCOMMON, mage.cards.c.Calciderm.class));
        cards.add(new SetCardInfo("Call the Skybreaker", 214, Rarity.RARE, mage.cards.c.CallTheSkybreaker.class));
        cards.add(new SetCardInfo("Carbonize", 122, Rarity.COMMON, mage.cards.c.Carbonize.class));
        cards.add(new SetCardInfo("Carrion Feeder", 84, Rarity.COMMON, mage.cards.c.CarrionFeeder.class));
        cards.add(new SetCardInfo("Centaur Chieftain", 160, Rarity.UNCOMMON, mage.cards.c.CentaurChieftain.class));
        cards.add(new SetCardInfo("Cephalid Sage", 41, Rarity.COMMON, mage.cards.c.CephalidSage.class));
        cards.add(new SetCardInfo("Chain Lightning", 123, Rarity.UNCOMMON, mage.cards.c.ChainLightning.class));
        cards.add(new SetCardInfo("Chrome Mox", 219, Rarity.MYTHIC, mage.cards.c.ChromeMox.class));
        cards.add(new SetCardInfo("Civic Wayfinder", 161, Rarity.COMMON, mage.cards.c.CivicWayfinder.class));
	cards.add(new SetCardInfo("Coalition Honor Guard", 6, Rarity.COMMON, mage.cards.c.CoalitionHonorGuard.class));
        cards.add(new SetCardInfo("Commune with the Gods", 162, Rarity.COMMON, mage.cards.c.CommuneWithTheGods.class));
        cards.add(new SetCardInfo("Control Magic", 42, Rarity.RARE, mage.cards.c.ControlMagic.class));
        cards.add(new SetCardInfo("Counterspell", 43, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Crater Hellion", 124, Rarity.RARE, mage.cards.c.CraterHellion.class));
        cards.add(new SetCardInfo("Dack Fayden", 199, Rarity.MYTHIC, mage.cards.d.DackFayden.class));
        cards.add(new SetCardInfo("Daze", 44, Rarity.UNCOMMON, mage.cards.d.Daze.class));
        cards.add(new SetCardInfo("Deadbridge Shaman", 85, Rarity.COMMON, mage.cards.d.DeadbridgeShaman.class));
        cards.add(new SetCardInfo("Deathrite Shaman", 215, Rarity.RARE, mage.cards.d.DeathriteShaman.class));
        cards.add(new SetCardInfo("Deep Analysis", 45, Rarity.COMMON, mage.cards.d.DeepAnalysis.class));
        cards.add(new SetCardInfo("Desperate Ravings", 125, Rarity.COMMON, mage.cards.d.DesperateRavings.class));
        cards.add(new SetCardInfo("Diminishing Returns", 46, Rarity.RARE, mage.cards.d.DiminishingReturns.class));
        cards.add(new SetCardInfo("Dismal Backwater", 238, Rarity.COMMON, mage.cards.d.DismalBackwater.class));
        cards.add(new SetCardInfo("Dragon Egg", 126, Rarity.COMMON, mage.cards.d.DragonEgg.class));
        cards.add(new SetCardInfo("Dream Twist", 47, Rarity.COMMON, mage.cards.d.DreamTwist.class));
        cards.add(new SetCardInfo("Dualcaster Mage", 127, Rarity.RARE, mage.cards.d.DualcasterMage.class));
        cards.add(new SetCardInfo("Duplicant", 220, Rarity.RARE, mage.cards.d.Duplicant.class));
        cards.add(new SetCardInfo("Duress", 86, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Eight-and-a-Half-Tails", 7, Rarity.RARE, mage.cards.e.EightAndAHalfTails.class));
        cards.add(new SetCardInfo("Elephant Guide", 163, Rarity.COMMON, mage.cards.e.ElephantGuide.class));
        cards.add(new SetCardInfo("Elite Vanguard", 8, Rarity.COMMON, mage.cards.e.EliteVanguard.class));
        cards.add(new SetCardInfo("Elvish Vanguard", 164, Rarity.COMMON, mage.cards.e.ElvishVanguard.class));
        cards.add(new SetCardInfo("Emmessi Tome", 221, Rarity.UNCOMMON, mage.cards.e.EmmessiTome.class));
        cards.add(new SetCardInfo("Emperor Crocodile", 165, Rarity.COMMON, mage.cards.e.EmperorCrocodile.class));
        cards.add(new SetCardInfo("Enlightened Tutor", 9, Rarity.RARE, mage.cards.e.EnlightenedTutor.class));
        cards.add(new SetCardInfo("Entomb", 87, Rarity.RARE, mage.cards.e.Entomb.class));
        cards.add(new SetCardInfo("Extract from Darkness", 200, Rarity.UNCOMMON, mage.cards.e.ExtractFromDarkness.class));
        cards.add(new SetCardInfo("Eyeblight's Ending", 88, Rarity.COMMON, mage.cards.e.EyeblightsEnding.class));
        cards.add(new SetCardInfo("Fact or Fiction", 48, Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Faithless Looting", 128, Rarity.COMMON, mage.cards.f.FaithlessLooting.class));
        cards.add(new SetCardInfo("Faith's Fetters", 10, Rarity.UNCOMMON, mage.cards.f.FaithsFetters.class));
        cards.add(new SetCardInfo("Fervent Cathar", 129, Rarity.COMMON, mage.cards.f.FerventCathar.class));
        cards.add(new SetCardInfo("Field of Souls", 11, Rarity.UNCOMMON, mage.cards.f.FieldOfSouls.class));
        cards.add(new SetCardInfo("Firebolt", 130, Rarity.COMMON, mage.cards.f.Firebolt.class));
        cards.add(new SetCardInfo("Flame Jab", 131, Rarity.UNCOMMON, mage.cards.f.FlameJab.class));
        cards.add(new SetCardInfo("Flame-Kin Zealot", 201, Rarity.UNCOMMON, mage.cards.f.FlameKinZealot.class));
        cards.add(new SetCardInfo("Flinthoof Boar", 166, Rarity.UNCOMMON, mage.cards.f.FlinthoofBoar.class));
        cards.add(new SetCardInfo("Fog", 167, Rarity.COMMON, mage.cards.f.Fog.class));
        cards.add(new SetCardInfo("Force of Will", 49, Rarity.MYTHIC, mage.cards.f.ForceOfWill.class));
        cards.add(new SetCardInfo("Future Sight", 50, Rarity.RARE, mage.cards.f.FutureSight.class));
        cards.add(new SetCardInfo("Gaea's Blessing", 168, Rarity.UNCOMMON, mage.cards.g.GaeasBlessing.class));
        cards.add(new SetCardInfo("Gamble", 132, Rarity.RARE, mage.cards.g.Gamble.class));
        cards.add(new SetCardInfo("Gaseous Form", 51, Rarity.COMMON, mage.cards.g.GaseousForm.class));
        cards.add(new SetCardInfo("Ghitu Slinger", 133, Rarity.UNCOMMON, mage.cards.g.GhituSlinger.class));
        cards.add(new SetCardInfo("Giant Solifuge", 216, Rarity.RARE, mage.cards.g.GiantSolifuge.class));
        cards.add(new SetCardInfo("Giant Tortoise", 52, Rarity.COMMON, mage.cards.g.GiantTortoise.class));
        cards.add(new SetCardInfo("Glacial Wall", 53, Rarity.COMMON, mage.cards.g.GlacialWall.class));
        cards.add(new SetCardInfo("Glare of Subdual", 202, Rarity.RARE, mage.cards.g.GlareOfSubdual.class));
        cards.add(new SetCardInfo("Glimmerpoint Stag", 12, Rarity.UNCOMMON, mage.cards.g.GlimmerpointStag.class));
        cards.add(new SetCardInfo("Goblin Charbelcher", 222, Rarity.RARE, mage.cards.g.GoblinCharbelcher.class));
        cards.add(new SetCardInfo("Goblin Trenches", 203, Rarity.RARE, mage.cards.g.GoblinTrenches.class));
        cards.add(new SetCardInfo("Gravedigger", 89, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Green Sun's Zenith", 169, Rarity.RARE, mage.cards.g.GreenSunsZenith.class));
        cards.add(new SetCardInfo("Harmonize", 170, Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Havoc Demon", 90, Rarity.UNCOMMON, mage.cards.h.HavocDemon.class));
        cards.add(new SetCardInfo("Heritage Druid", 171, Rarity.RARE, mage.cards.h.HeritageDruid.class));
        cards.add(new SetCardInfo("Honden of Cleansing Fire", 13, Rarity.UNCOMMON, mage.cards.h.HondenOfCleansingFire.class));
        cards.add(new SetCardInfo("Honden of Infinite Rage", 134, Rarity.UNCOMMON, mage.cards.h.HondenOfInfiniteRage.class));
        cards.add(new SetCardInfo("Honden of Life's Web", 172, Rarity.UNCOMMON, mage.cards.h.HondenOfLifesWeb.class));
        cards.add(new SetCardInfo("Honden of Night's Reach", 91, Rarity.UNCOMMON, mage.cards.h.HondenOfNightsReach.class));
        cards.add(new SetCardInfo("Honden of Seeing Winds", 54, Rarity.UNCOMMON, mage.cards.h.HondenOfSeeingWinds.class));
        cards.add(new SetCardInfo("Humble", 14, Rarity.COMMON, mage.cards.h.Humble.class));
        cards.add(new SetCardInfo("Hydroblast", 55, Rarity.UNCOMMON, mage.cards.h.Hydroblast.class));
        cards.add(new SetCardInfo("Hymn to Tourach", 92, Rarity.UNCOMMON, mage.cards.h.HymnToTourach1.class));
        cards.add(new SetCardInfo("Ichorid", 93, Rarity.RARE, mage.cards.i.Ichorid.class));
        cards.add(new SetCardInfo("Imperious Perfect", 173, Rarity.RARE, mage.cards.i.ImperiousPerfect.class));
        cards.add(new SetCardInfo("Inkwell Leviathan", 56, Rarity.RARE, mage.cards.i.InkwellLeviathan.class));
        cards.add(new SetCardInfo("Innocent Blood", 94, Rarity.COMMON, mage.cards.i.InnocentBlood.class));
        cards.add(new SetCardInfo("Intangible Virtue", 15, Rarity.UNCOMMON, mage.cards.i.IntangibleVirtue.class));
        cards.add(new SetCardInfo("Invigorate", 174, Rarity.UNCOMMON, mage.cards.i.Invigorate.class));
        cards.add(new SetCardInfo("Isochron Scepter", 223, Rarity.RARE, mage.cards.i.IsochronScepter.class));
        cards.add(new SetCardInfo("Jace, the Mind Sculptor", 57, Rarity.MYTHIC, mage.cards.j.JaceTheMindSculptor.class));
        cards.add(new SetCardInfo("Jareth, Leonine Titan", 16, Rarity.RARE, mage.cards.j.JarethLeonineTitan.class));
        cards.add(new SetCardInfo("Jetting Glasskite", 58, Rarity.UNCOMMON, mage.cards.j.JettingGlasskite.class));
        cards.add(new SetCardInfo("Juggernaut", 224, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Jungle Hollow", 239, Rarity.COMMON, mage.cards.j.JungleHollow.class));
        cards.add(new SetCardInfo("Karakas", 240, Rarity.MYTHIC, mage.cards.k.Karakas.class));
        cards.add(new SetCardInfo("Karmic Guide", 17, Rarity.RARE, mage.cards.k.KarmicGuide.class));
        cards.add(new SetCardInfo("Keldon Champion", 135, Rarity.UNCOMMON, mage.cards.k.KeldonChampion.class));
        cards.add(new SetCardInfo("Keldon Marauders", 136, Rarity.COMMON, mage.cards.k.KeldonMarauders.class));
        cards.add(new SetCardInfo("Kird Ape", 137, Rarity.COMMON, mage.cards.k.KirdApe.class));
        cards.add(new SetCardInfo("Kor Hookmaster", 18, Rarity.COMMON, mage.cards.k.KorHookmaster.class));
        cards.add(new SetCardInfo("Llanowar Elves", 175, Rarity.COMMON, mage.cards.l.LlanowarElves.class));
        cards.add(new SetCardInfo("Lys Alana Huntmaster", 176, Rarity.COMMON, mage.cards.l.LysAlanaHuntmaster.class));
        cards.add(new SetCardInfo("Lys Alana Scarblade", 95, Rarity.UNCOMMON, mage.cards.l.LysAlanaScarblade.class));
        cards.add(new SetCardInfo("Maelstrom Wanderer", 204, Rarity.MYTHIC, mage.cards.m.MaelstromWanderer.class));
        cards.add(new SetCardInfo("Malicious Affliction", 96, Rarity.RARE, mage.cards.m.MaliciousAffliction.class));
        cards.add(new SetCardInfo("Mana Crypt", 225, Rarity.MYTHIC, mage.cards.m.ManaCrypt.class));
        cards.add(new SetCardInfo("Man-o'-War", 59, Rarity.COMMON, mage.cards.m.ManOWar.class));
        cards.add(new SetCardInfo("Maze of Ith", 241, Rarity.RARE, mage.cards.m.MazeOfIth.class));
        cards.add(new SetCardInfo("Memory Lapse", 60, Rarity.COMMON, mage.cards.m.MemoryLapse.class));
        cards.add(new SetCardInfo("Merfolk Looter", 61, Rarity.UNCOMMON, mage.cards.m.MerfolkLooter.class));
        cards.add(new SetCardInfo("Mesa Enchantress", 19, Rarity.UNCOMMON, mage.cards.m.MesaEnchantress.class));
        cards.add(new SetCardInfo("Millikin", 226, Rarity.UNCOMMON, mage.cards.m.Millikin.class));
        cards.add(new SetCardInfo("Mindless Automaton", 227, Rarity.UNCOMMON, mage.cards.m.MindlessAutomaton.class));
        cards.add(new SetCardInfo("Mishra's Factory", 242, Rarity.UNCOMMON, mage.cards.m.MishrasFactory.class));
        cards.add(new SetCardInfo("Mistral Charger", 20, Rarity.COMMON, mage.cards.m.MistralCharger.class));
        cards.add(new SetCardInfo("Mogg Fanatic", 138, Rarity.COMMON, mage.cards.m.MoggFanatic.class));
        cards.add(new SetCardInfo("Mogg War Marshal", 139, Rarity.COMMON, mage.cards.m.MoggWarMarshal.class));
        cards.add(new SetCardInfo("Monk Idealist", 21, Rarity.COMMON, mage.cards.m.MonkIdealist.class));
        cards.add(new SetCardInfo("Mother of Runes", 22, Rarity.RARE, mage.cards.m.MotherOfRunes.class));
        cards.add(new SetCardInfo("Mystical Tutor", 62, Rarity.RARE, mage.cards.m.MysticalTutor.class));
        cards.add(new SetCardInfo("Natural Order", 177, Rarity.MYTHIC, mage.cards.n.NaturalOrder.class));
        cards.add(new SetCardInfo("Nature's Claim", 178, Rarity.COMMON, mage.cards.n.NaturesClaim.class));
        cards.add(new SetCardInfo("Nausea", 97, Rarity.COMMON, mage.cards.n.Nausea.class));
        cards.add(new SetCardInfo("Necropotence", 98, Rarity.MYTHIC, mage.cards.n.Necropotence.class));
        cards.add(new SetCardInfo("Nekrataal", 99, Rarity.UNCOMMON, mage.cards.n.Nekrataal.class));
        cards.add(new SetCardInfo("Nevinyrral's Disk", 228, Rarity.RARE, mage.cards.n.NevinyrralsDisk.class));
        cards.add(new SetCardInfo("Night's Whisper", 100, Rarity.COMMON, mage.cards.n.NightsWhisper.class));
        cards.add(new SetCardInfo("Nimble Mongoose", 179, Rarity.COMMON, mage.cards.n.NimbleMongoose.class));
        cards.add(new SetCardInfo("Oona's Grace", 63, Rarity.COMMON, mage.cards.o.OonasGrace.class));
        cards.add(new SetCardInfo("Orcish Oriflamme", 140, Rarity.COMMON, mage.cards.o.OrcishOriflamme.class));
        cards.add(new SetCardInfo("Pacifism", 23, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Peregrine Drake", 64, Rarity.COMMON, mage.cards.p.PeregrineDrake.class));
        cards.add(new SetCardInfo("Phantom Monster", 65, Rarity.COMMON, mage.cards.p.PhantomMonster.class));
        cards.add(new SetCardInfo("Phyrexian Gargantua", 101, Rarity.UNCOMMON, mage.cards.p.PhyrexianGargantua.class));
        cards.add(new SetCardInfo("Phyrexian Ingester", 66, Rarity.UNCOMMON, mage.cards.p.PhyrexianIngester.class));
        cards.add(new SetCardInfo("Phyrexian Rager", 102, Rarity.COMMON, mage.cards.p.PhyrexianRager.class));
        cards.add(new SetCardInfo("Pilgrim's Eye", 229, Rarity.COMMON, mage.cards.p.PilgrimsEye.class));
        cards.add(new SetCardInfo("Plague Witch", 103, Rarity.COMMON, mage.cards.p.PlagueWitch.class));
        cards.add(new SetCardInfo("Price of Progress", 141, Rarity.UNCOMMON, mage.cards.p.PriceOfProgress.class));
        cards.add(new SetCardInfo("Prismatic Lens", 230, Rarity.UNCOMMON, mage.cards.p.PrismaticLens.class));
        cards.add(new SetCardInfo("Prodigal Sorcerer", 67, Rarity.UNCOMMON, mage.cards.p.ProdigalSorcerer.class));
        cards.add(new SetCardInfo("Prowling Pangolin", 104, Rarity.COMMON, mage.cards.p.ProwlingPangolin.class));
        cards.add(new SetCardInfo("Pyroblast", 142, Rarity.UNCOMMON, mage.cards.p.Pyroblast.class));
        cards.add(new SetCardInfo("Pyrokinesis", 143, Rarity.RARE, mage.cards.p.Pyrokinesis.class));
        cards.add(new SetCardInfo("Quiet Speculation", 68, Rarity.UNCOMMON, mage.cards.q.QuietSpeculation.class));
        cards.add(new SetCardInfo("Raise the Alarm", 24, Rarity.COMMON, mage.cards.r.RaiseTheAlarm.class));
        cards.add(new SetCardInfo("Rally the Peasants", 25, Rarity.COMMON, mage.cards.r.RallyThePeasants.class));
        cards.add(new SetCardInfo("Rancor", 180, Rarity.UNCOMMON, mage.cards.r.Rancor.class));
        cards.add(new SetCardInfo("Reckless Charge", 144, Rarity.COMMON, mage.cards.r.RecklessCharge.class));
        cards.add(new SetCardInfo("Regal Force", 181, Rarity.RARE, mage.cards.r.RegalForce.class));
        cards.add(new SetCardInfo("Relic of Progenitus", 231, Rarity.UNCOMMON, mage.cards.r.RelicOfProgenitus.class));
        cards.add(new SetCardInfo("Roar of the Wurm", 182, Rarity.UNCOMMON, mage.cards.r.RoarOfTheWurm.class));
        cards.add(new SetCardInfo("Roots", 183, Rarity.COMMON, mage.cards.r.Roots.class));
        cards.add(new SetCardInfo("Rorix Bladewing", 145, Rarity.RARE, mage.cards.r.RorixBladewing.class));
        cards.add(new SetCardInfo("Rugged Highlands", 243, Rarity.COMMON, mage.cards.r.RuggedHighlands.class));
        cards.add(new SetCardInfo("Scoured Barrens", 244, Rarity.COMMON, mage.cards.s.ScouredBarrens.class));
        cards.add(new SetCardInfo("Screeching Skaab", 69, Rarity.COMMON, mage.cards.s.ScreechingSkaab.class));
        cards.add(new SetCardInfo("Seal of Cleansing", 26, Rarity.COMMON, mage.cards.s.SealOfCleansing.class));
        cards.add(new SetCardInfo("Seal of Strength", 184, Rarity.COMMON, mage.cards.s.SealOfStrength.class));
        cards.add(new SetCardInfo("Second Thoughts", 27, Rarity.COMMON, mage.cards.s.SecondThoughts.class));
        cards.add(new SetCardInfo("Seismic Stomp", 146, Rarity.COMMON, mage.cards.s.SeismicStomp.class));
        cards.add(new SetCardInfo("Sengir Autocrat", 105, Rarity.UNCOMMON, mage.cards.s.SengirAutocrat.class));
        cards.add(new SetCardInfo("Sensei's Divining Top", 232, Rarity.RARE, mage.cards.s.SenseisDiviningTop.class));
        cards.add(new SetCardInfo("Sentinel Spider", 185, Rarity.COMMON, mage.cards.s.SentinelSpider.class));
        cards.add(new SetCardInfo("Serendib Efreet", 70, Rarity.RARE, mage.cards.s.SerendibEfreet.class));
        cards.add(new SetCardInfo("Serra Angel", 28, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Shaman of the Pack", 205, Rarity.UNCOMMON, mage.cards.s.ShamanOfThePack.class));
        cards.add(new SetCardInfo("Shardless Agent", 206, Rarity.RARE, mage.cards.s.ShardlessAgent.class));
        cards.add(new SetCardInfo("Shelter", 29, Rarity.COMMON, mage.cards.s.Shelter.class));
        cards.add(new SetCardInfo("Shoreline Ranger", 71, Rarity.COMMON, mage.cards.s.ShorelineRanger.class));
        cards.add(new SetCardInfo("Siege-Gang Commander", 147, Rarity.RARE, mage.cards.s.SiegeGangCommander.class));
        cards.add(new SetCardInfo("Silent Departure", 72, Rarity.COMMON, mage.cards.s.SilentDeparture.class));
        cards.add(new SetCardInfo("Silvos, Rogue Elemental", 186, Rarity.RARE, mage.cards.s.SilvosRogueElemental.class));
        cards.add(new SetCardInfo("Sinkhole", 106, Rarity.RARE, mage.cards.s.Sinkhole.class));
        cards.add(new SetCardInfo("Skulking Ghost", 107, Rarity.COMMON, mage.cards.s.SkulkingGhost.class));
        cards.add(new SetCardInfo("Sneak Attack", 148, Rarity.MYTHIC, mage.cards.s.SneakAttack.class));
        cards.add(new SetCardInfo("Soulcatcher", 30, Rarity.UNCOMMON, mage.cards.s.Soulcatcher.class));
        cards.add(new SetCardInfo("Sphinx of the Steel Wind", 207, Rarity.MYTHIC, mage.cards.s.SphinxOfTheSteelWind.class));
        cards.add(new SetCardInfo("Sprite Noble", 73, Rarity.UNCOMMON, mage.cards.s.SpriteNoble.class));
        cards.add(new SetCardInfo("Squadron Hawk", 31, Rarity.COMMON, mage.cards.s.SquadronHawk.class));
        cards.add(new SetCardInfo("Stingscourger", 149, Rarity.COMMON, mage.cards.s.Stingscourger.class));
        cards.add(new SetCardInfo("Stupefying Touch", 74, Rarity.COMMON, mage.cards.s.StupefyingTouch.class));
        cards.add(new SetCardInfo("Sulfuric Vortex", 150, Rarity.RARE, mage.cards.s.SulfuricVortex.class));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 245, Rarity.COMMON, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 32, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Sylvan Library", 187, Rarity.RARE, mage.cards.s.SylvanLibrary.class));
        cards.add(new SetCardInfo("Sylvan Might", 188, Rarity.COMMON, mage.cards.s.SylvanMight.class));
        cards.add(new SetCardInfo("Thornweald Archer", 189, Rarity.COMMON, mage.cards.t.ThornwealdArcher.class));
        cards.add(new SetCardInfo("Thornwood Falls", 246, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thunderclap Wyvern", 208, Rarity.UNCOMMON, mage.cards.t.ThunderclapWyvern.class));
        cards.add(new SetCardInfo("Ticking Gnomes", 233, Rarity.UNCOMMON, mage.cards.t.TickingGnomes.class));
        cards.add(new SetCardInfo("Tidal Wave", 75, Rarity.COMMON, mage.cards.t.TidalWave.class));
        cards.add(new SetCardInfo("Timberwatch Elf", 190, Rarity.UNCOMMON, mage.cards.t.TimberwatchElf.class));
        cards.add(new SetCardInfo("Tooth and Claw", 151, Rarity.UNCOMMON, mage.cards.t.ToothAndClaw.class));
        cards.add(new SetCardInfo("Torrent of Souls", 217, Rarity.UNCOMMON, mage.cards.t.TorrentOfSouls.class));
        cards.add(new SetCardInfo("Toxic Deluge", 108, Rarity.RARE, mage.cards.t.ToxicDeluge.class));
        cards.add(new SetCardInfo("Tragic Slip", 109, Rarity.COMMON, mage.cards.t.TragicSlip.class));
        cards.add(new SetCardInfo("Tranquil Cove", 247, Rarity.COMMON, mage.cards.t.TranquilCove.class));
        cards.add(new SetCardInfo("Trygon Predator", 209, Rarity.UNCOMMON, mage.cards.t.TrygonPredator.class));
        cards.add(new SetCardInfo("Twisted Abomination", 110, Rarity.COMMON, mage.cards.t.TwistedAbomination.class));
        cards.add(new SetCardInfo("Undying Rage", 152, Rarity.COMMON, mage.cards.u.UndyingRage.class));
        cards.add(new SetCardInfo("Unexpectedly Absent", 33, Rarity.RARE, mage.cards.u.UnexpectedlyAbsent.class));
        cards.add(new SetCardInfo("Urborg Uprising", 111, Rarity.COMMON, mage.cards.u.UrborgUprising.class));
        cards.add(new SetCardInfo("Vampiric Tutor", 112, Rarity.MYTHIC, mage.cards.v.VampiricTutor.class));
        cards.add(new SetCardInfo("Victimize", 113, Rarity.UNCOMMON, mage.cards.v.Victimize.class));
        cards.add(new SetCardInfo("Vindicate", 210, Rarity.RARE, mage.cards.v.Vindicate.class));
        cards.add(new SetCardInfo("Visara the Dreadful", 114, Rarity.RARE, mage.cards.v.VisaraTheDreadful.class));
        cards.add(new SetCardInfo("Void", 211, Rarity.RARE, mage.cards.v.Void.class));
        cards.add(new SetCardInfo("Wakedancer", 116, Rarity.COMMON, mage.cards.w.Wakedancer.class));
        cards.add(new SetCardInfo("Wake of Vultures", 115, Rarity.COMMON, mage.cards.w.WakeOfVultures.class));
        cards.add(new SetCardInfo("Wall of Omens", 34, Rarity.UNCOMMON, mage.cards.w.WallOfOmens.class));
        cards.add(new SetCardInfo("Warden of Evos Isle", 76, Rarity.COMMON, mage.cards.w.WardenOfEvosIsle.class));
        cards.add(new SetCardInfo("War Priest of Thune", 35, Rarity.UNCOMMON, mage.cards.w.WarPriestOfThune.class));
        cards.add(new SetCardInfo("Wasteland", 248, Rarity.RARE, mage.cards.w.Wasteland.class));
        cards.add(new SetCardInfo("Wee Dragonauts", 212, Rarity.UNCOMMON, mage.cards.w.WeeDragonauts.class));
        cards.add(new SetCardInfo("Welkin Guide", 36, Rarity.COMMON, mage.cards.w.WelkinGuide.class));
        cards.add(new SetCardInfo("Werebear", 191, Rarity.COMMON, mage.cards.w.Werebear.class));
        cards.add(new SetCardInfo("Whitemane Lion", 37, Rarity.COMMON, mage.cards.w.WhitemaneLion.class));
        cards.add(new SetCardInfo("Wildfire Emissary", 153, Rarity.COMMON, mage.cards.w.WildfireEmissary.class));
        cards.add(new SetCardInfo("Wind-Scarred Crag", 249, Rarity.COMMON, mage.cards.w.WindScarredCrag.class));
        cards.add(new SetCardInfo("Winter Orb", 234, Rarity.RARE, mage.cards.w.WinterOrb.class));
        cards.add(new SetCardInfo("Wirewood Symbiote", 192, Rarity.UNCOMMON, mage.cards.w.WirewoodSymbiote.class));
        cards.add(new SetCardInfo("Wonder", 77, Rarity.UNCOMMON, mage.cards.w.Wonder.class));
        cards.add(new SetCardInfo("Worldgorger Dragon", 154, Rarity.MYTHIC, mage.cards.w.WorldgorgerDragon.class));
        cards.add(new SetCardInfo("Worn Powerstone", 235, Rarity.UNCOMMON, mage.cards.w.WornPowerstone.class));
        cards.add(new SetCardInfo("Wrath of God", 38, Rarity.RARE, mage.cards.w.WrathOfGod.class));
        cards.add(new SetCardInfo("Xantid Swarm", 193, Rarity.RARE, mage.cards.x.XantidSwarm.class));
        cards.add(new SetCardInfo("Yavimaya Enchantress", 194, Rarity.COMMON, mage.cards.y.YavimayaEnchantress.class));
        cards.add(new SetCardInfo("Young Pyromancer", 155, Rarity.UNCOMMON, mage.cards.y.YoungPyromancer.class));
        cards.add(new SetCardInfo("Zealous Persecution", 213, Rarity.UNCOMMON, mage.cards.z.ZealousPersecution.class));
    }

}
