package com.example.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleSenha;
    private TextView textResultado;
    private Switch switchSenha;
    private CheckBox checkSenha;
    String texto = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleSenha = findViewById(R.id.toggleSenha);
        textResultado = findViewById((R.id.textResultado));
        switchSenha = findViewById(R.id.switchSenha);
        checkSenha = findViewById(R.id.checkSenha);

        adicionarListenerToggle();
        adicionarListenerSwitch();
        adicionarListenerCheck();

    }
    public void adicionarListenerSwitch(){
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    texto = "Switch ligado";
                }else {
                    texto = "Switch desligado";
                }
                textResultado.setText(texto);
            }
        });
    }

    public void adicionarListenerToggle(){
        toggleSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    texto = "Toggle button ligado";
                }else {
                    texto = "Toggle button desligado";
                }textResultado.setText(texto);
            }
        });
    }

    public void adicionarListenerCheck(){
        checkSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    texto = "Lembrar senha";
                }else {
                    texto = "Não lembrar senha";
                }
                textResultado.setText(texto);
            }
        });
    }

    public void enviar(View view){
        adicionarListenerSwitch();
        adicionarListenerToggle();
        adicionarListenerCheck();
    }

}