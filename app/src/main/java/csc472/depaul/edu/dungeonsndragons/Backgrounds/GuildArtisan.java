package csc472.depaul.edu.dungeonsndragons.Backgrounds;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

public class GuildArtisan extends AbstractBackground
{
    private CharacterMethods privCharRef;

    public GuildArtisan()
    {
        SKILL_PROF = new Skills[] {Skills.INSIGHT, Skills.PERSUASION};
    }

    public GuildArtisan(CharacterMethods charRef)
    {
        privCharRef = charRef;
        SKILL_PROF = new Skills[] {Skills.INSIGHT, Skills.PERSUASION};
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
        return privCharRef.GetSavingThrows();
    }

    @Override
    public String GetInventory()
    {
        INVENTORY += "Artisan Tool x1, Guild Introduction Letter x1, Traveler's Clothes x1, GP x15";
        return this.privCharRef.GetInventory() + INVENTORY;
    }

    @Override
    public String GetBackground() {
        return "Guild Artisan";
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
        return privCharRef.GetJob();
    }

    @Override
    public String GetDie() {
        return this.DIE.toString();
    }
}
