package com.example.fitdemic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_abierto, R.string.nav_cerrada);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView)findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        Intent intent = null;
        switch (id){
            case R.id.mProgreso:
                intent = new Intent(this, BienvenidoActivity.class);
                break;
        }
        if(intent != null){
            startActivity(intent);
        }

        DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    public void onClickRutinaDiaria(View view){
        String tipoRutina = "rutinaDiaria";
        Intent intent = new Intent(this,ListaDeEjercicios.class);
        intent.putExtra("tipoRutina", tipoRutina);
        startActivity(intent);
    }
    public void onClickEstiramiento(View view){
        String tipoRutina = "estiramiento";
        Intent intent = new Intent(this,ListaDeEjercicios.class);
        intent.putExtra("tipoRutina", tipoRutina);
        startActivity(intent);
    }
    public void onClickBajoImpacto(View view){
        String tipoRutina = "bajoImpacto";
        Intent intent = new Intent(this,ListaDeEjercicios.class);
        intent.putExtra("tipoRutina", tipoRutina);
        startActivity(intent);
    }
    public void onClickTonificacion(View view){
        String tipoRutina = "tonificacion";
        Intent intent = new Intent(this,ListaDeEjercicios.class);
        intent.putExtra("tipoRutina", tipoRutina);
        startActivity(intent);
    }

}