package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class FinalizarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar);

        Intent intent = getIntent();

        int pesoUsuario = intent.getIntExtra("peso", 0);
        String peso = Integer.toString(pesoUsuario);

        int edadUsuario = intent.getIntExtra("edad", 0);
        String edad = Integer.toString(edadUsuario);

        String sexoUsuario = intent.getStringExtra("sexo");

        ArrayList<String> padecimientos = intent.getStringArrayListExtra("padecimientos");


        TextView tvPeso = (TextView)findViewById(R.id.tvPesoDatos);
        tvPeso.setText(peso);

        TextView tvEdad = (TextView)findViewById(R.id.tvEdadDatos);
        tvEdad.setText(edad);

        TextView tvSexo = (TextView)findViewById(R.id.tvSexoDatos);
        tvSexo.setText(sexoUsuario);

        ListView lvPadecimientos = (ListView)findViewById(R.id.lvPadecimientos);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, padecimientos);
        lvPadecimientos.setAdapter(arrayAdapter);
    }
}