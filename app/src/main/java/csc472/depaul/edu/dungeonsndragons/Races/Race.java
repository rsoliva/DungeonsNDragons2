package csc472.depaul.edu.dungeonsndragons.Races;

//Enum of all available races
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

    //string of race
    private String RACE;

    //assign string
    Race(String inRace) {
        this.RACE = inRace;
    }

    //return race string
    @Override
    public String toString() {
        return RACE;
    }
}