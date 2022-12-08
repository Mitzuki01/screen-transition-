package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
        public Button botaoFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        botaoFour=(Button) findViewById(R.id.adicionar_three);
        botaoFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarTHREE();
            }
        });
    }

    public void adicionarTHREE(){
        Intent obj = new Intent(MainActivity4.this,MainActivity5.class);
        startActivity(obj);
    }
}