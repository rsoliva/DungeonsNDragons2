package csc472.depaul.edu.dungeonsndragons.Backgrounds;

public enum Skills
{
    ATHLETICS           ("Athletics"),
    ACROBATICS          ("Acrobatics"),
    SLEIGHT_OF_HAND      ("Sleight of Hand"),
    STEALTH             ("Stealth"),
    ARCANA              ("Arcana"),
    HISTORY             ("History"),
    INVESTIGATION       ("Investigation"),
    NATURE              ("Nature"),
    RELIGION            ("Religion"),
    ANIMAL_HANDLING     ("Animal Handling"),
    INSIGHT             ("Insight"),
    MEDICINE            ("Medicine"),
    PERCEPTION          ("Perception"),
    SURVIVAL            ("Survival"),
    DECEPTION           ("Deception"),
    INTIMIDATION        ("Intimidation"),
    PERFORMANCE         ("Performance"),
    PERSUASION          ("Persuasion");

    private String skill;

    Skills(String skill) {this.skill = skill;}

    @Override
    public String toString() {return skill;}
}
