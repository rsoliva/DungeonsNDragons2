package csc472.depaul.edu.dungeonsndragons.Races;

import android.os.Parcelable;

import csc472.depaul.edu.dungeonsndragons.Jobs.DieType;

//Main interface for everything
public interface CharacterMethods
{
    DieType DIE = null;
    void SetStrength(int val);
    void SetDexterity(int val);
    void SetConstitution(int val);
    void SetWisdom(int val);
    void SetIntelligence(int val);
    void SetCharisma(int val);
    void SetSpeed(int val);
    void SetRace(String inRace);
    void SetJob(String inJob);
    void SetProficiency(int val);
    void SetName(String name);
    void SetBackground(String inBackground);
    void SetDie(String inDie);


    int GetStrength();
    int GetDexterity();
    int GetConstitution();
    int GetWisdom();
    int GetIntelligence();
    int GetCharisma();
    int GetSpeed();
    int GetProficiency();
    String[] GetSavingThrows();
    String GetInventory();
    String GetBackground();
    String GetName();
    String GetRace();
    String GetJob();
    String GetDie();
}
