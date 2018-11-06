package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import csc472.depaul.edu.dungeonsndragons.Backgrounds.Acolyte;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Background;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Charlatan;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Criminal;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Entertainer;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.FolkHero;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.GuildArtisan;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Hermit;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Noble;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Outlander;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Sage;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Sailor;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Soldier;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Urchin;
import csc472.depaul.edu.dungeonsndragons.Jobs.Barbarian;
import csc472.depaul.edu.dungeonsndragons.Jobs.Bard;
import csc472.depaul.edu.dungeonsndragons.Jobs.Cleric;
import csc472.depaul.edu.dungeonsndragons.Jobs.Druid;
import csc472.depaul.edu.dungeonsndragons.Jobs.Fighter;
import csc472.depaul.edu.dungeonsndragons.Jobs.Monk;
import csc472.depaul.edu.dungeonsndragons.Jobs.Paladin;
import csc472.depaul.edu.dungeonsndragons.Jobs.Ranger;
import csc472.depaul.edu.dungeonsndragons.Jobs.Rogue;
import csc472.depaul.edu.dungeonsndragons.Jobs.Sorcerer;
import csc472.depaul.edu.dungeonsndragons.Jobs.Warlock;
import csc472.depaul.edu.dungeonsndragons.Jobs.Wizard;
import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;
import csc472.depaul.edu.dungeonsndragons.Races.DarkElf;
import csc472.depaul.edu.dungeonsndragons.Races.Dragonborn;
import csc472.depaul.edu.dungeonsndragons.Races.ForestGnome;
import csc472.depaul.edu.dungeonsndragons.Races.Half_Elf;
import csc472.depaul.edu.dungeonsndragons.Races.Half_Orc;
import csc472.depaul.edu.dungeonsndragons.Races.HighElf;
import csc472.depaul.edu.dungeonsndragons.Races.HillDwarf;
import csc472.depaul.edu.dungeonsndragons.Races.Human;
import csc472.depaul.edu.dungeonsndragons.Races.LightfootHalfling;
import csc472.depaul.edu.dungeonsndragons.Races.MountainDwarf;
import csc472.depaul.edu.dungeonsndragons.Races.RockGnome;
import csc472.depaul.edu.dungeonsndragons.Races.StoutHalfling;
import csc472.depaul.edu.dungeonsndragons.Races.Tiefling;
import csc472.depaul.edu.dungeonsndragons.Races.WoodElf;

public class GenerateStatActivity extends AppCompatActivity {

    String name, race, job, background;
    CharacterMethods dummy;

    int strength,dexterity,constitution,intelligence,wisdom,charisma;
    TextView s,d,c,i,w,ch,ptsLeft;
    Button su,sd,du,dd,cu,cd,iu,id,wu,wd,chu,chd,next;

