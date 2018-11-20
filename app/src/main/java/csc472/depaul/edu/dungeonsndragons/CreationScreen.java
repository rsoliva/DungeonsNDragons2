package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Spinner;

import java.util.ArrayList;

import csc472.depaul.edu.dungeonsndragons.Jobs.Job;
import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;
import csc472.depaul.edu.dungeonsndragons.Races.Race;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Background;


public class CreationScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText name;
    Spinner RaceVals, JobVals, BGVals;
    Button next, weaponSelectBtn,skillSelectBtn;
    String characterName;
    String characterRace, characterClass, characterBackground;

    ArrayList<String>SelectedSkills;
    SkillSelectDialogFragment skillSelect;
    WeaponSelectDialogFragment weaponSelectDialog ;
    SkillSelectDialogFragment skillSelectDialog;




    Enum dummyRace, dummyClass;
    CharacterMethods dummy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_screen);

        name = findViewById(R.id.editText);
        RaceVals = findViewById(R.id.Race);
        JobVals = findViewById(R.id.Class);
        BGVals = findViewById(R.id.BackgroundText);
        next = findViewById(R.id.button);

        weaponSelectBtn = findViewById(R.id.weaponSelectBtn);
        skillSelectBtn = findViewById(R.id.SkillSelectBtn);

       /* ArrayAdapter<Race> raceAdapter = ArrayAdapter.createFromResource(this, R.array.RaceList, android.R.layout.simple_spinner_item);
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Race.setAdapter(raceAdapter);
        Race.setOnItemSelectedListener(this);*/

        RaceVals.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Race.values()));
        RaceVals.setOnItemSelectedListener(this);

        JobVals.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Job.values()));
        JobVals.setOnItemSelectedListener(this);

//        JobVals.setOnItemClickListener(this);


        BGVals.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Background.values()));
        BGVals.setOnItemSelectedListener(this);

        weaponSelectDialog = new WeaponSelectDialogFragment(this);
        skillSelectDialog = new SkillSelectDialogFragment(this);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                characterName = name.getText().toString();
                generateStatActivity();
            }
        });

        weaponSelectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                weaponSelectDialog.show();
            }
        });

        skillSelectBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                skillSelectDialog.show();



            }
        });

    }

    private void generateStatActivity(){
        Intent genStat = new Intent(this, GenerateStatsActivity.class);
//        Intent characterMain = new Intent(this, characterDisplayScreen.class);
        dummy = new Character();
        dummy.SetName(characterName);
        dummy.SetRace(characterRace);
        dummy.SetJob(characterClass);
        dummy.SetBackground(characterBackground);
        SelectedSkills = skillSelectDialog.getSkillsList();
        ((Character)dummy).SkillList =SelectedSkills;
        genStat.putExtra("characterInfo", (Character) dummy);

        //WrapRace();
        //WrapJob();

        //genStat.putExtra("characterInfo", (Parcelable) dummy);
        startActivity(genStat);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch(parent.getId()) {
            case R.id.Race:
                characterRace = (RaceVals.getSelectedItem()).toString();
            case R.id.Class:
                characterClass = (JobVals.getSelectedItem()).toString();
           case R.id.BackgroundText:
                characterBackground = (BGVals.getSelectedItem()).toString();
        }
    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
