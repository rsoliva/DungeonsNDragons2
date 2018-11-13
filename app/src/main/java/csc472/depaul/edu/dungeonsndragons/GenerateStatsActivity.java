package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

public class GenerateStatsActivity extends AppCompatActivity implements View.OnClickListener{

    String name, race, job, background;
    CharacterMethods dummy;

    TextView s,d,c,i,w,ch,ptsLeft;
    Button su,sd,du,dd,cu,cd,iu,id,wu,wd,chu,chd,next,roll;

    int strScore, dexScore, conScore, intScore, wisScore, chaScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_stats);

        strScore = dexScore = conScore = intScore = wisScore = chaScore = 8;

        pullCharInfo();
        bindViews();
        bindButtons();

        //handle score increasing and stuff
        //handleScore()

        //temporary
        Log.d("testAttr", "str is: " + strScore);

        //set onclicks for buttons
        setClickListener();
        storeNewInfo();

    }

    public void mainDisplayActivity() {
        Intent mainScreen = new Intent(this,  CharacterMainDisplayScreen.class);

        mainScreen.putExtra("characterInfo", (Character)dummy);
        startActivity(mainScreen);

    }

    private void storeNewInfo(){
        dummy.SetName(name);
        dummy.SetRace(race);
        dummy.SetJob(job);
//        dummy.SetBackground(background);

        dummy.SetStrength(strScore);
        dummy.SetDexterity(dexScore);
        dummy.SetConstitution(conScore);
        dummy.SetIntelligence(intScore);
        dummy.SetWisdom(wisScore);
        dummy.SetCharisma(chaScore);
        Log.d("testAttr", "str is: " + dummy.GetStrength());


    }

    private void pullCharInfo(){
        Bundle b = getIntent().getExtras();
        dummy = (Character)b.getParcelable("characterInfo");
        name = dummy.GetName();
        race = dummy.GetRace();
        job = dummy.GetJob();
    }

    private void bindButtons(){
        su = findViewById(R.id.STRU);
        sd = findViewById(R.id.STRD);
        du = findViewById(R.id.DEXU);
        dd = findViewById(R.id.DEXD);
        cu = findViewById(R.id.CONU);
        cd = findViewById(R.id.COND);
        iu = findViewById(R.id.INTU);
        id = findViewById(R.id.INTD);
        wu = findViewById(R.id.WISU);
        wd = findViewById(R.id.WISD);
        chu = findViewById(R.id.CHAU);
        chd = findViewById(R.id.CHAD);
    }
    private void bindViews(){
        //Ability scores
        s = findViewById(R.id.STRScore);
        d = findViewById(R.id.DEXScore);
        c = findViewById(R.id.CONScore);
        i = findViewById(R.id.INTScore);
        w = findViewById(R.id.WISScore);
        ch = findViewById(R.id.CHAScore);

        //Ability score buttons
        su = findViewById(R.id.STRU);
        sd = findViewById(R.id.STRD);
        du = findViewById(R.id.DEXU);
        dd = findViewById(R.id.DEXD);
        cu = findViewById(R.id.CONU);
        cd = findViewById(R.id.COND);
        iu = findViewById(R.id.INTU);
        id = findViewById(R.id.INTD);
        wu = findViewById(R.id.WISU);
        wd = findViewById(R.id.WISD);
        chu = findViewById(R.id.CHAU);
        chd = findViewById(R.id.CHAD);

        //Points Left
        ptsLeft = findViewById(R.id.ptsLeftNum);

        //Buttons
        next = findViewById(R.id.Next);
        roll = findViewById(R.id.Roll);

    }

    private void setClickListener(){
        su.setOnClickListener(this);
        sd.setOnClickListener(this);
        du.setOnClickListener(this);
        dd.setOnClickListener(this);
        cu.setOnClickListener(this);
        cd.setOnClickListener(this);
        iu.setOnClickListener(this);
        id.setOnClickListener(this);
        wu.setOnClickListener(this);
        wd.setOnClickListener(this);
        chu.setOnClickListener(this);
        chd.setOnClickListener(this);
        next.setOnClickListener(this);
        roll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.STRU:
                strScore = increaseScore(s);
                break;

            case R.id.STRD:
                strScore = decreaseScore(s);
                break;

            case R.id.DEXU:
                dexScore = increaseScore(d);
                break;

            case R.id.DEXD:
                dexScore = decreaseScore(d);
                break;

            case R.id.CONU:
                conScore = increaseScore(c);
                break;

            case R.id.COND:
                conScore = decreaseScore(c);
                break;

            case R.id.INTU:
                intScore = increaseScore(i);
                break;

            case R.id.INTD:
                intScore = decreaseScore(i);
                break;

            case R.id.WISU:
                wisScore = increaseScore(w);
                break;

            case R.id.WISD:
                wisScore = decreaseScore(w);
                break;

            case R.id.CHAU:
                chaScore = increaseScore(ch);
                break;

            case R.id.CHAD:
                chaScore = decreaseScore(ch);
                break;
            case R.id.Next:
                mainDisplayActivity();
                break;
            case R.id.Roll:
                ptsLeft.setText(Integer.toString(0));
                randomizeStats();
                s.setText(Integer.toString(strScore));
                d.setText(Integer.toString(dexScore));
                c.setText(Integer.toString(conScore));
                i.setText(Integer.toString(intScore));
                w.setText(Integer.toString(wisScore));
                ch.setText(Integer.toString(chaScore));
                hideButtons();

                break;
            default:
                break;
        }
        storeNewInfo();
    }

    private void hideButtons(){
        sd.setVisibility(View.INVISIBLE);
        su.setVisibility(View.INVISIBLE);
        du.setVisibility(View.INVISIBLE);
        dd.setVisibility(View.INVISIBLE);
        cu.setVisibility(View.INVISIBLE);
        cd.setVisibility(View.INVISIBLE);
        iu.setVisibility(View.INVISIBLE);
        id.setVisibility(View.INVISIBLE);
        wu.setVisibility(View.INVISIBLE);
        wd.setVisibility(View.INVISIBLE);
        chu.setVisibility(View.INVISIBLE);
        chd.setVisibility(View.INVISIBLE);

    }
    private int increaseScore(TextView v) {
        int num = Integer.parseInt(v.getText().toString());
        int ptsRem = Integer.parseInt(ptsLeft.getText().toString());
        switch(num) {
            case 8:
                if(ptsRem != 0) {
                    num++;
                    ptsRem--;
                }
                break;
            case 9:
                num++;
                ptsRem--;
                break;
            case 10:
                num++;
                ptsRem--;
                break;
            case 11:
                num++;
                ptsRem--;
                break;
            case 12:
                num++;
                ptsRem--;
                break;
            case 13:
                if(ptsRem > 1){
                    num++;
                    ptsRem--;
                    ptsRem--;
                }
                break;
            case 14:
                if(ptsRem > 1){
                    num++;
                    ptsRem--;
                    ptsRem--;
                }
                break;
            case 15:
                break;

        }
        v.setText(Integer.toString(num));
        ptsLeft.setText(Integer.toString(ptsRem));
        return num;
    }

    private int decreaseScore(TextView v) {
        int num = Integer.parseInt(v.getText().toString());
        int ptsRem = Integer.parseInt(ptsLeft.getText().toString());
        switch(num) {
            case 8:
                break;
            case 9:
                num--;
                ptsRem++;
                break;
            case 10:
                num--;
                ptsRem++;
                break;
            case 11:
                num--;
                ptsRem++;
                break;
            case 12:
                num--;
                ptsRem++;
                break;
            case 13:
                num--;
                ptsRem++;
                break;
            case 14:
                num--;
                ptsRem++;
                ptsRem++;
                break;
            case 15:
                num--;
                ptsRem++;
                ptsRem++;
                break;

        }
        v.setText(Integer.toString(num));
        ptsLeft.setText(Integer.toString(ptsRem));
        return num;

    }

    private void randomizeStats(){
        for(int i = 0; i < 6; i++){
            int d1 = getRandomInteger(6, 1);
            int d2 = getRandomInteger(6, 1);
            int d3 = getRandomInteger(6, 1);
            int d4 = getRandomInteger(6, 1);
            int lowest = d1;
            if(d2 < lowest) lowest = d2;
            if(d3 < lowest) lowest = d3;
            if(d4 < lowest) lowest = d4;

            if(i == 0) strScore = d1 + d2 + d3 + d4 - lowest;
            else if (i == 1) dexScore = d1 + d2 + d3 + d4 - lowest;
            else if (i == 2) conScore = d1 + d2 + d3 + d4 - lowest;
            else if (i == 3) intScore = d1 + d2 + d3 + d4 - lowest;
            else if (i == 4) wisScore = d1 + d2 + d3 + d4 - lowest;
            else if (i == 5) chaScore = d1 + d2 + d3 + d4 - lowest;
        }

    }
    private int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
}
