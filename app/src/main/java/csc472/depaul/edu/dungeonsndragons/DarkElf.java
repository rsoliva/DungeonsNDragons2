package csc472.depaul.edu.dungeonsndragons;

public class DarkElf extends AbstractRace
{
    private CharacterMethods character;

    public DarkElf(CharacterMethods charRef)
    {
        this.character = charRef;
    }

    @Override
    public void SetStrength(int val) { this.STRENGTH = val; }

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
    public int GetStrength() { return character.GetStrength(); }

    @Override
    public int GetDexterity()
    {
        return character.GetDexterity() + 2;
    }

    @Override
    public int GetConstitution()
    {
        return character.GetConstitution();
    }

    @Override
    public int GetWisdom()
    {
        return character.GetWisdom();
    }

    @Override
    public int GetIntelligence() { return character.GetIntelligence(); }

    @Override
    public int GetCharisma()
    {
        return character.GetCharisma() + 1;
    }

    @Override
    public int GetSpeed()
    {
        return character.GetSpeed();
    }

    @Override
    public int GetProficiency() {
        return 0;
    }

    @Override
    public String GetName()
    {
        return character.GetName();
    }

    @Override
    public String GetRace() {
        return "Dark Elf";
    }

    @Override
    public String GetJob() {
        return character.GetJob();
    }

    @Override
    public String GetBackground() { return character.GetBackground(); }
}
