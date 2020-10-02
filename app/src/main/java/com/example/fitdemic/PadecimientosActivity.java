package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PadecimientosActivity extends AppCompatActivity {
    private CheckBox cbArtritis, cbDiabetes, cbOsteoporosis, cbSobrepeso, cbLesiones;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padecimientos);

    }

    public void onClickPadecimientos(View view){
        Intent intent = getIntent();
        Bundle datosUsuario = getIntent().getExtras();
        ArrayList<String> padecimientos = new ArrayList<String>();

        cbArtritis = (CheckBox)findViewById(R.id.cbArtritis);
        cbDiabetes = (CheckBox)findViewById(R.id.cbDiabetes);
        cbSobrepeso = (CheckBox)findViewById(R.id.cbSobrepeso);
        cbOsteoporosis = (CheckBox)findViewById(R.id.cbOsteoporosis);
        cbLesiones = (CheckBox)findViewById(R.id.cbLesiones);

        int edadUsuario = datosUsuario.getInt("edadUsuario");
        int pesoUsuario = datosUsuario.getInt("pesoUsuario");
        String sexoUsuario = datosUsuario.getString("sexoUsuario");

        String checkboxVar = "";

        //revisa que padecimientos fueron seleccionados
        if(cbArtritis.isChecked()==true){
            checkboxVar = "Artritis";
            padecimientos.add(checkboxVar);
        }
        if(cbDiabetes.isChecked()==true){
            checkboxVar = "Diabetes";
            padecimientos.add(checkboxVar);
        }
        if(cbSobrepeso.isChecked()==true){
            checkboxVar = "Sobre Peso";
            padecimientos.add(checkboxVar);
        }
        if(cbOsteoporosis.isChecked()==true){
            checkboxVar = "Osteoporosis";
            padecimientos.add(checkboxVar);
        }
        if(cbLesiones.isChecked()==true){
            checkboxVar = "Lesiones";
            padecimientos.add(checkboxVar);
        }


        Intent intentFinalizar = new Intent(this, FinalizarActivity.class);
        intentFinalizar.putExtra("peso", pesoUsuario);
        intentFinalizar.putExtra("edad", edadUsuario);
        intentFinalizar.putExtra("sexo", sexoUsuario);
        intentFinalizar.putStringArrayListExtra("padecimientos", padecimientos);
        startActivity(intentFinalizar);
    }

}


