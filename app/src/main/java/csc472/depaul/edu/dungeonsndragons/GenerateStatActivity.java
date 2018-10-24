package csc472.depaul.edu.dungeonsndragons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GenerateStatActivity extends AppCompatActivity {

    int strength,dexterity,constitution,intelligence,wisdom,charisma;
    TextView s,d,c,i,w,ch;
    Button su,sd,du,dd,cu,cd,iu,id,wu,wd,chu,chd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_stat);

        s = findViewById(R.id.strScore);
        d = findViewById(R.id.dexScore);
        c = findViewById(R.id.conScore);
        i = findViewById(R.id.intScore);
        w = findViewById(R.id.wisScore);
        ch = findViewById(R.id.chaScore);

        su = findViewById(R.id.stru);




    }
}
