package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class P018LinearLayout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayoutAna=new LinearLayout(this);
        linearLayoutAna.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParamsAna=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        LinearLayout linearLayoutName=new LinearLayout(this);
        linearLayoutName.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams layoutParamsName=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        linearLayoutName.setLayoutParams(layoutParamsName);
        TextView textViewName=new TextView(this);
        textViewName.setText(getResources().getString(R.string.name));
        EditText editTextName=new EditText(this);

        linearLayoutName.addView(textViewName);
        linearLayoutName.addView(editTextName);


        LinearLayout linearLayoutSurname=new LinearLayout(this);
        linearLayoutSurname.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams layoutParamsSurname=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        linearLayoutSurname.setLayoutParams(layoutParamsSurname);
        TextView textViewSurname=new TextView(this);
        textViewSurname.setText(getResources().getString(R.string.user_surname));
        EditText editTextSurname=new EditText(this);

        linearLayoutSurname.addView(textViewSurname);
        linearLayoutSurname.addView(editTextSurname);


        Button button=new Button(this);
        button.setText(getResources().getString(R.string.text));

        linearLayoutAna.addView(linearLayoutName);
        linearLayoutAna.addView(linearLayoutSurname);
        linearLayoutAna.addView(button);

        setContentView(linearLayoutAna);
    }
}
