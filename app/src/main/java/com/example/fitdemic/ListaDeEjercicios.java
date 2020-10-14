package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListaDeEjercicios extends AppCompatActivity implements RutinaDiariaFragment.Escucha, TonificacionMuscularFragment.Escucha,
        EstiramientosFragment.Escucha, BajoImpactoFragment.Escucha{

    FragmentTransaction transaction;
    Fragment fragmentRutina, fragmentTonificacion, fragmentEstiramiento, fragmentBajoImpac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_ejercicios);

        fragmentRutina = new RutinaDiariaFragment();
        fragmentTonificacion = new TonificacionMuscularFragment();
        fragmentEstiramiento = new EstiramientosFragment();
        fragmentBajoImpac = new BajoImpactoFragment();

        Intent intent = getIntent();
        String tipoRutina =  intent.getStringExtra("tipoRutina");

        switch (tipoRutina){
            case "rutinaDiaria":
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContenedor,fragmentRutina).commit();
                break;
            case "estiramiento":
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContenedor,fragmentEstiramiento).commit();
                break;
            case "bajoImpacto":
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContenedor,fragmentBajoImpac).commit();
                break;
            case "tonificacion":
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContenedor,fragmentTonificacion).commit();
                break;
        }

        Toolbar toolbar = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);


    }


    @Override
    public void onItemSeleccionadoRutina(long id) {
        Intent intent = new Intent(this, DetallesEjerciciosActivity.class);
        intent.putExtra(DetallesEjerciciosActivity.INDEX_EJERCICIO,(int)id);
        intent.putExtra("tipoRutina", "rutinaDiaria");
        startActivity(intent);
    }

    public void onItemSeleccionadoTonificar(long id) {
        Intent intent = new Intent(this, DetallesEjerciciosActivity.class);
        intent.putExtra(DetallesEjerciciosActivity.INDEX_EJERCICIO,(int)id);
        intent.putExtra("tipoRutina", "tonificacion");
        startActivity(intent);
    }

    public void onItemSeleccionadoEstiramiento(long id) {
        Intent intent = new Intent(this, DetallesEjerciciosActivity.class);
        intent.putExtra(DetallesEjerciciosActivity.INDEX_EJERCICIO,(int)id);
        intent.putExtra("tipoRutina", "estiramiento");
        startActivity(intent);
    }

    public void onItemSeleccionadoBajoImpacto(long id) {
        Intent intent = new Intent(this, DetallesEjerciciosActivity.class);
        intent.putExtra(DetallesEjerciciosActivity.INDEX_EJERCICIO,(int)id);
        intent.putExtra("tipoRutina", "bajoImpacto");
        startActivity(intent);
    }
}