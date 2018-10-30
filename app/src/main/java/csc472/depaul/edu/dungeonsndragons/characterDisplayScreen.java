package csc472.depaul.edu.dungeonsndragons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class characterDisplayScreen extends AppCompatActivity {

    Character dummy;
    EditText dStr, dDex, dCon, dInt, dWis, dCha;
    TextView dName, dRace, dClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_display_screen);

        getCharInfo();
        bindViews();
        updateUIText();

    }

    private void bindViews(){
        dName = findViewById(R.id.Name);
        dRace = findViewById(R.id.Race);
        dClass = findViewById(R.id.className);

        dStr = findViewById(R.id.strNum);
        dDex = findViewById(R.id.dexNum);
        dCon = findViewById(R.id.conNum);
        dInt = findViewById(R.id.intNum);
        dWis = findViewById(R.id.wisNum);
        dCha = findViewById(R.id.chaNum);
    }

    private void updateUIText(){
        dName.setText(dummy.GetName());
        dRace.setText(dummy.GetRace());
        dClass.setText(dummy.GetJob());
        Log.d("testAttr", "str is: " + dummy.GetStrength());
        dStr.setText(Integer.toString(dummy.GetStrength()));
        dDex.setText(Integer.toString(dummy.GetDexterity()));
        dCon.setText(Integer.toString(dummy.GetConstitution()));
        dInt.setText(Integer.toString(dummy.GetIntelligence()));
        dWis.setText(Integer.toString(dummy.GetWisdom()));
        dCha.setText(Integer.toString(dummy.GetConstitution()));

    }

    private void getCharInfo(){
        Bundle b = getIntent().getExtras();
        dummy = (Character)b.getParcelable("characterInfo");
    }
}
