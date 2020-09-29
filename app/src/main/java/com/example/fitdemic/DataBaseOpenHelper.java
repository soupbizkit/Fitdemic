package com.example.fitdemic;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseOpenHelper extends SQLiteOpenHelper {
    public DataBaseOpenHelper(@Nullable Context context) {
        super(context, UtilitiesDataBase.DATABASE_NAME, null, UtilitiesDataBase.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //CREACIÓN DE LA TABLA AL INICIAR LA APLICACIÓN
        sqLiteDatabase.execSQL(UtilitiesDataBase.TablaUsuarios.CREATE_TABLE_USUARIOS);
        //INSTER
        //insert(sqLiteDatabase, "42", "98", "M" );
    }

    private void insert(SQLiteDatabase db, String edad, String peso, String sexo){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaUsuarios.EDAD, edad);
        registro.put(UtilitiesDataBase.TablaUsuarios.PESO, peso);
        registro.put(UtilitiesDataBase.TablaUsuarios.SEXO, sexo);

        db.insert(UtilitiesDataBase.TablaUsuarios.TABLE_NAME, null,registro);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ UtilitiesDataBase.TablaUsuarios.TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
