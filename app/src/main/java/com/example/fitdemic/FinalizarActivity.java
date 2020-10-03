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
        int pesoUsuario = intent.getIntExtra("peso", 0);
        String peso = Integer.toString(pesoUsuario);
        int edadUsuario = intent.getIntExtra("edad", 0);
        String edad = Integer.toString(edadUsuario);
        String sexoUsuario = intent.getStringExtra("sexo");
        String nombreUsuario = intent.getStringExtra("nombre");
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

    public void onClickCreateUser(View view) throws JSONException {
        Intent intent = getIntent();
        String nombreUsuario = intent.getStringExtra("nombre");
        int pesoUsuario = intent.getIntExtra("peso", 0);
        int edadUsuario = intent.getIntExtra("edad", 0);
        String sexoUsuario = intent.getStringExtra("sexo");
        ArrayList<String> listaPadecimientos = intent.getStringArrayListExtra("padecimientos");
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
        Toast.makeText(getApplicationContext(), "Result " + usuario.getNombre(), Toast.LENGTH_LONG).show();

    }

    public  void  next(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    /*UsuarioDAO usuarioDao = new UsuarioDAO(getApplicationContext());
        long resultado = usuarioDao.insertarUsuario(usuario);

        //Toast toast = Toast.makeText(getApplicationContext(), "Result " + usuarioDao.insertarUsuario(usuario), Toast.LENGTH_LONG);*/
}