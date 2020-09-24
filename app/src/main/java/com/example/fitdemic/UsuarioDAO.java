package com.example.fitdemic;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

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

    public ArrayList<Usuario> consultarUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Cursor cursor = db.rawQuery(UtilitiesDataBase.TablaUsuarios.CONSULTAR_ALL_TABLE, null);
        while(cursor.moveToNext()){
            usuarios.add(new Usuario(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
        }
        db.close();
        return usuarios;
    }

    public Usuario consultarUnUsuario(String id){
        Usuario usuario = null;
        String[] campos = new String[]{UtilitiesDataBase.TablaUsuarios.ID,UtilitiesDataBase.TablaUsuarios.EDAD, UtilitiesDataBase.TablaUsuarios.PESO, UtilitiesDataBase.TablaUsuarios.SEXO};
        String[] parametros = new String[]{UtilitiesDataBase.TablaUsuarios.ID};
        String[] argumentos = new String[]{id};

        //nombre_tabla, campos que quiero sacar de la tabla, parámetros de comparación,
        Cursor cursor = db.query(UtilitiesDataBase.TablaUsuarios.TABLE_NAME, campos, parametros[0] + "=?", argumentos,null,null,null);
        if(cursor.moveToFirst()){
             usuario = new Usuario(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
        }
        db.close();
        return usuario;
    }

    public void eliminar(int id){
        db.delete(UtilitiesDataBase.TablaUsuarios.TABLE_NAME, UtilitiesDataBase.TablaUsuarios.ID + "=?", new String[]{String.valueOf(id)});
        db.close();
    }
}
