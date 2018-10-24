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
    HALF_ELF("Half elf"),
    HALFLING("Halfling"),
    HALF_ORC("Half orc"),
    HUMAN("Human"),
    ORC("Orc");

    private String races;

    Race(String races){ this.races = races; }

    @Override public String toString() {
        return races;
    }
}
