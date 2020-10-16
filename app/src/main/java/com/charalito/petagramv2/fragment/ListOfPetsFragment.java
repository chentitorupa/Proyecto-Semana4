package com.charalito.petagramv2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.charalito.petagramv2.R;
import com.charalito.petagramv2.adapter.Adaptador;
import com.charalito.petagramv2.pojo.Mascota;

import java.util.ArrayList;

public class ListOfPetsFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // La siguiente linea equivale al setContentView().
        View v = inflater.inflate(R.layout.fragment_list_of_pets,container,false);

        // Inicio RecyclerView

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        InicializarListaContactos();
        InicializarAdaptador();


        //Fin RecyclerView

        return v;

    }

    public void InicializarAdaptador(){
        Adaptador adaptador = new Adaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }
    public void InicializarListaContactos(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro4,"Tobby","8",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas.add(new Mascota(R.drawable.perro2,"Nico","2",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas.add(new Mascota(R.drawable.gato1,"Mushu","4",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas.add(new Mascota(R.drawable.gato3,"Viviano","1",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas.add(new Mascota(R.drawable.perro3,"Deisy","2",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas.add(new Mascota(R.drawable.gato2,"Bianca","11",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas.add(new Mascota(R.drawable.perro1,"Zeus","6",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas.add(new Mascota(R.drawable.gato4,"Lisa","9",R.drawable.bone_like,R.drawable.bone_rate));

    }
}
