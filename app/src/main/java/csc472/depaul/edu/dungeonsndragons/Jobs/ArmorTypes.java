package csc472.depaul.edu.dungeonsndragons.Jobs;

//Enum of all armor variants
public enum ArmorTypes
{
    NONE("None"),
    LIGHT("Light"),
    MEDIUM("Medium"),
    HEAVY("Heavy"),
    ALL("All"),
    SHIELDS("Shields");

    private String typeVal;

    ArmorTypes(String typeVal)
    {
        this.typeVal = typeVal;
    }

    public String getTypeVal()
    {
        return typeVal;
    }
}
