package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PadecimientosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padecimientos);

    }

    public void newActivity(View view){
        Bundle datosUsuario = getIntent().getExtras();
        //recoger datos de la lista de los padecimientos
    }

    public void onCreateUser(View view){
        Intent intent = new Intent(this, FinalizarActivity.class);
        Bundle datosUsuario = getIntent().getExtras();
        int edadUsuario = datosUsuario.getInt("edadUsuario");
        int pesoUsuario = datosUsuario.getInt("pesoUsuario");
        String sexoUsuario = datosUsuario.getString("sexoUsuario");

        Usuario usuario = new Usuario(1, edadUsuario, pesoUsuario, sexoUsuario);

        UsuarioDAO usuarioDao = new UsuarioDAO(getApplicationContext());
        long resultado = usuarioDao.insertarUsuario(usuario);

        //Toast toast = Toast.makeText(getApplicationContext(), "Result " + String.valueOf(usuarioDao.insertarUsuario(usuario)), Toast.LENGTH_LONG);

        intent.putExtra("peso", pesoUsuario);
        startActivity(intent);
    }

}