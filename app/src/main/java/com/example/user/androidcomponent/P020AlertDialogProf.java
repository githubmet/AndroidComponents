package com.example.user.androidcomponent;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class P020AlertDialogProf extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p020_alertdialog_prof);

    }

    public void onClickConfirmP020Mtd(View view) {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.are_you_ok));
        builder.setPositiveButton(getResources().getString(R.string.ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(P020AlertDialogProf.this,getResources().getString(R.string.ok),Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton(getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(P020AlertDialogProf.this,getResources().getString(R.string.cancel),Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void onClickItemsP020Mtd(View view) {

        AlertDialog.Builder builder=new AlertDialog.Builder(this,
                android.R.layout.select_dialog_multichoice);
        builder.setTitle(getResources().getString(R.string.select_color));

        final CharSequence[] colorNames= getResources().getStringArray(R.array.color_names_p020);

        builder.setItems(colorNames, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
           Toast.makeText(P020AlertDialogProf.this,colorNames[i].toString(),Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void onClickOnlyOneItemP020Mtd(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this,
                android.R.layout.select_dialog_multichoice);
        builder.setTitle(getResources().getString(R.string.select_color));
        final CharSequence[] colorNames= getResources().getStringArray(R.array.color_names_p020);

        builder.setSingleChoiceItems(colorNames,0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(P020AlertDialogProf.this,colorNames[i].toString(),Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
}