    int strScore, dexScore, conScore, intScore, wisScore, chaScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_stat);

        pullCharInfo();
        bindViews();

        //handle score increasing and stuff
        //handleScore()

        //temporary
        strScore = Integer.parseInt(s.getText().toString());
        dexScore = Integer.parseInt(d.getText().toString());
        conScore = Integer.parseInt(c.getText().toString());
        intScore = Integer.parseInt(i.getText().toString());
        wisScore = Integer.parseInt(w.getText().toString());
        chaScore = Integer.parseInt(ch.getText().toString());
        Log.d("testAttr", "str is: " + strScore);

        storeNewInfo();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainDisplayActivity();
            }
        });
    }

    public void mainDisplayActivity() {
        Intent mainScreen = new Intent(this, characterDisplayScreen.class);

        mainScreen.putExtra("characterInfo", (Character)dummy);
        startActivity(mainScreen);

    }

    //Saves the data into the character
    private void storeNewInfo(){
        dummy.SetName(name);
        dummy.SetRace(race);
        dummy.SetJob(job);
        dummy.SetBackground(background);

        dummy.SetStrength(strScore);
        dummy.SetDexterity(dexScore);
        dummy.SetConstitution(conScore);
        dummy.SetIntelligence(intScore);
        dummy.SetWisdom(wisScore);
        dummy.SetCharisma(chaScore);

        //Wrap all of the subsets
        WrapRace();
        WrapJob();
        WrapBackground();

        Log.d("testAttr", "TESTER: Strength is: " + dummy.GetStrength());
        Log.d("testAttr", "TESTER: Dexterity is: " + dummy.GetDexterity());
        Log.d("testAttr", "TESTER: Constitution is: " + dummy.GetConstitution());
        Log.d("testAttr", "TESTER: Intelligence is: " + dummy.GetIntelligence());
        Log.d("testAttr", "TESTER: Wisdom is: " + dummy.GetWisdom());
        Log.d("testAttr", "TESTER: Charisma is: " + dummy.GetCharisma());
    }

    //Grabs info from the parceable
    private void pullCharInfo(){
        Bundle b = getIntent().getExtras();
        dummy = (Character)b.getParcelable("characterInfo");
        name = dummy.GetName();
        race = dummy.GetRace();
        job = dummy.GetJob();
        background = dummy.GetBackground();
    }

    private void bindViews(){
        //Ability scores
        s = findViewById(R.id.strScore);
        d = findViewById(R.id.dexScore);
        c = findViewById(R.id.conScore);
        i = findViewById(R.id.intScore);
        w = findViewById(R.id.wisScore);
        ch = findViewById(R.id.chaScore);

        //Ability score buttons
        su = findViewById(R.id.stru);
        sd = findViewById(R.id.strd);
        du = findViewById(R.id.dexu);
        dd = findViewById(R.id.dexd);
        cu = findViewById(R.id.conu);
        cd = findViewById(R.id.cond);
        iu = findViewById(R.id.intu);
        id = findViewById(R.id.intd);
        wu = findViewById(R.id.wisu);
        wd = findViewById(R.id.wisd);
        chu = findViewById(R.id.chau);
        chd = findViewById(R.id.chad);

        //Points Left
        ptsLeft = findViewById(R.id.pointsLeftNum);

        //Buttons
        next = findViewById(R.id.button);

    }

    //Race Wrapper
    private void WrapRace()
    {
        //dummy = new DarkElf(dummy)
        switch (dummy.GetRace())
        {
            case "Dark Elf":
                dummy = new DarkElf(dummy);
                break;
            case "Dragonborn":
                dummy = new Dragonborn(dummy);
                break;
            case "Forest Gnome":
                dummy = new ForestGnome(dummy);
                break;
            case "Half Elf":
                dummy = new Half_Elf(dummy);
                break;
            case  "Half Orc":
                dummy = new Half_Orc(dummy);
                break;
            case "High Elf":
                dummy = new HighElf(dummy);
                break;
            case "Hill Dwarf":
                dummy = new HillDwarf(dummy);
                break;
            case "Human":
                dummy = new Human(dummy);
                break;
            case "Lightfoot Halfling":
                dummy = new LightfootHalfling(dummy);
                break;
            case "Mountain Dwarf":
                dummy = new MountainDwarf(dummy);
                break;
            case "Rock Gnome":
                dummy = new RockGnome(dummy);
                break;
            case "Stock Halfling":
                dummy = new StoutHalfling(dummy);
                break;
            case "Tiefling":
                dummy = new Tiefling(dummy);
                break;
            case "Wood Elf":
                dummy = new WoodElf(dummy);
                break;
            default:
                dummy = new Human(dummy);
        }
    }

    //Job Wrapper
    private void WrapJob()
    {
        switch (dummy.GetJob())
        {
            case "Barbarian":
                dummy = new Barbarian(dummy);
                break;
            case  "Bard":
                dummy = new Bard(dummy);
                break;
            case "Cleric":
                dummy = new Cleric(dummy);
                break;
            case "Druid":
                dummy = new Druid(dummy);
                break;
            case "Fighter":
                dummy = new Fighter(dummy);
                break;
            case "Monk":
                dummy = new Monk(dummy);
                break;
            case "Paladin":
                dummy = new Paladin(dummy);
                break;
            case "Ranger":
                dummy = new Ranger(dummy);
                break;
            case "Rogue":
                dummy = new Rogue(dummy);
                break;
            case "Sorcerer":
                dummy = new Sorcerer(dummy);
            case "Warlock":
                dummy = new Warlock(dummy);
                break;
            case "Wizard":
                dummy = new Wizard(dummy);
                break;
            default:
                dummy = new Monk(dummy);
        }
    }

    //Background Wrapper
    private void WrapBackground()
    {
        switch (dummy.GetBackground())
        {
            case "Acolyte":
                dummy = new Acolyte(dummy);
                break;
            case "Charlatan":
                dummy = new Charlatan(dummy);
                break;
            case "Criminal":
                dummy = new Criminal(dummy);
                break;
            case "Entertainer":
                dummy = new Entertainer(dummy);
                break;
            case "Folk Hero":
                dummy = new FolkHero(dummy);
                break;
            case "Guild Artisan":
                dummy = new GuildArtisan(dummy);
                break;
            case "Hermit":
                dummy = new Hermit(dummy);
                break;
            case "Noble":
                dummy = new Noble(dummy);
                break;
            case "Outlander":
                dummy = new Outlander(dummy);
                break;
            case "Sage":
                dummy = new Sage(dummy);
                break;
            case "Sailor":
                dummy = new Sailor(dummy);
                break;
            case "Soldier":
                dummy = new Soldier(dummy);
                break;
            case "Urchin":
                dummy = new Urchin(dummy);
                break;
            default:
                dummy = new Acolyte(dummy);
        }
    }
}
