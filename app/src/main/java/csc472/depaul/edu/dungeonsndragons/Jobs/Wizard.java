package csc472.depaul.edu.dungeonsndragons.Jobs;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

public class Wizard extends AbstractJob
{
    CharacterMethods privCharRef;

    public Wizard()
    {
        this.DIE = DieType.D6;
        this.PRIMARY_STAT = new Stats[] {Stats.INTELLIGENCE};
        this.SAVING_THROW = new String[] {Stats.INTELLIGENCE.toString(), Stats.WISDOM.toString()};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.NONE};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.DAGGER, SimpleMelee.QUARTERSTAFF};
        this.SR_PROF = new SimpleRange[] {SimpleRange.DART, SimpleRange.SLING, SimpleRange.LIGHT_CROSSBOW};
        this.MM_PROF = new MartialMelee[] {MartialMelee.NONE};
        this.MR_PROF = new MartialRange[] {MartialRange.NONE};
    }

    public Wizard(CharacterMethods charRef)
    {
        this.privCharRef = charRef;

        this.DIE = DieType.D6;
        this.PRIMARY_STAT = new Stats[] {Stats.INTELLIGENCE};
        this.SAVING_THROW = new String[] {Stats.INTELLIGENCE.toString(), Stats.WISDOM.toString()};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.NONE};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.DAGGER, SimpleMelee.QUARTERSTAFF};
        this.SR_PROF = new SimpleRange[] {SimpleRange.DART, SimpleRange.SLING, SimpleRange.LIGHT_CROSSBOW};
        this.MM_PROF = new MartialMelee[] {MartialMelee.NONE};
        this.MR_PROF = new MartialRange[] {MartialRange.NONE};
    }

    @Override
    public void SetStrength(int val) {

    }

    @Override
    public void SetDexterity(int val) {

    }

    @Override
    public void SetConstitution(int val) {

    }

    @Override
    public void SetWisdom(int val) {

    }

    @Override
    public void SetIntelligence(int val) {

    }

    @Override
    public void SetCharisma(int val) {

    }

    @Override
    public void SetSpeed(int val) {

    }

    @Override
    public void SetRace(String inRace) {

    }

    @Override
    public void SetJob(String inJob) {

    }

    @Override
    public void SetProficiency(int val) {

    }

    @Override
    public void SetName(String name) {

    }

    @Override
    public void SetBackground(String inBackground) {

    }

    @Override
    public void SetDie(String inDie) {

    }

    @Override
    public int GetStrength() {
        return privCharRef.GetStrength();
    }

    @Override
    public int GetDexterity() {
        return privCharRef.GetDexterity();
    }

    @Override
    public int GetConstitution() {
        return privCharRef.GetConstitution();
    }

    @Override
    public int GetWisdom() {
        return privCharRef.GetWisdom();
    }

    @Override
    public int GetIntelligence() {
        return privCharRef.GetIntelligence();
    }

    @Override
    public int GetCharisma() {
        return privCharRef.GetCharisma();
    }

    @Override
    public int GetSpeed() {
        return privCharRef.GetSpeed();
    }

    @Override
    public int GetProficiency() {
        return privCharRef.GetProficiency();
    }

    @Override
    public String[] GetSavingThrows() {
        return SAVING_THROW;
    }

    @Override
    public String GetInventory()
    {
        INVENTORY += "Spellbook ";
        return privCharRef.GetInventory() + INVENTORY;
    }

    @Override
    public String GetBackground() {
        return privCharRef.GetBackground();
    }

    @Override
    public String GetName() {
        return privCharRef.GetName();
    }

    @Override
    public String GetRace() {
        return privCharRef.GetRace();
    }

    @Override
    public String GetJob() {
        return "Wizard";
    }

    @Override
    public String GetDie() {
        return privCharRef.GetDie() + "1d6";
    }
    @Override
    public String GetspecificInventory(String inventoryType) {
        return this.privCharRef.GetspecificInventory(inventoryType);
    }
}
