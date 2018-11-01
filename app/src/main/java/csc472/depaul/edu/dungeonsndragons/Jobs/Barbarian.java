package csc472.depaul.edu.dungeonsndragons.Jobs;

public class Barbarian extends AbstractJob
{
    Barbarian()
    {
        this.DIE = DieType.D12;
        this.PRIMARY_STAT = new Stats[] {Stats.STRENGTH};
        this.SAVING_THROW = new Stats[] {Stats.STRENGTH, Stats.CONSTITUTION};
        this.ARMOR_PROF = new ArmorTypes[] {ArmorTypes.LIGHT, ArmorTypes.MEDIUM, ArmorTypes.SHIELDS};
        this.SM_PROF = new SimpleMelee[] {SimpleMelee.ALL};
        this.SR_PROF = new SimpleRange[] {SimpleRange.ALL};
        this.MM_PROF = new MartialMelee[] {MartialMelee.ALL};
        this.MR_PROF = new MartialRange[] {MartialRange.ALL};
    }
}
