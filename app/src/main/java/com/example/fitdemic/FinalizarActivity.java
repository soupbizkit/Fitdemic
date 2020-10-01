package com.example.fitdemic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalizarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar);


        Intent intent = getIntent();
        int identificador = intent.getIntExtra("peso", 0);
        String id = Integer.toString(identificador);
        
        //TextView textview = (TextView)findViewById(R.id.tVFinalizar);
        //textview.setText(id);

    }
}