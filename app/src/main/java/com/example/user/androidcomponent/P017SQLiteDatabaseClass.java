package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.androidcomponent.database.P017SQLiteDatabase;

public class P017SQLiteDatabaseClass extends Activity implements View.OnClickListener{
    EditText editTextNameP017;
    EditText editTextSurnameP017;
    EditText editTextIdP017;
    EditText editTextNameByIdP017;
    EditText editTextSurnameByIdP017;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p017sqlitedatabase_class);


        findViewById(R.id.buttonInsertP017).setOnClickListener(this);
        findViewById(R.id.buttonGetAllInfoP017).setOnClickListener(this);
        findViewById(R.id.buttonGetInfoByIdP017).setOnClickListener(this);
        findViewById(R.id.buttonDeleteByIdP017).setOnClickListener(this);
        findViewById(R.id.buttonUpdateP017).setOnClickListener(this);


        editTextNameP017= findViewById(R.id.editTextNameP017);
        editTextSurnameP017= findViewById(R.id.editTextSurnameP017);
        editTextIdP017= findViewById(R.id.editTextIdP017);

        editTextNameByIdP017= findViewById(R.id.editTextNameByIdP017);
        editTextSurnameByIdP017= findViewById(R.id.editTextSurnameByIdP017);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonInsertP017:
                P017SQLiteDatabase p017SQLiteDatabase=new P017SQLiteDatabase(this);
                p017SQLiteDatabase.openMtd();
                p017SQLiteDatabase.insertMtd(editTextNameP017.getText().toString(), editTextSurnameP017.getText().toString());
                p017SQLiteDatabase.closeMtd();
                break;

            case R.id.buttonGetAllInfoP017:
                P017SQLiteDatabase p017SQLiteDatabase2=new P017SQLiteDatabase(this);
                p017SQLiteDatabase2.openMtd();
                String katar= p017SQLiteDatabase2.getAllInfo();
                p017SQLiteDatabase2.closeMtd();
                Toast.makeText(this,katar,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonGetInfoByIdP017:
                P017SQLiteDatabase p017SQLiteDatabase3=new P017SQLiteDatabase(this);
                p017SQLiteDatabase3.openMtd();
                String Id= editTextIdP017.getText().toString();
                String katar2= p017SQLiteDatabase3.getInfoById(Id);
                p017SQLiteDatabase3.closeMtd();
                Toast.makeText(this,katar2,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonDeleteByIdP017:
                P017SQLiteDatabase p017SQLiteDatabase4=new P017SQLiteDatabase(this);
                p017SQLiteDatabase4.openMtd();
                String Id4= editTextIdP017.getText().toString();
                p017SQLiteDatabase4.deleteInfoById(Id4);
                p017SQLiteDatabase4.closeMtd();
                Toast.makeText(this,getResources().getString(R.string.ok),Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonUpdateP017:
                P017SQLiteDatabase p017SQLiteDatabase5=new P017SQLiteDatabase(this);
                p017SQLiteDatabase5.openMtd();
                String name=editTextNameByIdP017.getText().toString();
                String surname=editTextSurnameByIdP017.getText().toString();
                String id=editTextIdP017.getText().toString();
                p017SQLiteDatabase5.updateNameAndSurnameById(name,surname,id);
                p017SQLiteDatabase5.closeMtd();
                Toast.makeText(this,getResources().getString(R.string.ok),Toast.LENGTH_LONG).show();
                break;

        }
    }
}
