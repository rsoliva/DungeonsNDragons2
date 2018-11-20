package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import csc472.depaul.edu.dungeonsndragons.Jobs.AbstractJob;
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

public class ChracterDisplayScreen2 extends AppCompatActivity implements View.OnClickListener {
    //strength skills
    TextView athletics;
    //wisdom skills
    TextView animalHandling, insight, medicine, survival, perception;
    //dex skills
    TextView stealth, acrobatics, sleight;
    //intelligence skills
    TextView arcane, history, investigation, nature, religion;
    //charisma skills
    TextView decept, intimidate, persuade, perform;

    //stores skills
    Intent skillsIntent;

    Button info,skills,combat,inventory;
    String hitDie;

    CharacterMethods dummy;
    int sMod, dMod, cMod, iMod, wMod, chMod;
    int ssMod = 0, ddMod = 0, ccMod = 0, iiMod = 0, wwMod = 0, chchMod = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chracter_display_screen2);

        getCharInfo();
//        wrapCharacter();
        calcModifiers();
        bindViews();



        updateUIText();
        info = findViewById(R.id.Info);
        if (info != null)
            info.setOnClickListener(this);

        skills = findViewById(R.id.Skills);
        if (skills != null)
            skills.setOnClickListener(this);

        combat = findViewById(R.id.Combat);
        if (combat != null)
            combat.setOnClickListener(this);

        inventory = findViewById(R.id.Inventory);
        if (inventory != null)
            inventory.setOnClickListener(this);
    }

    private void bindViews(){
        athletics = findViewById(R.id.athleticsVal);

        animalHandling = findViewById(R.id.animalHandleVal);
        insight = findViewById(R.id.insightVal);
        medicine = findViewById(R.id.medVal);
        survival = findViewById(R.id.survivalVal);
        perception = findViewById(R.id.perceptionVal);

        stealth = findViewById(R.id.stealthVal);
        acrobatics = findViewById(R.id.acroVal);
        sleight = findViewById(R.id.sohVal);

        arcane = findViewById(R.id.arcanaVal);
        history = findViewById(R.id.historyVal);
        investigation = findViewById(R.id.investVal);
        nature = findViewById(R.id.natureVal);
        religion = findViewById(R.id.relgionVal);

        decept = findViewById(R.id.deceptionVal);
        intimidate = findViewById(R.id.intimidationVal);
        persuade = findViewById(R.id.persuasionVal);
        perform = findViewById(R.id.performanceVal);
    }

    private void getCharInfo(){
        Bundle b = getIntent().getExtras();
        dummy = (Character)b.getParcelable("characterInfo");
    }

    private void calcModifiers(){
        sMod = getMod(dummy.GetStrength());
        dMod = getMod(dummy.GetDexterity());
        cMod = getMod(dummy.GetConstitution());
        iMod = getMod(dummy.GetIntelligence());
        wMod = getMod(dummy.GetWisdom());
        chMod = getMod(dummy.GetCharisma());
    }

    private int getMod(int score){
        return (int)(Math.floor(score / 2 - 5));
    }

    private void updateUIText()
    {
        hitDie = dummy.GetDie();
        WrapJob();
        String[] savingThrows = dummy.GetSavingThrows();
        for (String s : savingThrows)
        {
            if (s.equals("STRENGTH"))
            {
                ssMod = 2;
            }
            else if (s.equals("DEXTERITY"))
            {
                ddMod = 2;
            }
            else if (s.equals("WISDOM"))
            {
                wwMod = 2;
            }
            else if (s.equals("INTELLIGENCE"))
            {
                iiMod = 2;
            }
            else if (s.equals("CHARISMA"))
            {
                chchMod = 2;
            }
        }

        dummy = new Character(dummy);

        athletics.setText(Integer.toString(sMod + ssMod));

        animalHandling.setText(Integer.toString(wMod + wwMod));
        insight.setText(Integer.toString(wMod + wwMod));
        medicine.setText(Integer.toString(wMod + wwMod));
        survival.setText(Integer.toString(wMod + wwMod));
        perception.setText(Integer.toString(wMod + wwMod));

        stealth.setText(Integer.toString(dMod + ddMod));
        acrobatics.setText(Integer.toString(dMod + ddMod));
        sleight.setText(Integer.toString(dMod + ddMod));

        arcane.setText(Integer.toString(iMod + iiMod));
        history.setText(Integer.toString(iMod + iiMod));
        investigation.setText(Integer.toString(iMod + iiMod));
        nature.setText(Integer.toString(iMod + iiMod));
        religion.setText(Integer.toString(iMod + iiMod));

        decept.setText(Integer.toString(chMod + chchMod));
        intimidate.setText(Integer.toString(chMod + chchMod));
        persuade.setText(Integer.toString(chMod + chchMod));
        perform.setText(Integer.toString(chMod + chchMod));

    }
    @Override
    public void onClick(View v) {
        dummy.SetDie(hitDie);
        switch(v.getId()){

            case R.id.Info:
                Intent skillsScreen = new Intent(this, CharacterMainDisplayScreen.class);
                skillsScreen.putExtra("characterInfo", (Character)dummy);
                startActivity(skillsScreen);
                break;

            case R.id.Skills:
                break;

            case R.id.Inventory:

                Intent inventory = new Intent(this, Inventory.class);
                inventory.putExtra("characterInfo", (Character)dummy);
                startActivity(inventory);
                break;

            case R.id.Combat:
                Intent combat = new Intent(this, CombatActivity.class);
                combat.putExtra("characterInfo", (Character)dummy);
                startActivity(combat);
                break;
        }

    }

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

}
