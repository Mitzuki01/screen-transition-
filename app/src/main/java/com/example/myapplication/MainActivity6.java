package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
        public Button botaoSix;
        public Button voltarOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        botaoSix = (Button) findViewById(R.id.enterTWO);
        voltarOne = (Button) findViewById(R.id.voltar);
        botaoSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entreDois();
            }
        });

        voltarOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarUM();
            }
        });

    }
    public void voltarUM(){
        Intent obj = new Intent(MainActivity6.this,MainActivity5.class);
        startActivity(obj);
    }
    public void entreDois(){
        Intent obj = new Intent(MainActivity6.this,MainActivity7.class);
        startActivity(obj);
    }

}