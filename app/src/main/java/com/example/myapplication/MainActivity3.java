package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    public Button botaoThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        botaoThree = (Button) findViewById(R.id.adicionar_three);
        botaoThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarTWO();
            }
        });
    }

    public void adicionarTWO(){
        Intent obj = new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(obj);
    }

}