package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    public Button botaotwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        botaotwo = (Button) findViewById(R.id.adicionar_one);
        botaotwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  adicionarONE();
            }
        });
    }

    public void adicionarONE(){
        Intent obj = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(obj);
    }
}