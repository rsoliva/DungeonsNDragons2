package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

//Base class that gets wrapped in decorator
public class Character implements Parcelable, CharacterMethods
{
    //Main stats
    private int STRENGTH = 0;
    private int DEXTERITY = 0;
    private int CONSTITUTION = 0;
    private int WISDOM = 0;
    private int INTELLIGENCE = 0;
    private int CHARISMA = 0;
    private int SPEED = 0;
    private int CLASS_PROFICIENCY = 0;

    //Character info
    private String name;
    private String race;
    private String job;
    private String background;
    private String hitDie = "";
    private String[] SAVING_THROWS;
    public String WeaponInventory="";
    public String EquipmentInventory="";
    public String ConsumablesInventory="";
    //Character skills
    public ArrayList<String> SkillList;

    public void setInventory(String addInventory,String inventorytype){
        switch(inventorytype){
            case "Weapon":
                WeaponInventory += " " + addInventory;
                break;
            case "Consumable":
                ConsumablesInventory += " "+ addInventory;
                break;
            case "Equipment":
                EquipmentInventory += " " + addInventory;
                break;
        }
    }
    @Override
    public int describeContents() {
        return hashCode();
    }

    //write to a parcel
    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(name);
        dest.writeString(race);
        dest.writeString(job);
        dest.writeString(background);
        dest.writeString(hitDie);
        dest.writeString(WeaponInventory);
        dest.writeString(EquipmentInventory);
        dest.writeString(ConsumablesInventory);
        dest.writeInt(STRENGTH);
        dest.writeInt(DEXTERITY);
        dest.writeInt(CONSTITUTION);
        dest.writeInt(INTELLIGENCE);
        dest.writeInt(WISDOM);
        dest.writeInt(CHARISMA);
        dest.writeInt(SPEED);

    }

    //read from a parcel
    private Character(Parcel p){
        name = p.readString();
        race = p.readString();
        job = p.readString();
        background = p.readString();
        hitDie = p.readString();
        WeaponInventory = p.readString();
        EquipmentInventory = p.readString();
        ConsumablesInventory = p.readString();
        STRENGTH = p.readInt();
        DEXTERITY = p.readInt();
        CONSTITUTION = p.readInt();
        INTELLIGENCE = p.readInt();
        WISDOM = p.readInt();
        CHARISMA = p.readInt();
        SPEED = p.readInt();
    }

    public Character(){
    }

    public Character(CharacterMethods charRef){
        this.STRENGTH = charRef.GetStrength();
        this.DEXTERITY = charRef.GetDexterity();
        this.CONSTITUTION = charRef.GetConstitution();
        this.INTELLIGENCE = charRef.GetIntelligence();
        this.WISDOM = charRef.GetWisdom();
        this.CHARISMA = charRef.GetCharisma();
        this.name = charRef.GetName();
        this.race = charRef.GetRace();
        this.background = charRef.GetBackground();
        this.job = charRef.GetJob();
        this.hitDie = charRef.GetDie();
        this.SPEED = charRef.GetSpeed();
        this.WeaponInventory = charRef.GetspecificInventory("Weapon");
        this.ConsumablesInventory = charRef.GetspecificInventory("Consumable");
        this.EquipmentInventory = charRef.GetspecificInventory("Equipment");

    }

    public static final Parcelable.Creator<Character> CREATOR = new Parcelable.Creator<Character>(){

        @Override
        public Character createFromParcel(Parcel parcel) {
            return new Character(parcel);
        }

        @Override
        public Character[] newArray(int size) {
            return new Character[size];
        }
    };
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
    public void SetRace(String inRace)
    {
        race = inRace;
    }
    @Override
    public void SetJob(String inJob)
    {
        job = inJob;
    }
    @Override
    public void SetBackground(String inBackground) { background = inBackground; }
    @Override
    public void SetProficiency(int val)
    {
        CLASS_PROFICIENCY = val;
    }

    @Override
    public void SetName(String name) { this.name = name; }

    @Override
    public void SetDie(String inDie)
    {
        this.hitDie = inDie;
    }

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
    public String GetInventory() {

        return "";
    }

    public String GetspecificInventory(String inventoryType){
        switch(inventoryType){
            case "Weapon":
                return WeaponInventory;
            case "Equipment":
                return EquipmentInventory;
            case "Consumable":
                return ConsumablesInventory;
        }
        return "";
    }

    @Override
    public int GetProficiency()
    {
        return CLASS_PROFICIENCY;
    }

    @Override
    public String[] GetSavingThrows() {
        return SAVING_THROWS;
    }

    @Override
    public String GetName() { return this.name; }
    @Override
    public String GetRace() { return this.race; }
    @Override
    public String GetJob() { return this.job; }
    @Override
    public String GetBackground() { return this.background; }

    @Override
    public String GetDie() {
        return hitDie;
    }


}