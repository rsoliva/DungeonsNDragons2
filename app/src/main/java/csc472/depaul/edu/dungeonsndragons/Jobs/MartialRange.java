package csc472.depaul.edu.dungeonsndragons.Jobs;

//Enum of all Martial Range weapons
public enum MartialRange
{
    NONE                ("None"),
    BLOWGUN             ("Blow Gun"),
    HAND_CROSSBOW       ("Hand Crossbow"),
    HEAVY_CROSSBOW      ("Heavy Crossbow"),
    LONGBOW             ("Longbow"),
    NET                 ("Net"),
    ALL                 ("All");

    private String typeVal;

    MartialRange(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getTypeVal() {
        return typeVal;
    }
}
