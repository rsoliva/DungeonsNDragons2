package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import csc472.depaul.edu.dungeonsndragons.Jobs.Job;
import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;
import csc472.depaul.edu.dungeonsndragons.Races.Race;
import csc472.depaul.edu.dungeonsndragons.Backgrounds.Background;


public class CreationScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText name;
    Spinner RaceVals, JobVals, BGVals;
    Button next;
    String characterName;
    String characterRace, characterClass, characterBackground;
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

       /* ArrayAdapter<Race> raceAdapter = ArrayAdapter.createFromResource(this, R.array.RaceList, android.R.layout.simple_spinner_item);
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Race.setAdapter(raceAdapter);
        Race.setOnItemSelectedListener(this);*/

        RaceVals.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Race.values()));
        RaceVals.setOnItemSelectedListener(this);

        JobVals.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Job.values()));
        JobVals.setOnItemSelectedListener(this);

        BGVals.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Background.values()));
        BGVals.setOnItemSelectedListener(this);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                characterName = name.getText().toString();
                generateStatActivity();
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

   /* private void WrapRace()
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
    }*/

   /* private void WrapJob()
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
    }*/
}
