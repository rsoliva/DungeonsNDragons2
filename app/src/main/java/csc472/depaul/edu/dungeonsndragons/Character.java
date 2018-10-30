package csc472.depaul.edu.dungeonsndragons;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Character implements Parcelable, CharacterMethods
{
    private int STRENGTH = 0;
    private int DEXTERITY = 0;
    private int CONSTITUTION = 0;
    private int WISDOM = 0;
    private int INTELLIGENCE = 0;
    private int CHARISMA = 0;
    private int SPEED = 0;
    private int CLASS_PROFICIENCY = 0;

    private String name;
    private String race;
    private String job;
    private String background;

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(name);
        dest.writeString(race);
        dest.writeString(job);
        dest.writeInt(STRENGTH);
        dest.writeInt(DEXTERITY);
        dest.writeInt(CONSTITUTION);
        dest.writeInt(INTELLIGENCE);
        dest.writeInt(WISDOM);
        dest.writeInt(CHARISMA);

    }
    public Character(Parcel p){
        name = p.readString();
        race = p.readString();
        job = p.readString();
        STRENGTH = p.readInt();
        DEXTERITY = p.readInt();
        CONSTITUTION = p.readInt();
        INTELLIGENCE = p.readInt();
        WISDOM = p.readInt();
        CHARISMA = p.readInt();
    }

    public Character(){
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
    @Override
    public String GetRace() { return this.race; }
    @Override
    public String GetJob() { return this.job; }
    @Override
    public String GetBackground() { return this.background; }

}