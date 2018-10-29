package csc472.depaul.edu.dungeonsndragons.Jobs;

public enum DieType
{
    D6      (6),
    D8      (8),
    D10     (10),
    D12     (12);

    private int typeVal;

    DieType(int typeVal) {
        this.typeVal = typeVal;
    }

    public int getTypeVal() {
        return typeVal;
    }
}
