package com.charalito.petagramv2.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.charalito.petagramv2.R;
import com.charalito.petagramv2.adapter.Adaptador;
import com.charalito.petagramv2.adapter.PerfilAdapter;
import com.charalito.petagramv2.pojo.Mascota;

import java.util.ArrayList;


public class PerfilPetFragment extends Fragment {

    private RecyclerView rvPerfilmascotas;
    ArrayList<Mascota> mascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil_pet,container,false);

        rvPerfilmascotas = (RecyclerView) v.findViewById(R.id.rvPerfilmascotas);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        rvPerfilmascotas.setLayoutManager(glm);
        InicializarListaContactos();
        InicializarAdaptador();


        return v;
    }

    private void InicializarAdaptador() {
        PerfilAdapter adaptador = new PerfilAdapter(mascotas, getActivity());
        rvPerfilmascotas.setAdapter(adaptador);
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
        mascotas.add(new Mascota(R.drawable.perro4,"Tobby","8",R.drawable.bone_like,R.drawable.bone_rate));

    }

}