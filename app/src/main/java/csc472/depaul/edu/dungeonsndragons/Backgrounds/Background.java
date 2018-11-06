package csc472.depaul.edu.dungeonsndragons.Backgrounds;

//Enum of available backgrounds
public enum Background
{
    ACOLYTE         ("Acolyte"),
    CHARLATAN       ("Charlatan"),
    CRIMINAL        ("Criminal"),
    ENTERTAINER     ("Entertainer"),
    FOLK_HERO       ("Folk Hero"),
    GUILD_ARTISAN   ("Guild Artisan"),
    HERMIT          ("Hermit"),
    NOBLE           ("Noble"),
    OUTLANDER       ("Outlander"),
    SAGE            ("Sage"),
    SAILOR          ("Sailor"),
    SOLDIER         ("Soldier"),
    URCHIN          ("Urchin");

    private String background;

    Background(String background){this.background = background; }

    @Override
    public String toString() {return background;}
}


