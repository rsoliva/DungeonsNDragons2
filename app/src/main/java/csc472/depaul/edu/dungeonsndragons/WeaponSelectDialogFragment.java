package csc472.depaul.edu.dungeonsndragons;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.Spinner;
public class WeaponSelectDialogFragment extends Dialog{
    public Dialog d;
    public Activity c;
    public Spinner selectWeapon;

    public WeaponSelectDialogFragment (Activity a){
        super(a);
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.weapon_select_dialog);

    }
}
