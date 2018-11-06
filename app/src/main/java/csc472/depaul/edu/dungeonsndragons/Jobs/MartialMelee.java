package csc472.depaul.edu.dungeonsndragons.Jobs;

//Enum of all Martial Melee weapons
public enum MartialMelee
{
    NONE            ("None"),
    BATTLEAXE       ("Battle Axe"),
    FLAIL           ("Flail"),
    GLAIVE          ("Glaive"),
    GREATAXE        ("Great Axe"),
    GREATSWORD      ("Great Swrod"),
    HALBERD         ("Halberd"),
    LANCE           ("Lance"),
    LONGSWORD       ("Longsword"),
    MAUL            ("Maul"),
    MORNINGSTAR     ("Morningstar"),
    PIKE            ("Pike"),
    RAPIER          ("Rapier"),
    SCIMITAR        ("Scimitar"),
    SHORTSWORD      ("Shortsword"),
    TRIDENT         ("Trident"),
    WAR_PICK        ("War Pick"),
    WARHAMMER       ("War Hammer"),
    WHIP            ("Whip"),
    ALL             ("All");

    private String typeVal;

    MartialMelee(String typeNum){
        this.typeVal = typeVal;
    }

    public String getTypeNum() {
        return typeVal;
    }
}
