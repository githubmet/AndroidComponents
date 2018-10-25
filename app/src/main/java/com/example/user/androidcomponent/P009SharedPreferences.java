package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class P009SharedPreferences extends Activity implements View.OnClickListener{
    EditText editTextSurnameP009;
    EditText editTextNameP009;
    TextView textViewP009;
    public final String SHAREDPREFERENCE_KEY="com.example.user.androidcomponent.SHAREDPREFERENCE_KEY";
    public final String SHAREDPREFERENCE_NAME_KEY="com.example.user.androidcomponent.SHAREDPREFERENCE_NAME_KEY";
    public final String SHAREDPREFERENCE_SURNAME_KEY="com.example.user.androidcomponent.SHAREDPREFERENCE_SURNAME_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p009_shared_preferences);

        findViewById(R.id.buttonSaveP009).setOnClickListener(this);
        findViewById(R.id.buttonLoadP009).setOnClickListener(this);
        editTextNameP009= findViewById(R.id.editTextNameP009);
        editTextSurnameP009= findViewById(R.id.editTextSurnameP009);

        textViewP009=findViewById(R.id.textViewP009);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonSaveP009:
               String name= String.valueOf(editTextNameP009.getText());
               String surname=String.valueOf(editTextSurnameP009.getText());

                SharedPreferences sharedPreferences=getSharedPreferences(SHAREDPREFERENCE_KEY,
                        MODE_PRIVATE);
                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putString(SHAREDPREFERENCE_NAME_KEY,name);
                editor.putString(SHAREDPREFERENCE_SURNAME_KEY,surname);
                editor.commit();

                break;
            case R.id.buttonLoadP009:
                SharedPreferences sharedPreferences2= getSharedPreferences(SHAREDPREFERENCE_KEY,MODE_PRIVATE);
                String name2= sharedPreferences2.getString(SHAREDPREFERENCE_NAME_KEY,"default");
                String surname2= sharedPreferences2.getString(SHAREDPREFERENCE_SURNAME_KEY,"default");

                textViewP009.setText(name2+" "+surname2);
                break;
        }
    }
}
