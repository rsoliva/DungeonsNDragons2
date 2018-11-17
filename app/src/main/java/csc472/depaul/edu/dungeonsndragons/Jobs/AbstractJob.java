package csc472.depaul.edu.dungeonsndragons.Jobs;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

//Abstract Job which is extended by every job
public abstract class AbstractJob implements CharacterMethods
{
    protected DieType DIE = DieType.D6;
    protected Stats[] PRIMARY_STAT;
    protected Stats[] SAVING_THROW;
    protected ArmorTypes[] ARMOR_PROF;
    protected SimpleMelee[] SM_PROF;
    protected SimpleRange[] SR_PROF;
    protected MartialMelee[] MM_PROF;
    protected MartialRange[] MR_PROF;
    protected String INVENTORY;
}
