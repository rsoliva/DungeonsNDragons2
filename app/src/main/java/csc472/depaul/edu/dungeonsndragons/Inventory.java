package csc472.depaul.edu.dungeonsndragons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;

public class Inventory extends AppCompatActivity implements View.OnClickListener {
    EditText currentWeaponInventory,currentEquipmentInventory,currentConsumableInventory;
    Button Info,Skills,Inventory,Combat;
    String currentWeaponInventoryData,currentEquipmentInventoryData,currentConsumableInventoryData = "";
    CharacterMethods dummy;
    Boolean isReached = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        getCharInfo();

        currentWeaponInventory = findViewById(R.id.WeaponlistText);
        currentEquipmentInventory = findViewById(R.id.EquipmentListText);
        currentConsumableInventory = findViewById(R.id.ConsumablesListText);



        currentWeaponInventoryData += currentWeaponInventory.getText() + "/n";
        currentEquipmentInventoryData += currentEquipmentInventory.getText()+ "/n";
        currentConsumableInventoryData += currentConsumableInventory.getText() + "/n";

        Info = findViewById(R.id.Info);
        Skills = findViewById(R.id.Skills);
        Inventory = findViewById(R.id.Inventory);
        Combat = findViewById(R.id.Combat);

        if (Combat != null)
            Combat.setOnClickListener(this);
        if (Inventory != null)
            Inventory.setOnClickListener(this);
        if (Skills != null)
            Skills.setOnClickListener(this);
        if (Info != null)
            Info.setOnClickListener(this);


//        currentInventory.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                if(currentInventory.getText().length() == 10 && !isReached){
//                    currentInventory.append("/n");
//                    isReached = true;
//                }
//                if(currentInventory.getText().length() < 10 && isReached) {
//                    isReached = false;
//                }
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

    }

    //Gets info from previous activity into this one
    private void getCharInfo(){
        Bundle b = getIntent().getExtras();
        if(b != null)
            dummy = (Character)b.getParcelable("characterInfo");

            currentWeaponInventoryData =b.getParcelable("WeaponInventoryData");
    }


    @Override
    public void onClick(View v) {
        currentWeaponInventoryData += currentWeaponInventory.getText() + "/n";
        currentEquipmentInventoryData += currentEquipmentInventory.getText()+ "/n";
        currentConsumableInventoryData += currentConsumableInventory.getText() + "/n";

        switch(v.getId()){
            case R.id.Info:
                Intent mainScreen = new Intent(this, CharacterMainDisplayScreen.class);
                mainScreen.putExtra("characterInfo", (Character)dummy);
                //mainScreen.putExtra("characterInventory",currentInventoryData);
                startActivity(mainScreen);
                break;
            case R.id.Skills:
                Intent skillScreen = new Intent(this, ChracterDisplayScreen2.class);
                skillScreen.putExtra("characterInfo", (Character)dummy);
              //  skillScreen.putExtra("characterInventory",currentInventoryData);
                startActivity(skillScreen);
                break;
            case R.id.Inventory:

                break;
            case R.id.Combat:
                Intent combat = new Intent(this, CombatActivity.class);
                combat.putExtra("characterInfo", (Character)dummy);
                startActivity(combat);
                break;
        }

    }


}
