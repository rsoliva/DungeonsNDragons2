package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GenerateStatActivity extends AppCompatActivity {

    String name, race, job, background;
    Character dummy;

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

        mainScreen.putExtra("characterInfo", dummy);
        startActivity(mainScreen);

    }
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
        Log.d("testAttr", "str is: " + dummy.GetStrength());


    }

    private void pullCharInfo(){
        Bundle b = getIntent().getExtras();
        dummy = (Character)b.getParcelable("characterInfo");
        name = dummy.GetName();
        race = dummy.GetRace();
        job = dummy.GetJob();
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
}
