package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class P023AddTextChangeListener extends Activity implements TextWatcher {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EditText editText=new EditText(this);
        editText.setHint(getResources().getString(R.string.type_your_name));

        editText.addTextChangedListener(this);
        setContentView(editText);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        Toast.makeText(this, getResources().getString(R.string.before_text_changed), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        Toast.makeText(this, getResources().getString(R.string.after_text_changed), Toast.LENGTH_SHORT).show();
    }
}
