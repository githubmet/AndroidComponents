package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P014FileOutputStream extends Activity implements View.OnClickListener {

    public static final String P014FILEOUTPUTSTREAM_KEY="com.example.user.androidcomponent.P014FILEOUTPUTSTREAM_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button=new Button(this);
        button.setText(R.string.text);
        button.setOnClickListener(this);
        setContentView(button);
    }

    @Override
    public void onClick(View view) {

        try {
            FileOutputStream fileOutputStream= openFileOutput(P014FILEOUTPUTSTREAM_KEY,MODE_PRIVATE);
            String helloWorld= getResources().getString(R.string.text);
            byte[] buffer=helloWorld.getBytes();
            fileOutputStream.write(buffer);
            fileOutputStream.close();

            Intent intent=new Intent(this,P015FileInputStream.class);
            startActivity(intent);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
