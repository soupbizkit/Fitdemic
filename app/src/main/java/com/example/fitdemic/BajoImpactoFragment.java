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


public class BajoImpactoFragment extends ListFragment {

    static interface Escucha{
        public void onItemSeleccionadoBajoImpacto(long id);
    }

    private BajoImpactoFragment.Escucha escucha;

    public BajoImpactoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] dataSet = new String[Ejercicio.ejerciciosBajoImpacto.length];
        for (int i = 0; i < Ejercicio.ejerciciosBajoImpacto.length; i++) {
            dataSet[i] = Ejercicio.ejerciciosBajoImpacto[i].getNombre();
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, dataSet);
        setListAdapter(arrayAdapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.escucha = (BajoImpactoFragment.Escucha)context;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        if(escucha != null){
            escucha.onItemSeleccionadoBajoImpacto(id);
        }
    }
}