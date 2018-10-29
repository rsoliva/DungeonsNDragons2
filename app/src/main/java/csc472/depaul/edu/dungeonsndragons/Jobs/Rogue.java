package csc472.depaul.edu.dungeonsndragons.Jobs;

public class Rogue extends AbstractJob
{
    Rogue()
    {
        this.DIE = DieType.D8;
        this.PRIMARY_STAT = new Stats[] {Stats.DEXTERITY};
        this.SAVING_THROW = new Stats[] {Stats.DEXTERITY, Stats.INTELLIGENCE};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.LIGHT};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.ALL};
        this.SR_PROF = new SimpleRange[] {SimpleRange.ALL};
        this.MM_PROF = new MartialMelee[] {MartialMelee.LONGSWORD, MartialMelee.RAPIER, MartialMelee.SHORTSWORD};
        this.MR_PROF = new MartialRange[] {MartialRange.HAND_CROSSBOW};
    }
}
