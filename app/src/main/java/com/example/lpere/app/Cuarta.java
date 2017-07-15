package com.example.lpere.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cuarta extends AppCompatActivity {

    public void atras(View view){
        Intent i = new Intent(this, Tercera.class );
        startActivity(i);
    }
    public void siguiente(View view){
        Intent i = new Intent(this, Login.class );
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta);
    }
}
