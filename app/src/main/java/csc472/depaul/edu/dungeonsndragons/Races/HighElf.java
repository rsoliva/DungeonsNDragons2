package csc472.depaul.edu.dungeonsndragons.Races;

public class HighElf extends AbstractRace implements CharacterMethods
{
    private CharacterMethods privCharRef = null;

    public HighElf(CharacterMethods charRef)
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

    }

    @Override
    public void SetJob(String inJob) {
        //JOB = inJob;
    }

    @Override
    public void SetBackground(String inBackground) {

    }

    @Override
    public void SetProficiency(int val) {

    }

    @Override
    public void SetName(String name)
    {
        this.NAME = name;
    }

    @Override
    public int GetStrength()
    {
        return this.privCharRef.GetStrength();
    }

    @Override
    public int GetDexterity()
    {
        return this.privCharRef.GetDexterity() + 2;
    }

    @Override
    public int GetConstitution()
    {
        return this.privCharRef.GetConstitution();
    }

    @Override
    public int GetWisdom()
    {
        return this.privCharRef.GetWisdom();
    }

    @Override
    public int GetIntelligence()
    {
        return this.privCharRef.GetIntelligence() + 1;
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
    public String GetInventory() {
        return privCharRef.GetInventory() + INVENTORY;
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
        return "High Elf";
    }

    @Override
    public String GetJob() {
        return privCharRef.GetJob();
    }

    @Override
    public String GetBackground() {
        return privCharRef.GetBackground();
    }
}
