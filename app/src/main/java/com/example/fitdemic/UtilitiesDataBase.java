package com.example.fitdemic;

public final class UtilitiesDataBase {
    static final String DATABASE_NAME = "usuarios";
    static final int VERSION = 1;

    public class TablaUsuarios{
        static final String TABLE_NAME = "usuarios";
        static final String ID = "id";
        static final Integer EDAD = "edad";
        static final Integer PESO = "peso";
        static final String SEXO = "sexo";

        //CREACIÓN DE LA TABLA
        static final String CREATE_TABLE_USUARIOS="CREATE TABLE "+ TABLE_NAME+"("+ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+EDAD+" INTEGER NOT NULL, "+ PESO+" INTEGER NOT NULL, "+SEXO+" TEXT);";
        //CONSULTA EN LA TABLA
        static final String CONSULTAR_ALL_TABLE = "SELECT * FROM"+TABLE_NAME;
    }
}
