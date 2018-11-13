package csc472.depaul.edu.dungeonsndragons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

public class ChracterDisplayScreen2 extends AppCompatActivity {
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

    CharacterMethods dummy;
    int sMod, dMod, cMod, iMod, wMod, chMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_display_screen);

        getCharInfo();
//        wrapCharacter();
        calcModifiers();
        bindViews();
        updateUIText();
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



}
