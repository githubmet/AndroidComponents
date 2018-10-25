package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P015FileInputStream extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView=new TextView(this);

        String data=null;
        try {
            FileInputStream fileInputStream= openFileInput
                    (P014FileOutputStream.P014FILEOUTPUTSTREAM_KEY);
            byte[] buffer= new byte[fileInputStream.available()];

            while(fileInputStream.read(buffer) != -1){
                data= new String(buffer);
            }

            fileInputStream.close();
            textView.setText(data);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        setContentView(textView);
    }
}
