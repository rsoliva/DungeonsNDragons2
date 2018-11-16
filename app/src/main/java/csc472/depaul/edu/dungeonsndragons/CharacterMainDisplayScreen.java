package csc472.depaul.edu.dungeonsndragons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

public class CharacterMainDisplayScreen extends AppCompatActivity {

    CharacterMethods dummy;
    TextView dStr, dDex, dCon, dInt, dWis, dCha;
    TextView dName, dClass, dBackground;
    TextView strMod, dexMod, conMod, intMod, wisMod, chaMod;
    TextView initiative, proficiency, speed, hitDie, armorVal, hpVal;
//    View screen;
    int sMod, dMod, cMod, iMod, wMod, chMod;
//    float x1 = 0;
//    float x2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_main_display_screen);
//        screen = findViewById(R.id.mainScreen);
//        screen.setOnTouchListener(this);
        getCharInfo();
        wrapCharacter();
        calcModifiers();
        bindViews();
        updateUIText();
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
    private void wrapCharacter(){
        WrapRace();
        WrapJob();
    }

    private void bindViews(){
        //General
        dName = findViewById(R.id.nameVal);
        dBackground = findViewById(R.id.BackgroundVal);
        dClass = findViewById(R.id.classVal);
        initiative = findViewById(R.id.initText);
        proficiency = findViewById(R.id.profVal);
        speed = findViewById(R.id.spdVal);
        hitDie = findViewById(R.id.diceVal);
        armorVal = findViewById(R.id.armorVal);
        hpVal = findViewById(R.id.hpVal);

        //Ability Scores
        dStr = findViewById(R.id.strVal);
        dDex = findViewById(R.id.dexVal);
        dCon = findViewById(R.id.costVal);
        dInt = findViewById(R.id.intVal);
        dWis = findViewById(R.id.wisVal);
        dCha = findViewById(R.id.charVal);

        //modifiers
        strMod = findViewById(R.id.strModVal);
        dexMod = findViewById(R.id.dexModVal);
        conMod = findViewById(R.id.costModVal);
        intMod = findViewById(R.id.intModVal);
        wisMod = findViewById(R.id.wisModVal);
        chaMod = findViewById(R.id.charModVal);
    }

    //METHOD to update UI Text
    private void updateUIText(){
        dName.setText(dummy.GetName());
        dBackground.setText(dummy.GetBackground());
        dClass.setText(dummy.GetJob());
        initiative.setText(Integer.toString(dMod));
        hitDie.setText(dummy.GetDie());
        proficiency.setText("+2");
        speed.setText(Integer.toString(dummy.GetSpeed()));
        armorVal.setText(Integer.toString(dMod + 10 ));
        setHP();


        //Ability scores
        dStr.setText(Integer.toString(dummy.GetStrength()));
        dDex.setText(Integer.toString(dummy.GetDexterity()));
        dCon.setText(Integer.toString(dummy.GetConstitution()));
        dInt.setText(Integer.toString(dummy.GetIntelligence()));
        dWis.setText(Integer.toString(dummy.GetWisdom()));
        dCha.setText(Integer.toString(dummy.GetCharisma()));

        //Ability Score Modifiers
        strMod.setText(Integer.toString(sMod));
        dexMod.setText(Integer.toString(dMod));
        conMod.setText(Integer.toString(cMod));
        intMod.setText(Integer.toString(iMod));
        wisMod.setText(Integer.toString(wMod));
        chaMod.setText(Integer.toString(chMod));
    }

    //METHOD to update HP Text
    private void setHP(){
        switch (dummy.GetDie()){
            case "1d6":
                hpVal.setText("6");
                break;
            case "1d8":
                hpVal.setText("8");
                break;
            case "1d10":
                hpVal.setText("10");
                break;
            case "1d12":
                hpVal.setText("12");
                break;
        }
    }

    //Gets info from previous activity into this one
    private void getCharInfo(){
        Bundle b = getIntent().getExtras();
        if(b != null)
            dummy = (Character)b.getParcelable("characterInfo");
    }

    //Wraps race onto the character
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

    //wraps job/class onto the character
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

//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        switch(event.getAction())
//        {
//            case MotionEvent.ACTION_DOWN:
//                x1 = event.getX();
//                break;
//            case MotionEvent.ACTION_UP:
//                x2 = event.getX();
//                float deltaX = x2 - x1;
//                Log.d("distance", Float.toString(deltaX));
//                Log.d("touched", Float.toString(x2));
//                if (Math.abs(deltaX) > 10)
//                {
//                    Toast.makeText(this, "left2right swipe", Toast.LENGTH_SHORT).show ();
//                }
//                else
//                {
//                    // consider as something else - a screen tap for example
//                }
//                break;
//        }
//        return false;
//    }
}
