package csc472.depaul.edu.dungeonsndragons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CharacterSheetMain extends AppCompatActivity {

    TextView charName,charRace,charClass;
    String name, race, job;
    Object b;
    Character dummy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_sheet_main);

        charName = findViewById(R.id.charName);
        charRace = findViewById(R.id.charRace);
        charClass = findViewById(R.id.charClass);

        Bundle b = getIntent().getExtras();
        dummy = (Character)b.getParcelable("characterInfo");
        name = dummy.GetName();
        race = dummy.GetRace();
        job = dummy.GetJob();

        charName.setText(name);
        charRace.setText(race);
        charClass.setText(job);
    }
}
