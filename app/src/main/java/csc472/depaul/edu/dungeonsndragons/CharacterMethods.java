package csc472.depaul.edu.dungeonsndragons;

public interface CharacterMethods
{
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

    int GetStrength();
    int GetDexterity();
    int GetConstitution();
    int GetWisdom();
    int GetIntelligence();
    int GetCharisma();
    int GetSpeed();
    int GetProficiency();
    String GetName();
    String GetRace();
    String GetJob();
}
