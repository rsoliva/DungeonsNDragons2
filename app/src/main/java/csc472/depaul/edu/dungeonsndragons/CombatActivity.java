package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

public class CombatActivity extends AppCompatActivity implements View.OnClickListener{

//    EditText currentInventory;
    Button Info,Skills,Inventory,Combat;
//    String currentInventorydata;
    CharacterMethods dummy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combat);

        getCharInfo();
//        currentInventory = findViewById(R.id.inventoryText);
        Info = findViewById(R.id.Info);
        Skills = findViewById(R.id.Skills);
        Inventory = findViewById(R.id.Inventory);

        Inventory.setOnClickListener(this);
        Skills.setOnClickListener(this);
        Info.setOnClickListener(this);

        if (dummy.GetJob().compareTo("Sorcerer") == 0)
        {
            SetSorcerer();
        }
    }

    private void SetSorcerer()
    {
        TableLayout magTab = findViewById(R.id.magicTable);
        magTab.setVisibility(View.VISIBLE);
    }

    private void getCharInfo(){
        Bundle b = getIntent().getExtras();
        if(b != null)
            dummy = (Character)b.getParcelable("characterInfo");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Info:
                Intent mainScreen = new Intent(this, CharacterMainDisplayScreen.class);
                mainScreen.putExtra("characterInfo", (Character)dummy);
                startActivity(mainScreen);
                break;
            case R.id.Skills:
                Intent skillScreen = new Intent(this, ChracterDisplayScreen2.class);
                skillScreen.putExtra("characterInfo", (Character)dummy);
                startActivity(skillScreen);
                break;
            case R.id.Inventory:
                Intent inventory = new Intent(this, Inventory.class);
                inventory.putExtra("characterInfo", (Character)dummy);
                startActivity(inventory);
                break;
        }

    }
}
