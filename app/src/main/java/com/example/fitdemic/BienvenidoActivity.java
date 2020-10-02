package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BienvenidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
    }

    public void onClickBienvenido(View view){
        Intent intent = new Intent(this, PreguntasActivity.class);
        EditText etNombre = (EditText)findViewById(R.id.etName);
        String nombre = etNombre.getText().toString();

        intent.putExtra("nombreUsuario",nombre);
        startActivity(intent);
    }
}