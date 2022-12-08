package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    public Button buttoncorrigir;
    public Button buttoninicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        buttoncorrigir=(Button) findViewById(R.id.corrigir) ;
        buttoninicio=(Button) findViewById(R.id.inicio);
        buttoncorrigir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                corrigir();
            }
        });
        buttoninicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inicio();
            }
        });
    }
    public void inicio(){
        Intent obj = new Intent(MainActivity7.this,MainActivity.class);
        startActivity(obj);
    }
    public void corrigir(){
        Intent obj = new Intent(MainActivity7.this,MainActivity6.class);
        startActivity(obj);
    }

}