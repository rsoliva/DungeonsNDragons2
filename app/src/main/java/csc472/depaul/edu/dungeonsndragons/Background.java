package csc472.depaul.edu.dungeonsndragons;

public enum Background {
    ACOLYTE("Acolyte"),
    CHARLATAN("Charlatan"),
    CRIMINAL("Criminal"),
    ENTERTAINER("Enterntainer"),
    FOLKHERO("FolkHero"),
    GUILDARTISAN("GuildArtisan"),
    HERMIT("Hermit"),
    NOBLE("Noble"),
    OUTLANDER("Outlander"),
    SAGE("Sage"),
    SAILOR("Sailor"),
    SOLDIER("Soldier"),
    URCHIN("Urchin");

    private String BACKGROUND;

    Background(String inBackground) {
        this.BACKGROUND = inBackground;
    }

    @Override
    public String toString() {
        return BACKGROUND;
    }
}
