package csc472.depaul.edu.dungeonsndragons.Jobs;

public class Fighter extends AbstractJob
{
    Fighter()
    {
        this.DIE = DieType.D10;
        this.PRIMARY_STAT = new Stats[] {Stats.STRENGTH};
        this.SAVING_THROW = new Stats[] {Stats.STRENGTH, Stats.CONSTITUTION};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.ALL};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.ALL};
        this.SR_PROF = new SimpleRange[] {SimpleRange.ALL};
        this.MM_PROF = new MartialMelee[] {MartialMelee.ALL};
        this.MR_PROF = new MartialRange[] {MartialRange.ALL};
    }

    public void SetPrimaryStat(Stats inStat)
    {
        this.PRIMARY_STAT[0] = inStat;
    }
}
