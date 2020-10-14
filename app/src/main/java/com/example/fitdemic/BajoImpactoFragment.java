package com.example.fitdemic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class BajoImpactoFragment extends ListFragment {
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
}