package com.example.projetopa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button addPacient;
    private Button editPaciente;
    private Button delPaciente;
    private Button verTabela ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        addPacient = (Button) findViewById(R.id.addpaciente);
        editPaciente = (Button) findViewById(R.id.editpaciente);
        delPaciente = (Button) findViewById(R.id.delpaciente);
        verTabela = (Button) findViewById(R.id.vertabela);


        addPacient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, AddPaciente.class);
                startActivity(intent);
            }
        });

        editPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, EditPaciente.class);
                startActivity(intent);
            }
        });

        delPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, DelPaciente.class);
                startActivity(intent);
            }
        });

        verTabela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, VerTabela.class);
                startActivity(intent);
            }
        });
    }
}
