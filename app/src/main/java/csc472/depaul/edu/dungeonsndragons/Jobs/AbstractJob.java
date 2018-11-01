package csc472.depaul.edu.dungeonsndragons.Jobs;

public abstract class AbstractJob
{
    protected DieType DIE = DieType.D6;
    protected Stats[] PRIMARY_STAT;
    protected Stats[] SAVING_THROW;
    protected ArmorTypes[] ARMOR_PROF;
    protected SimpleMelee[] SM_PROF;
    protected SimpleRange[] SR_PROF;
    protected MartialMelee[] MM_PROF;
    protected MartialRange[] MR_PROF;
}
