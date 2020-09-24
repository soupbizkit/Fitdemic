package com.example.fitdemic;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioDAO {

    private DataBaseOpenHelper dataBaseOpenHelper;
    private SQLiteDatabase db;

    public UsuarioDAO(Context context){
        dataBaseOpenHelper = new DataBaseOpenHelper(context);
    }

    public long insertarUsuario(Usuario usuario){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaUsuarios.EDAD, usuario.getEdad());
        registro.put(UtilitiesDataBase.TablaUsuarios.PESO, usuario.getPeso());
        registro.put(UtilitiesDataBase.TablaUsuarios.SEXO, usuario.getSexo());
        long id = db.insert(UtilitiesDataBase.TablaUsuarios.TABLE_NAME, UtilitiesDataBase.TablaUsuarios.ID, registro);
        db.close();
        return id;
    }
}
