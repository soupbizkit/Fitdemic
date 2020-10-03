package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PreguntasActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        Intent intent = getIntent();
        String nombre =intent.getStringExtra("nombreUsuario");

        TextView tvNombrePreguntas = (TextView) findViewById(R.id.etNombrePreguntas);
        tvNombrePreguntas.setText(nombre);

    }

    public void onClickPreguntas(View view){
        Intent intent = new Intent(this, PadecimientosActivity.class);

        TextView etNombrePreguntas = (TextView) findViewById(R.id.etNombrePreguntas);
        String nombreUsuario = etNombrePreguntas.getText().toString();

        EditText etPeso = (EditText)findViewById(R.id.etPeso);
        int pesoUsuario = Integer.parseInt(etPeso.getText().toString());

        EditText etEdad = (EditText)findViewById(R.id.etEdad);
        int edadUsuario = Integer.parseInt(etEdad.getText().toString());

        RadioButton rbHombre = (RadioButton)findViewById(R.id.rBHombre);
        RadioButton rbMujer = (RadioButton)findViewById(R.id.rBMujer);

        String sexo = "";

        //revisa cuál de los checkbox fue seleccionado
        if(rbHombre.isChecked()){
            sexo = "Hombre";
        }else if(rbMujer.isChecked()){
            sexo = "Mujer";
        }

        intent.putExtra("nombreUsuario",nombreUsuario);
        intent.putExtra("edadUsuario", edadUsuario);
        intent.putExtra("pesoUsuario", pesoUsuario);
        intent.putExtra("sexoUsuario", sexo);

        //aqui enviamos el intent
        startActivity(intent);

    }
}