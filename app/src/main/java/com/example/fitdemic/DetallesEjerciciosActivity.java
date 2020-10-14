package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetallesEjerciciosActivity extends AppCompatActivity {

    public static final String INDEX_EJERCICIO = "index";

    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        Intent intent = getIntent();
        index = intent.getIntExtra(INDEX_EJERCICIO, 0);
        String tipoRutina = intent.getStringExtra("tipoRutina");
        TextView view = (TextView)findViewById(R.id.tvDescripcion);

        switch (tipoRutina){
            case "rutinaDiaria":
                view.setText(Ejercicio.ejerciciosPerdidaGrasa[index].getDescripcion());
                break;
            case "estiramiento":
                view.setText(Ejercicio.ejerciciosEstiramiento[index].getDescripcion());
                break;
            case "bajoImpacto":
                view.setText(Ejercicio.ejerciciosBajoImpacto[index].getDescripcion());
                break;
            case "tonificacion":
                view.setText(Ejercicio.ejerciciosTonificacionMuscular[index].getDescripcion());
                break;
        }

    }
}