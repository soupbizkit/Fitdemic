package com.example.fitdemic;

import java.util.ArrayList;

public final class UtilitiesDataBase {
    static final String DATABASE_NAME = "usuarios";
    static final int VERSION = 1;

    public class TablaUsuarios{
        static final String TABLE_NAME = "usuarios";
        static final String ID = "id";
        static final String EDAD = "edad";
        static final String PESO = "peso";
        static final String SEXO = "sexo";
        static final String PADECIMIENTOS = "padecimientos";

        //CREACIÓN DE LA TABLA
        static final String CREATE_TABLE_USUARIOS="CREATE TABLE "+ TABLE_NAME+"("+ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+EDAD+" INTEGER NOT NULL, "+ PESO+" INTEGER NOT NULL, "+SEXO+" TEXT, "+ PADECIMIENTOS + " TEXT);";
        //CONSULTA EN LA TABLA
        static final String CONSULTAR_ALL_TABLE = "SELECT * FROM "+TABLE_NAME;
    }
}
