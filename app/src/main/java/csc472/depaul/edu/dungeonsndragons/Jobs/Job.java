package csc472.depaul.edu.dungeonsndragons.Jobs;

//Enum of all Jobs available
public enum Job
{
    BARBARIAN("Barbarian"),
    BARD("Bard"),
    CLERIC("Cleric"),
    DRUID("Druid"),
    FIGHTER("Fighter"),
    MONK("Monk"),
    PALADIN("Paladin"),
    RANGER("Ranger"),
    ROGUE("Rogue"),
    SORCERER("Sorcerer"),
    WARLOCK("Warlock"),
    WIZARD("Wizard");

    private String jobs;

    Job(String jobs){ this.jobs = jobs; }

    @Override public String toString() {
        return jobs;
    }
}
