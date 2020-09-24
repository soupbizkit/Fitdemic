package com.example.fitdemic;

import java.util.ArrayList;

public class Usuario {

    private int edad;
    private int pesoKg;
    private String sexo;
    private ArrayList<String> padecimientos;

    public Usuario(int edad, int pesoKg, String sexo, ArrayList<String> padecimientos){
        this.edad=edad;
        this.pesoKg=pesoKg;
        this.sexo=sexo;
        this.padecimientos=padecimientos;
    }

    public int getEdad() {
        return edad;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public String getSexo() {
        return sexo;
    }

    public ArrayList<String> getPadecimientos() {
        return padecimientos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPadecimientos(ArrayList<String> padecimientos) {
        this.padecimientos = padecimientos;
    }

}
