package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.androidcomponent.parcelable.P024ParcelableCalisanClass;

public class P024SendParcelableData extends Activity implements View.OnClickListener {
    public static final String PARCELABLE_KEY="com.example.user.androidcomponent.PARCELABLE_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button=new Button(this);
        button.setText(getResources().getString(R.string.text));
        button.setOnClickListener(this);
        setContentView(button);
    }

    @Override
    public void onClick(View view) {
        int calisanId=7;
        String calisanName="Gokhan";
        String calisanSurname="Oguz";


        P024ParcelableCalisanClass p024ParcelableCalisanClass=new P024ParcelableCalisanClass(
                calisanId,
                calisanName,
                calisanSurname
        );

        Intent intent=new Intent(this,P024LoadParcelableData.class);
        intent.putExtra(PARCELABLE_KEY,p024ParcelableCalisanClass);
        startActivity(intent);


    }
}
