package com.example.ffseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ramodesejado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramodesejado);
    }
    public void activity_acidentes_pessoais(View view) {
        Intent intent = new Intent(this, AcidentesPessoais.class);
        startActivity(intent);
    }
}