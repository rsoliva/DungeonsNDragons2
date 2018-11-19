package csc472.depaul.edu.dungeonsndragons;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Window;


public class SkillSelectDialogFragment extends Dialog {
    public Dialog d;
    public Activity c;


    public SkillSelectDialogFragment (Activity a){
        super(a);
        this.c = a;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.skill_select_dialog);

    }



}
