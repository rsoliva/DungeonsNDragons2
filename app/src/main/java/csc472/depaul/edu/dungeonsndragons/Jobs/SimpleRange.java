package csc472.depaul.edu.dungeonsndragons.Jobs;

public enum SimpleRange
{
    NONE                ("None"),
    LIGHT_CROSSBOW      ("Light Crossbow"),
    DART                ("Dart"),
    SHORTBOW            ("Short Bow"),
    SLING               ("Sling"),
    ALL                 ("All");

    private String typeVal;

    SimpleRange(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getTypeVal() {
        return typeVal;
    }
}
