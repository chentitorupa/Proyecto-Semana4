package com.charalito.petagramv2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.charalito.petagramv2.R;
import com.charalito.petagramv2.adapter.Adaptador;
import com.charalito.petagramv2.pojo.Mascota;
import com.charalito.petagramv2.MainActivity;

import java.util.ArrayList;

public class RatingActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas2;
    private RecyclerView listaMascotasRaiting;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        listaMascotasRaiting = (RecyclerView) findViewById(R.id.rvMascotas2);

        LinearLayoutManager llm = new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotasRaiting.setLayoutManager(llm);
        InicializarListaRaitings();
        InicializarAdaptador2();

    }


    public void InicializarAdaptador2(){
        Adaptador adaptador = new Adaptador(mascotas2, RatingActivity.this);
        listaMascotasRaiting.setAdapter(adaptador);
    }
    public void InicializarListaRaitings(){

        mascotas2 = new ArrayList<Mascota>();
        mascotas2.add(new Mascota(R.drawable.perro4,"Tobby","8",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas2.add(new Mascota(R.drawable.gato1,"Mushu","2",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas2.add(new Mascota(R.drawable.gato3,"Viviano","2",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas2.add(new Mascota(R.drawable.perro1,"Zeus","6",R.drawable.bone_like,R.drawable.bone_rate));
        mascotas2.add(new Mascota(R.drawable.perro2,"Nico","9",R.drawable.bone_like,R.drawable.bone_rate));

    }


}
