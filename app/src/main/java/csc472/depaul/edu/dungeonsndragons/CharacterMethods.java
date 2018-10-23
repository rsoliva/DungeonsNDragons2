package csc472.depaul.edu.dungeonsndragons;

public interface CharacterMethods
{
    void Initialize();

    void SetStrength(int val);
    void SetDexterity(int val);
    void SetConstitution(int val);
    void SetWisdom(int val);
    void SetIntelligence(int val);
    void SetCharisma(int val);
    void SetSpeed(int val);
    void SetRace(Race inRace);

    int GetStrength();
    int GetDexterity();
    int GetConstitution();
    int GetWisdom();
    int GetIntelligence();
    int GetCharisma();
    int GetSpeed();
}
