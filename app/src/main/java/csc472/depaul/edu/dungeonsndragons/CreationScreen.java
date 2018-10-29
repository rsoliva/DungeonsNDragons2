package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CreationScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText name;
    Spinner RaceVals, JobVals, Background;
    Button next;
    String characterName;
    String characterRace, characterClass, characterBackground;
    Enum dummyRace, dummyClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_screen);

        name = findViewById(R.id.editText);
        RaceVals = findViewById(R.id.Race);
        JobVals = findViewById(R.id.Class);
        Background = findViewById(R.id.Background);
        next = findViewById(R.id.button);

       /* ArrayAdapter<Race> raceAdapter = ArrayAdapter.createFromResource(this, R.array.RaceList, android.R.layout.simple_spinner_item);
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Race.setAdapter(raceAdapter);
        Race.setOnItemSelectedListener(this);*/

        RaceVals.setAdapter(new ArrayAdapter<Race>(this, android.R.layout.simple_list_item_1, Race.values()));
        RaceVals.setOnItemSelectedListener(this);

        JobVals.setAdapter(new ArrayAdapter<Job>(this, android.R.layout.simple_list_item_1, Job.values()));
        JobVals.setOnItemSelectedListener(this);

        /*ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this, R.array.ClassList, android.R.layout.simple_spinner_item);
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Class.setAdapter(classAdapter);
        Class.setOnItemSelectedListener(this);*/

        ArrayAdapter<CharSequence> backgroundAdapter = ArrayAdapter.createFromResource(this, R.array.BackgroundList, android.R.layout.simple_spinner_item);
        backgroundAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Background.setAdapter(backgroundAdapter);
        Background.setOnItemSelectedListener(this);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                characterName = name.getText().toString();
                generateStatActivity();
            }
        });

//        Character character = new Character((Race.characterRace, (Job)characterClass, (Background)characterBackground);

    }

    private void generateStatActivity(){
//        Intent intent = new Intent(this, GenerateStatActivity.class);
//        startActivity(intent);

        Intent characterMain = new Intent(this, CharacterSheetMain.class);
//        Bundle characterInfo = new Bundle();
//        characterInfo.putString("name", characterName);
//        characterInfo.putString("race", characterRace);
//        characterInfo.putString("job", characterClass);
//        characterMain.putExtra("characterInfo", characterInfo);
//        characterMain.putExtra("obj", dummy);
        Character dummy = new Character();
        dummy.SetName(characterName);
        dummy.SetRace(characterRace);
        dummy.SetJob(characterClass);
        characterMain.putExtra("characterInfo", dummy);
        startActivity(characterMain);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch(parent.getId()) {
            case R.id.Race:
                characterRace = (RaceVals.getSelectedItem()).toString();
            case R.id.Class:
                characterClass = (JobVals.getSelectedItem()).toString();
//                characterClass = parent.getItemAtPosition(position).toString();
//            case R.id.Background:
//                characterBackground = parent.getItemAtPosition(position);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
