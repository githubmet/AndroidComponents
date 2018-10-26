package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.user.androidcomponent.parcelable.P024ParcelableCalisanClass;

public class P024LoadParcelableData extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView=new TextView(this);

        Intent intent= getIntent();
        P024ParcelableCalisanClass p024ParcelableCalisanClass=
                (P024ParcelableCalisanClass)intent.getParcelableExtra(P024SendParcelableData.PARCELABLE_KEY);

        int calisanId=p024ParcelableCalisanClass.calisanId;
        String calisanName=p024ParcelableCalisanClass.calisanName;
        String calisanSurname=p024ParcelableCalisanClass.calisanSurname;

        textView.setText("Calisan id= "+calisanId+" Calisan name= "+
        calisanName+" Calisan surname= "+
        calisanSurname);
        setContentView(textView);
    }
}
