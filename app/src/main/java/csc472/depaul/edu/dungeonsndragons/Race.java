package csc472.depaul.edu.dungeonsndragons;

public enum Race
{
    BUGBEAR("Bugbear"),
    DRAGONBORN("Dragonborn"),
    DWARF("Dwarf"),
    ELF("Elf"),
    GNOME("Gnome"),
    GOBLIN("Goblin"),
    GOLIATH("Goliath"),
    HALF_ELF("Half-Elf"),
    HALFLING("Halfling"),
    HALF_ORC("Half-Orc"),
    HUMAN("Human"),
    ORC("Orc");

    private String RACE;

    Race(String inRace)
    {
        this.RACE = inRace;
    }

    @Override
    public String toString()
    {
        return RACE;
    }
}


