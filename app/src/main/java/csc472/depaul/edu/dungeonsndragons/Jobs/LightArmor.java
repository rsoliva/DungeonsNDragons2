package csc472.depaul.edu.dungeonsndragons.Jobs;

public enum LightArmor
{
    PADDED             ("Padded"),
    LEATHER            ("Leather"),
    STUDDED_LEATHER    ("Studded Leather");

    private String type;

    LightArmor(String type) {this.type = type; }
    public String getLightArmor() {return type; }
}
