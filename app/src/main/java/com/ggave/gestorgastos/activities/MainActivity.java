package com.ggave.gestorgastos.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ggave.gestorgastos.Listado;
import com.ggave.gestorgastos.R;

public class MainActivity extends AppCompatActivity {

    private EditText monto;
    private RadioGroup ingreso_egreso;
    private RadioGroup tipo;
    private FloatingActionButton addButoon;
    private RecyclerView lista;
    private Button ahorro;
    private Button credito;
    private Button efectivo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingreso_egreso = findViewById(R.id.group_in_eg);
        tipo = findViewById(R.id.tipos_ingre_egre);
        monto = findViewById(R.id.monto_edittext);
        addButoon =findViewById(R.id.floatingActionButton);
        lista = findViewById(R.id.list_item);
        ahorro = findViewById(R.id.actual_ahorro);
        credito = findViewById(R.id.actual_credito);
        efectivo = findViewById(R.id.actual_efectivo);

        addButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callItems();

            }
        });

        ahorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callregistros();

            }
        });



    }




private  void callItems(){

    Intent intn = new Intent(this, RegistroActivity.class);
    startActivity(intn);

}

public void callregistros(){


    Intent intn = new Intent(this, ListActivity.class);
    startActivity(intn);

}

}


