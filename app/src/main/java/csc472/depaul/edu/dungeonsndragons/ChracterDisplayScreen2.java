package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

public class ChracterDisplayScreen2 extends AppCompatActivity implements View.OnClickListener {
    //strength skills
    TextView athletics;
    //wisdom skills
    TextView animalHandling, insight, medicine, survival;
    //dex skills
    TextView stealth, acrobatics, sleight;
    //intelligence skills
    TextView arcane, history, investigation, nature, religion;
    //charisma skills
    TextView decept, intimidate, persuade, perform;

    //stores skills
    Intent skillsIntent;

    Button info,skills,magic,inventory;

    CharacterMethods dummy;
    int sMod, dMod, cMod, iMod, wMod, chMod;


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
        info.setOnClickListener(this);

        skills = findViewById(R.id.Skills);
        skills.setOnClickListener(this);

        magic = findViewById(R.id.magic);
        magic.setOnClickListener(this);

        inventory = findViewById(R.id.Inventory);
        inventory.setOnClickListener(this);
    }

    private void bindViews(){
        athletics = findViewById(R.id.athleticsVal);

        animalHandling = findViewById(R.id.animalHandleVal);
        insight = findViewById(R.id.insightVal);
        medicine = findViewById(R.id.medVal);
        survival = findViewById(R.id.survivalVal);

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

    private void updateUIText() {
        athletics.setText(Integer.toString(sMod));

        animalHandling.setText(Integer.toString(wMod));
        insight.setText(Integer.toString(wMod));
        medicine.setText(Integer.toString(wMod));
        survival.setText(Integer.toString(wMod));

        stealth.setText(Integer.toString(dMod));
        acrobatics.setText(Integer.toString(dMod));
        sleight.setText(Integer.toString(dMod));

        arcane.setText(Integer.toString(iMod));
        history.setText(Integer.toString(iMod));
        investigation.setText(Integer.toString(iMod));
        nature.setText(Integer.toString(iMod));
        religion.setText(Integer.toString(iMod));

        decept.setText(Integer.toString(chMod));
        intimidate.setText(Integer.toString(chMod));
        persuade.setText(Integer.toString(chMod));
        perform.setText(Integer.toString(chMod));

    }
    @Override
    public void onClick(View v) {

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

//            case R.id.magic :
//                mainScreen = new Intent(this, Magic.class);
//                mainScreen.putExtra("characterInfo", (Character)dummy);
//                startActivity(mainScreen);


        }

    }



}
