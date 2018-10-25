package csc472.depaul.edu.dungeonsndragons;

public enum Race {
    DARKELF("Dark Elf"),
    DRAGONBORN("Dragonborn"),
    FORESTGNOME("Forest Gnome"),
    HALFELF("Elf"),
    HALFORC("Half-Orc"),
    HIGHELF("High-Elf"),
    HILLDWARF("Hill Dwarf"),
    HUMAN("Human"),
    LIGHTFOOTHALFING("Lightfoot Halfling"),
    MOUNTTAINDWARF("Mountain Dwarf"),
    ROCKGNOME("Rock Gnome"),
    STOUTHALFLING("Stout Halfing"),
    TIEFLING("Tiefling"),
    WOODELF("Wood Elf");

    private String RACE;

    Race(String inRace) {
        this.RACE = inRace;
    }

    @Override
    public String toString() {
        return RACE;
    }
}