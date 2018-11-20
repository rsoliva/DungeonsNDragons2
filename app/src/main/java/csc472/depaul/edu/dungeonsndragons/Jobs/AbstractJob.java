package csc472.depaul.edu.dungeonsndragons.Jobs;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

//Abstract Job which is extended by every job
public abstract class AbstractJob implements CharacterMethods
{
    public static DieType DIE = DieType.D6;
    public static Stats[] PRIMARY_STAT;
    public static String[] SAVING_THROW;
    public static ArmorTypes[] ARMOR_PROF;
    public static SimpleMelee[] SM_PROF;
    public static SimpleRange[] SR_PROF;
    public static MartialMelee[] MM_PROF;
    public static MartialRange[] MR_PROF;
    protected String INVENTORY;
}
