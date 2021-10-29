package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView textNome;
    private TextView textIdade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        //Recuperar os dados enviados da primeira Activity com Bundle
        Bundle dados = getIntent().getExtras();
        //Recuper os itens da Array de dados
        textNome.setText(dados.getString("nome"));
        textIdade.setText(dados.getString("idade"));
        //ou para pegar um número
        //int idade = dados.getInt("idade");

    }
}