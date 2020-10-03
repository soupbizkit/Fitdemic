package com.example.fitdemic;

import java.util.ArrayList;

public class Usuario {

    private int id;
    private String nombre;
    private int edad;
    private int peso;
    private String sexo;
    private String padecimientos;

    public Usuario(int id, String nombre, int edad, int peso, String sexo, String padecimientos){
        this.id = id;
        this.nombre = nombre;
        this.edad=edad;
        this.peso=peso;
        this.sexo=sexo;
        this.padecimientos=padecimientos;
    }

    public int getId(){
        return id;
    }
    public String getNombre() {
        return nombre;
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

    public String getPadecimientos() {
        return padecimientos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPesoKg(int peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPadecimientos(String padecimientos) {
        this.padecimientos = padecimientos;
    }

}
