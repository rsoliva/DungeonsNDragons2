package csc472.depaul.edu.dungeonsndragons.Jobs;

public class Ranger extends AbstractJob
{
    Ranger()
    {
        this.DIE = DieType.D10;
        this.PRIMARY_STAT = new Stats[] {Stats.DEXTERITY, Stats.WISDOM};
        this.SAVING_THROW = new Stats[] {Stats.STRENGTH, Stats.DEXTERITY};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.LIGHT, ArmorTypes.MEDIUM, ArmorTypes.SHIELDS};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.ALL};
        this.SR_PROF = new SimpleRange[] {SimpleRange.ALL};
        this.MM_PROF = new MartialMelee[] {MartialMelee.ALL};
        this.MR_PROF = new MartialRange[] {MartialRange.ALL};
    }
}
