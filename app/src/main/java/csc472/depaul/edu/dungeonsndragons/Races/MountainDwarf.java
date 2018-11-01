package csc472.depaul.edu.dungeonsndragons.Races;

public class MountainDwarf extends AbstractRace implements CharacterMethods
{
    private CharacterMethods privCharRef = null;

    public MountainDwarf(CharacterMethods charRef)
    {
        this.privCharRef = charRef;
    }

    @Override
    public void SetStrength(int val)
    {
        this.STRENGTH = val;
    }

    @Override
    public void SetDexterity(int val)
    {
        this.DEXTERITY = val;
    }

    @Override
    public void SetConstitution(int val)
    {
        this.CONSTITUTION = val;
    }

    @Override
    public void SetWisdom(int val)
    {
        this.WISDOM = val;
    }

    @Override
    public void SetIntelligence(int val)
    {
        this.INTELLIGENCE = val;
    }

    @Override
    public void SetCharisma(int val)
    {
        this.CHARISMA = val;
    }

    @Override
    public void SetSpeed(int val)
    {
        this.SPEED = val;
    }

    @Override
    public void SetRace(String inRace) {
        this.RACE = inRace;
    }

    @Override
    public void SetJob(String inJob) {

    }

    @Override
    public void SetBackground(String inBackground) {

    }

    @Override
    public void SetProficiency(int val) {
        this.CLASS_PROFICIENCY = val;
    }

    @Override
    public void SetName(String name)
    {
        this.NAME = name;
    }

    @Override
    public int GetStrength()
    {
        return this.privCharRef.GetStrength() + 2;
    }

    @Override
    public int GetDexterity()
    {
        return this.privCharRef.GetDexterity();
    }

    @Override
    public int GetConstitution()
    {
        return this.privCharRef.GetConstitution() + 2;
    }

    @Override
    public int GetWisdom()
    {
        return this.privCharRef.GetWisdom();
    }

    @Override
    public int GetIntelligence()
    {
        return this.privCharRef.GetIntelligence();
    }

    @Override
    public int GetCharisma()
    {
        return this.privCharRef.GetCharisma();
    }

    @Override
    public int GetSpeed()
    {
        return this.privCharRef.GetSpeed();
    }

    @Override
    public int GetProficiency() {
        return 0;
    }

    @Override
    public String GetName()
    {
        return this.privCharRef.GetName();
    }

    @Override
    public String GetRace() {
        return null;
    }

    @Override
    public String GetJob() {
        return null;
    }

    @Override
    public String GetBackground() {
        return null;
    }
}