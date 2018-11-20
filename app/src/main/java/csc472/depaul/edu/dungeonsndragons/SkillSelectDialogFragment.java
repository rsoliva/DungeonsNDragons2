package csc472.depaul.edu.dungeonsndragons;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;

import csc472.depaul.edu.dungeonsndragons.Races.CharacterMethods;


public class SkillSelectDialogFragment extends Dialog implements CheckBox.OnCheckedChangeListener {

    public Activity C;
    private CheckBox AnniH, Ath, Ints,Intim,Natu,Percpt,Reli,Surv;
    private Button confirmBtn;
    private int skillsSeleted = 0;
    public static ArrayList<String> SkillsList = new ArrayList<String>();



    public SkillSelectDialogFragment (Activity a){
        super(a);
        this.C = a;

    }
    public ArrayList<String> getSkillsList(){
        return SkillsList;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);



        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.skill_select_dialog);
        confirmBtn = findViewById(R.id.ConfirmBtn);

        AnniH = findViewById(R.id.animalHandleCheckBox);
        AnniH.setOnCheckedChangeListener(this);

        Ath = findViewById(R.id.AthleticsCheckBox);
        Ath.setOnCheckedChangeListener(this);

        Ints = findViewById(R.id.InsightCheckBox);
        Ints.setOnCheckedChangeListener(this);

        Intim = findViewById(R.id.IntimidationCheckBox);
        Intim.setOnCheckedChangeListener(this);

        Natu = findViewById(R.id.NatureCheckBox);
        Natu.setOnCheckedChangeListener(this);

        Percpt = findViewById(R.id.PerceptionCheckBox);
        Percpt.setOnCheckedChangeListener(this);

        Reli = findViewById(R.id.ReligionCheckBox);
        Reli.setOnCheckedChangeListener(this);

        Surv = findViewById(R.id.SurvivalCheckBox);
        Surv.setOnCheckedChangeListener(this);

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dismiss();
            }
        });


    }




    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked && skillsSeleted > 2){
            buttonView.setChecked(false);
        }
        else if (isChecked && skillsSeleted <= 2){

            SkillsList.add(buttonView.getText().toString());
        }
        if(isChecked){
            skillsSeleted++;
        }
        else{
            skillsSeleted--;
        }
    }
}
