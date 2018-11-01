package csc472.depaul.edu.dungeonsndragons.Jobs;

public class Monk extends AbstractJob
{
    Monk()
    {
        this.DIE = DieType.D8;
        this.PRIMARY_STAT = new Stats[] {Stats.DEXTERITY, Stats.WISDOM};
        this.SAVING_THROW = new Stats[] {Stats.STRENGTH, Stats.DEXTERITY};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.NONE};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.ALL};
        this.SR_PROF = new SimpleRange[] {SimpleRange.ALL};
        this.MM_PROF = new MartialMelee[] {MartialMelee.SHORTSWORD};
        this.MR_PROF = new MartialRange[] {MartialRange.NONE};
    }
}
