package csc472.depaul.edu.dungeonsndragons.Jobs;

public enum HeavyArmor
{
    RING_MAIL      ("Ring Mail"),
    CHAIN_MAIL     ("Chain Mail"),
    SPLINT         ("Splint"),
    PLATE          ("Plate");

    private String type;

    HeavyArmor(String type) {this.type = type; }
    public String getHeavyArmor() {return type; }
}
