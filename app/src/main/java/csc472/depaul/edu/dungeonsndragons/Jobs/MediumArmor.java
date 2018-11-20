package csc472.depaul.edu.dungeonsndragons.Jobs;

public enum MediumArmor
{
    HIDE                 ("Hide"),
    CHAIN_SHIRT          ("Chain Shirt"),
    SCALE_MAIL           ("Scale Mail"),
    BREASTPLATE          ("Breastplate"),
    HALF_PLATE           ("Half Plate");

    private String type;

    MediumArmor(String type) {this.type = type; }
    public String getMediumArmor() {return type; }
}
