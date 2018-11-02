package csc472.depaul.edu.dungeonsndragons.Jobs;

public class Druid extends AbstractJob
{
    Druid()
    {
        this.DIE = DieType.D8;
        this.PRIMARY_STAT = new Stats[] {Stats.WISDOM};
        this.SAVING_THROW = new Stats[] {Stats.INTELLIGENCE, Stats.WISDOM};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.LIGHT, ArmorTypes.MEDIUM, ArmorTypes.SHIELDS};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.CLUB, SimpleMelee.DAGGER, SimpleMelee.JAVELIN, SimpleMelee.MACE, SimpleMelee.QUARTERSTAFF, SimpleMelee.SICKLE, SimpleMelee.SPEAR};
        this.SR_PROF = new SimpleRange[] {SimpleRange.DART, SimpleRange.SLING};
        this.MM_PROF = new MartialMelee[] {MartialMelee.SCIMITAR};
        this.MR_PROF = new MartialRange[] {MartialRange.NONE};
    }
}
