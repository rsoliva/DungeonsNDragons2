package csc472.depaul.edu.dungeonsndragons;

public class Character implements CharacterMethods
{
    private int STRENGTH = 0;
    private int DEXTERITY = 0;
    private int CONSTITUTION = 0;
    private int WISDOM = 0;
    private int INTELLIGENCE = 0;
    private int CHARISMA = 0;
    private int SPEED = 0;
    private int CLASS_PROFICIENCY = 0;
    private Race RACE;
//    private Job job;
//    private Background background;
    private String name;

    @Override
    public void Initialize()
    {
        switch (RACE)
        {
            case BUGBEAR:
                break;
            case DRAGONBORN:
                break;
            default:
        }
    }
    /*public Character(Race race, Job job, Background background){
        this.RACE = race;
        this.job = job;
        this.background = background;
        this.SetStrength(8);
        this.SetDexterity(8);
        this.SetConstitution(8);
        this.SetIntelligence(8);
        this.SetWisdom(8);
        this.SetCharisma(8);

        switch(RACE) {
            case ELF:
                break;
            case ORC:
                break;
            case DWARF:
                break;
            case GNOME:
                break;
            case HUMAN:
                break;
            case GOBLIN:
                break;
            case BUGBEAR:
                break;
            case GOLIATH:
                break;
            case HALF_ELF:
                break;
            case HALF_ORC:
                break;
            case HALFLING:
                break;
            case DRAGONBORN:
                break;
        }
    }*/
    @Override
    public void SetStrength(int val)
    {
        STRENGTH = val;
    }

    @Override
    public void SetDexterity(int val)
    {
        DEXTERITY = val;
    }

    @Override
    public void SetConstitution(int val)
    {
        CONSTITUTION = val;
    }

    @Override
    public void SetWisdom(int val)
    {
        WISDOM = val;
    }

    @Override
    public void SetIntelligence(int val)
    {
        INTELLIGENCE = val;
    }

    @Override
    public void SetCharisma(int val)
    {
        CHARISMA = val;
    }

    @Override
    public void SetSpeed(int val)
    {
        SPEED = val;
    }

    @Override
    public void SetRace(Race inRace)
    {
        RACE = inRace;
    }

    @Override
    public void SetProficiency(int val)
    {
        CLASS_PROFICIENCY = val;
    }

    @Override
    public void SetName(String name) { this.name = name; }

    @Override
    public int GetStrength()
    {
        return STRENGTH;
    }

    @Override
    public int GetDexterity()
    {
        return DEXTERITY;
    }

    @Override
    public int GetConstitution()
    {
        return CONSTITUTION;
    }

    @Override
    public int GetWisdom()
    {
        return WISDOM;
    }

    @Override
    public int GetIntelligence()
    {
        return INTELLIGENCE;
    }

    @Override
    public int GetCharisma()
    {
        return CHARISMA;
    }

    @Override
    public int GetSpeed()
    {
        return SPEED;
    }

    @Override
    public int GetProficiency()
    {
        return CLASS_PROFICIENCY;
    }

    @Override
    public String GetName() { return this.name; }

}
