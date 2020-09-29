package com.example.fitdemic;

import java.util.ArrayList;

public class Usuario {

    private int id;
    private int edad;
    private int peso;
    private String sexo;
    //private ArrayList<String> padecimientos;

    public Usuario(int id, int edad, int peso, String sexo/*, ArrayList<String> padecimientos*/){
        this.id = id;
        this.edad=edad;
        this.peso=peso;
        this.sexo=sexo;
        //this.padecimientos=padecimientos;
    }

    public int getEdad() {

        return edad;
    }

    public int getPeso() {

        return peso;
    }

    public String getSexo() {

        return sexo;
    }

    /*public ArrayList<String> getPadecimientos() {

        return padecimientos;
    }*/

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public void setPesoKg(int peso) {

        this.peso = peso;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }

    /*public void setPadecimientos(ArrayList<String> padecimientos) {
        this.padecimientos = padecimientos;
    }*/

}
