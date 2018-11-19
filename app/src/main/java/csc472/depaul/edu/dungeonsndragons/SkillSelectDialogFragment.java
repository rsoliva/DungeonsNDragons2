package csc472.depaul.edu.dungeonsndragons;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class SkillSelectDialogFragment extends Dialog {
    public Dialog d;
    public Activity c;
    public CheckBox skillAnimal, skillAth, skillIns,skillIntim,skillNature,skillPercept,skillRel,skillSurv;
    public int checkedBoxes;

    public SkillSelectDialogFragment (Activity a){
        super(a);
        this.c = a;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.skill_select_dialog);
         skillAnimal = findViewById(R.id.animalHandleCheckBox);
         skillAth = findViewById(R.id.AthleticsCheckBox);
         skillIns = findViewById(R.id.InsightCheckBox);
         skillIntim = findViewById(R.id.IntimidationCheckBox);
         skillNature = findViewById(R.id.NatureCheckBox);
         skillPercept = findViewById(R.id.PerceptionCheckBox);
         skillRel = findViewById(R.id.ReligionCheckBox);
         skillSurv = findViewById(R.id.SurvivalCheckBox);



    }

    public void setcheckListeners(){
       // skillAnimal.setOnCheckedChangeListener();

    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){

    }


}
