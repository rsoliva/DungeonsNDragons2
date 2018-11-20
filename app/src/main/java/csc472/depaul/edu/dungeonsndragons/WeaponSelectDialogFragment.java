package csc472.depaul.edu.dungeonsndragons;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import csc472.depaul.edu.dungeonsndragons.Jobs.MartialMelee;

public class WeaponSelectDialogFragment extends DialogFragment {
    public Dialog d;
    public Activity c;
    public Spinner selectWeapon;

    Spinner MM, MR, SM,SR;

    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View myView = inflater.inflate(R.layout.weapon_select_dialog, null);
        builder.setView(myView);

        MM = myView.findViewById(R.id.MartialMelee);
        MR = myView.findViewById(R.id.MartialRanged);
        SM = myView.findViewById(R.id.SimpleMelee);
        SR = myView.findViewById(R.id.SimpleRanged);

//        Spinner checkInProviders = (Spinner)myView.findViewById(R.id.MartialMelee);
        ArrayAdapter<MartialMelee> dataAdapter = new ArrayAdapter<>(this.getActivity(),
                android.R.layout.simple_spinner_item, MartialMelee.values());

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        MM.setAdapter(dataAdapter);

        ArrayAdapter<MartialMelee> dataAdapter2 = new ArrayAdapter<>(this.getActivity(),
                android.R.layout.simple_spinner_item, MartialMelee.values());

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        MR.setAdapter(dataAdapter);

        ArrayAdapter<MartialMelee> dataAdapter3 = new ArrayAdapter<>(this.getActivity(),
                android.R.layout.simple_spinner_item, MartialMelee.values());

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SM.setAdapter(dataAdapter);

        ArrayAdapter<MartialMelee> dataAdapter4 = new ArrayAdapter<>(this.getActivity(),
                android.R.layout.simple_spinner_item, MartialMelee.values());

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SR.setAdapter(dataAdapter);

        return builder.create();
    }

//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.weapon_select_dialog);
//
//    }
}
