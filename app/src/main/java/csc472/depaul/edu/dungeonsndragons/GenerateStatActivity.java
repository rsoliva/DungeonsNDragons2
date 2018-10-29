package csc472.depaul.edu.dungeonsndragons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GenerateStatActivity extends AppCompatActivity {

    String name, race, job;
    Character dummy;

    int strength,dexterity,constitution,intelligence,wisdom,charisma;
    TextView s,d,c,i,w,ch;
    Button su,sd,du,dd,cu,cd,iu,id,wu,wd,chu,chd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_stat);

        pullCharInfo();
        bindViews();

    }

    public void pullCharInfo(){
        Bundle b = getIntent().getExtras();
        dummy = (Character)b.getParcelable("characterInfo");
        name = dummy.GetName();
        race = dummy.GetRace();
        job = dummy.GetJob();
    }

    public void bindViews(){
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
    }
}
