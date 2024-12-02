package com.example.quiztech;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration extends SQLiteOpenHelper {
    public static final String DATABASAE_NAME ="Registration";
    public static final String TABLE_NAME ="User_Information";
    public static final String Name ="UserName" ;
    public static final String Pass="Password";
    public static final String ConPass ="ConfirmPassword";
    ;

    public Registration( Context context) {
        super(context, DATABASAE_NAME , null, 1);



    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,Password VARCHAR,Username TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData (String Password, String UserName , String ConfirmPassword) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues =new ContentValues();
        contentValues.put(Pass,Password);
        contentValues.put(Name,UserName);
        contentValues.put(ConPass,ConfirmPassword);
        long result =db.insert(TABLE_NAME,null,contentValues);
        if(result == -1)
            return false;
        else
            return true;

    }
}