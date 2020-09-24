package com.example.fitdemic;

import java.util.ArrayList;

public class Usuario {

    private int id;
    private String edad;
    private String peso;
    private String sexo;
    //private ArrayList<String> padecimientos;

    public Usuario(int id, String edad, String peso, String sexo/*, ArrayList<String> padecimientos*/){
        this.id = id;
        this.edad=edad;
        this.peso=peso;
        this.sexo=sexo;
        //this.padecimientos=padecimientos;
    }

    public String getEdad() {

        return edad;
    }

    public String getPeso() {

        return peso;
    }

    public String getSexo() {

        return sexo;
    }

    /*public ArrayList<String> getPadecimientos() {

        return padecimientos;
    }*/

    public void setEdad(String edad) {

        this.edad = edad;
    }

    public void setPesoKg(String peso) {

        this.peso = peso;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }

    /*public void setPadecimientos(ArrayList<String> padecimientos) {
        this.padecimientos = padecimientos;
    }*/

}
