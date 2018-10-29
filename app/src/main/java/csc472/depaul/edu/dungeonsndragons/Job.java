package csc472.depaul.edu.dungeonsndragons;

public enum Job
{
    FIGHTER("Fighter"),
    CLERIC("Cleric"),
    ROGUE("Rogue"),
    WIZARD("Wizard"),
    SORCERER("SORCERER"),
    DRUID("Druid"),
    PALADIN("Paladin");

    private String jobs;

    Job(String jobs){ this.jobs = jobs; }

    @Override public String toString() {
        return jobs;
    }
}
