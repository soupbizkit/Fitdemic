package com.example.fitdemic;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RutinaDiariaFragment extends ListFragment {

    static interface Escucha{
        public void onItemSeleccionadoRutina(long id);
    }

    private Escucha escucha;

    public RutinaDiariaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] dataSet= new String[Ejercicio.ejerciciosPerdidaGrasa.length];
        for(int i = 0; i< Ejercicio.ejerciciosPerdidaGrasa.length ; i++){
            dataSet[i] = Ejercicio.ejerciciosPerdidaGrasa[i].getNombre();
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,dataSet);
        setListAdapter(arrayAdapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.escucha = (Escucha)context;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        if(escucha != null){
            escucha.onItemSeleccionadoRutina(id);
        }
    }
}