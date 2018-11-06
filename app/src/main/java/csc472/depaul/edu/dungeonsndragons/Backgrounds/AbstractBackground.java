package csc472.depaul.edu.dungeonsndragons.Backgrounds;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

//Abstract Background that is extended by all backgrounds
public abstract class AbstractBackground implements CharacterMethods
{


    public abstract int GetStrength();
    public abstract int GetDexterity();
    public abstract int GetConstitution();
    public abstract int GetWisdom();
    public abstract int GetIntelligence();
    public abstract int GetCharisma();
    public abstract int GetSpeed();
    public abstract int GetProficiency();
}
