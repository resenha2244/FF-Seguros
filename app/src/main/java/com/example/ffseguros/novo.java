package com.example.ffseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class novo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo);
        }

    public void activity_login(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void activity_registro(View view) {
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }
}