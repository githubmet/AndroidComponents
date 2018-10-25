package com.example.user.androidcomponent.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class P017SQLiteDatabase  {
    private static final String DATABASE_NAME_P017="com.example.user.androidcomponent.database.DATABASE_NAME_P017";
    private static final int DATABASE_VERSION_NUMBER=1;

    public static final String TABLE_NAME="Calisan_Tbl";
    public static final String CALISAN_ID="Calisan_Id";
    public static final String CALISAN_NAME="Calisan_Name";
    public static final String CALISAN_SURNAME="Calisan_Surname";

    public class SQLiteOpenHelperClass extends SQLiteOpenHelper{

        public SQLiteOpenHelperClass(Context context){ // String name,SQLiteDatabase.CursorFactory factory, int version) {
            super(context, DATABASE_NAME_P017, null, DATABASE_VERSION_NUMBER);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(
                    "create table "+TABLE_NAME+"( " +
                            CALISAN_ID+" integer primary key autoincrement," +
                            CALISAN_NAME+ " text not null," +
                            CALISAN_SURNAME+ " text not null );"
            );
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("drop table if exists "+ TABLE_NAME);
        }
    }

    Context context;
    SQLiteDatabase sqLiteDatabase;
    public P017SQLiteDatabase(Context context) {
        this.context = context;
    }


    public void openMtd(){
        SQLiteOpenHelperClass sqLiteOpenHelperClass=new SQLiteOpenHelperClass(context);
        sqLiteDatabase= sqLiteOpenHelperClass.getWritableDatabase();

    }
    public void closeMtd(){
        sqLiteDatabase.close();
    }

    public void insertMtd(String name, String surname){

        ContentValues contentValues=new ContentValues();
        contentValues.put(CALISAN_NAME,name);
        contentValues.put(CALISAN_SURNAME,surname);
        sqLiteDatabase.insert(TABLE_NAME,null,contentValues);

    }

    public String getAllInfo(){

        String[] columsDizi={CALISAN_ID,CALISAN_NAME,CALISAN_SURNAME};
        Cursor cursor= sqLiteDatabase.query(TABLE_NAME,columsDizi,null,null,null,null,null);
        StringBuilder stringBuilder=new StringBuilder();

        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){
             stringBuilder.append(cursor.getInt(0)+ " "+cursor.getString(1)+" "+cursor.getString(2)+"\n");
        }
        String katar=stringBuilder.toString();
        return katar;
    }
    public String  getInfoById(String Id){
        String[] columns={CALISAN_ID,CALISAN_NAME,CALISAN_SURNAME};
        Cursor cursor= sqLiteDatabase.query(TABLE_NAME,columns,CALISAN_ID +" = "+Id,null,null,null,null);
        String katar="";
        if(cursor !=null){
            cursor.moveToFirst();
            katar=cursor.getInt(0)+" "+ cursor.getString(1)+" "+cursor.getString(2);
        }
        return katar;
    }
    public void deleteInfoById(String Id){
        sqLiteDatabase.delete(TABLE_NAME,CALISAN_ID+" = "+Id,null);
    }
    public void updateNameAndSurnameById(String name,String surname,String id){

        ContentValues contentValues=new ContentValues();
        contentValues.put(CALISAN_NAME,name);
        contentValues.put(CALISAN_SURNAME,surname);


        sqLiteDatabase.update(TABLE_NAME,contentValues,CALISAN_ID+" = "+id,null);
    }

}
