package csc472.depaul.edu.dungeonsndragons.Jobs;

//Enum of die types
public enum DieType
{
    D6      ("1d6"),
    D8      ("1d8"),
    D10     ("1d10"),
    D12     ("1d12");

    private String typeVal;

    DieType(String typeVal) {
        this.typeVal = typeVal;
    }



    @Override
    public String toString() {
        return typeVal;
    }
}
