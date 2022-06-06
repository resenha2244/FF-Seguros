package com.example.ffseguros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class paginainicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginainicial);
    }
        public void activity_ramodesejado(View view) {
            Intent intent = new Intent(this, ramodesejado.class);
            startActivity(intent);
    }
}