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

public class EstiramientosFragment extends ListFragment {

    static interface Escucha{
        public void onItemSeleccionadoEstiramiento(long id);
    }

    private EstiramientosFragment.Escucha escucha;

    public EstiramientosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] dataSet= new String[Ejercicio.ejerciciosEstiramiento.length];
        for(int i = 0; i< Ejercicio.ejerciciosEstiramiento.length ; i++){
            dataSet[i] = Ejercicio.ejerciciosEstiramiento[i].getNombre();
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,dataSet);
        setListAdapter(arrayAdapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.escucha = (EstiramientosFragment.Escucha)context;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        if(escucha != null){
            escucha.onItemSeleccionadoEstiramiento(id);
        }
    }
}