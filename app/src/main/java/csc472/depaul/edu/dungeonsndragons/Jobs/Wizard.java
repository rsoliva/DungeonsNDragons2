package csc472.depaul.edu.dungeonsndragons.Jobs;

public class Wizard extends AbstractJob
{
    Wizard()
    {
        this.DIE = DieType.D6;
        this.PRIMARY_STAT = new Stats[] {Stats.INTELLIGENCE};
        this.SAVING_THROW = new Stats[] {Stats.INTELLIGENCE, Stats.WISDOM};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.NONE};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.DAGGER, SimpleMelee.QUARTERSTAFF};
        this.SR_PROF = new SimpleRange[] {SimpleRange.DART, SimpleRange.SLING, SimpleRange.LIGHT_CROSSBOW};
        this.MM_PROF = new MartialMelee[] {MartialMelee.NONE};
        this.MR_PROF = new MartialRange[] {MartialRange.NONE};
    }
}
