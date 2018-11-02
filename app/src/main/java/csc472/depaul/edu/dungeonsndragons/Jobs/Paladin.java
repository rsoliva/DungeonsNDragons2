package csc472.depaul.edu.dungeonsndragons.Jobs;

public class Paladin extends AbstractJob
{
    Paladin()
    {
        this.DIE = DieType.D10;
        this.PRIMARY_STAT = new Stats[] {Stats.STRENGTH, Stats.CHARISMA};
        this.SAVING_THROW = new Stats[] {Stats.WISDOM, Stats.CHARISMA};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.ALL};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.ALL};
        this.SR_PROF = new SimpleRange[] {SimpleRange.ALL};
        this.MM_PROF = new MartialMelee[] {MartialMelee.ALL};
        this.MR_PROF = new MartialRange[] {MartialRange.ALL};
    }
}
