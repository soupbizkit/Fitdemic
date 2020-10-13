package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class FinalizarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar);
        Intent intent = getIntent();

        String nombreUsuario = intent.getStringExtra("nombre");
        int pesoUsuario = intent.getIntExtra("peso", 0);
        String peso = Integer.toString(pesoUsuario);
        int edadUsuario = intent.getIntExtra("edad", 0);
        String edad = Integer.toString(edadUsuario);
        String sexoUsuario = intent.getStringExtra("sexo");

        ArrayList<String> padecimientos = intent.getStringArrayListExtra("padecimientos");


        TextView tvNombre = (TextView)findViewById(R.id.textView3);
        tvNombre.setText(nombreUsuario);

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

    public void onClickCreateUser(View view){
        Intent intentDatos = getIntent();
        String nombreUsuario = intentDatos.getStringExtra("nombre");
        int pesoUsuario = intentDatos.getIntExtra("peso", 0);
        int edadUsuario = intentDatos.getIntExtra("edad", 0);
        String sexoUsuario = intentDatos.getStringExtra("sexo");
        ArrayList<String> listaPadecimientos = intentDatos.getStringArrayListExtra("padecimientos");
        String padecimientos = "";

        for(int i=0; i<listaPadecimientos.size(); i++){
            if(padecimientos == ""){
                padecimientos = listaPadecimientos.get(i);
            }else {
                padecimientos = padecimientos + ", " + listaPadecimientos.get(i);
            }
        }
        Usuario usuario = new Usuario(1, nombreUsuario, edadUsuario, pesoUsuario, sexoUsuario, padecimientos);
        UsuarioDAO usuarioDao = new UsuarioDAO(getApplicationContext());

        if(usuarioDao.insertarUsuario(usuario)){
            Toast.makeText(getApplicationContext(), "Usuario agregado", Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(getApplicationContext(), "Usuario no agregado", Toast.LENGTH_LONG).show();
        }

        Intent intentMain = new Intent(this, MainActivity.class);
        intentMain.putExtra("nombreUsuario", nombreUsuario);
        startActivity(intentMain);

    }

}