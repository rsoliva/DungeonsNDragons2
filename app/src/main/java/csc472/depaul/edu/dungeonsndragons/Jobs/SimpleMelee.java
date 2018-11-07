package csc472.depaul.edu.dungeonsndragons.Jobs;

//Enum of all Simple Melee weapons
public enum SimpleMelee
{
    NONE            ("None"),
    CLUB            ("Club"),
    DAGGER          ("Dagger"),
    GREATCLUB       ("Great Club"),
    HANDAXE         ("Hand Axe"),
    JAVELIN         ("Javelin"),
    LIGHT_HAMMER    ("Light Hammer"),
    MACE            ("Mace"),
    QUARTERSTAFF    ("Quarter-Staff"),
    SICKLE          ("Sickle"),
    SPEAR           ("Spear"),
    ALL             ("All");

    private String typeVal;

    SimpleMelee(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getTypeVal() {
        return typeVal;
    }
}
