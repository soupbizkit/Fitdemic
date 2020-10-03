package com.example.fitdemic;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class UsuarioDAO {

    private DataBaseOpenHelper dataBaseOpenHelper;
    private SQLiteDatabase db;

    public UsuarioDAO(Context context){
        dataBaseOpenHelper = new DataBaseOpenHelper(context);
    }

    public String insertarUsuario(Usuario usuario) {

        boolean resultado = dataBaseOpenHelper.insert(db, usuario.getNombre(), usuario.getEdad(), usuario.getPeso(), usuario.getSexo(), usuario.getPadecimientos());

        String respuesta = "";

        if(resultado){
            respuesta = "Agregado a la base";
            db.close();
            return respuesta;
        }else{
            respuesta = "No agregado a la base";
            db.close();
            return respuesta;
        }


    }


   /*public Usuario consultarUsuarios(){
        ArrayList<String> padecimientos = new ArrayList<String>();
        Cursor cursor = dataBaseOpenHelper.getUsuario(db, 1);
        JSONObject json = new JSONObject();
        padecimientos = json.optJSONArray("listaPadecimientos");

        Usuario usuario = new Usuario(cursor.getInt(0), cursor.getInt(1), cursor.getInt(2), cursor.getString(3));

        db.close();
        return usuario;
    }
    /*
    public Usuario consultarUnUsuario(String id){
        Usuario usuario = null;
        String[] campos = new String[]{UtilitiesDataBase.TablaUsuarios.ID,UtilitiesDataBase.TablaUsuarios.EDAD, UtilitiesDataBase.TablaUsuarios.PESO, UtilitiesDataBase.TablaUsuarios.SEXO};
        String[] parametros = new String[]{UtilitiesDataBase.TablaUsuarios.ID};
        String[] argumentos = new String[]{id};

        //nombre_tabla, campos que quiero sacar de la tabla, parámetros de comparación,
        Cursor cursor = db.query(UtilitiesDataBase.TablaUsuarios.TABLE_NAME, campos, parametros[0] + "=?", argumentos,null,null,null);
        if(cursor.moveToFirst()){
             usuario = new Usuario(cursor.getInt(0), cursor.getInt(1), cursor.getInt(2), cursor.getString(3),null);
        }
        db.close();
        return usuario;
    }

    public void eliminar(int id){
        db.delete(UtilitiesDataBase.TablaUsuarios.TABLE_NAME, UtilitiesDataBase.TablaUsuarios.ID + "=?", new String[]{String.valueOf(id)});
        db.close();
    }*/
}
