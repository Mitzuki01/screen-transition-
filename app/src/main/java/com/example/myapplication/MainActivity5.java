package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    public Button buttonFive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        buttonFive=(Button) findViewById(R.id.adicionar_four);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarFOUR();
            }
        });
    }
    public void adicionarFOUR(){
        Intent obj = new Intent(MainActivity5.this,MainActivity6.class);
        startActivity(obj);
    }

}