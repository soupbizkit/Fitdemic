package com.example.fitdemic;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataBaseOpenHelper extends SQLiteOpenHelper {
    public DataBaseOpenHelper(@Nullable Context context) {
        super(context, UtilitiesDataBase.DATABASE_NAME, null, UtilitiesDataBase.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //CREACIÓN DE LA TABLA AL INICIAR LA APLICACIÓN
        sqLiteDatabase.execSQL(UtilitiesDataBase.TablaUsuarios.CREATE_TABLE_USUARIOS);

    }

    public boolean insert(SQLiteDatabase db, int edad, int peso, String sexo, String padecimientos){
        db = this.getWritableDatabase();
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaUsuarios.EDAD, edad);
        registro.put(UtilitiesDataBase.TablaUsuarios.PESO, peso);
        registro.put(UtilitiesDataBase.TablaUsuarios.SEXO, sexo);
        registro.put(UtilitiesDataBase.TablaUsuarios.PADECIMIENTOS, padecimientos);

        long id = db.insert(UtilitiesDataBase.TablaUsuarios.TABLE_NAME, null, registro);

        if(id == -1){
            return false;
        }else{
            return true;
        }
    }

    /*public Cursor getUsuario(SQLiteDatabase db, int id){
        db = this.getWritableDatabase();
        Cursor data = db.rawQuery(UtilitiesDataBase.TablaUsuarios.CONSULTAR_ALL_TABLE, null);
        return data;
    }*/

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ UtilitiesDataBase.TablaUsuarios.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
