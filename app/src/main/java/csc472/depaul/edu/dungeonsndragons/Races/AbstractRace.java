package csc472.depaul.edu.dungeonsndragons.Races;

//Abstract race which all races come from
public abstract class AbstractRace implements CharacterMethods
{
    protected int STRENGTH = 0;
    protected int DEXTERITY = 0;
    protected int CONSTITUTION = 0;
    protected int WISDOM = 0;
    protected int INTELLIGENCE = 0;
    protected int CHARISMA = 0;
    protected int SPEED = 0;
    protected int CLASS_PROFICIENCY = 2;
    protected String INVENTORY = "";
    protected String RACE = "";
    protected String NAME = "";
    protected String JOB = "";
    protected String BACKGROUND = "";

    public abstract int GetStrength();
    public abstract int GetDexterity();
    public abstract int GetConstitution();
    public abstract int GetWisdom();
    public abstract int GetIntelligence();
    public abstract int GetCharisma();
    public abstract int GetSpeed();
    public abstract String GetInventory();
    public abstract int GetProficiency();
}
