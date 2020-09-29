package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Gojek(View view) {
        Toast.makeText(this, "Gojek", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, gojek.class);
        startActivity(intent);
    }

    public void Gofood(View view) {
        Toast.makeText(this, "Gofood", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, ordergofood.class);
        startActivity(intent);
    }

    public void Gofood2(View view) {
        Toast.makeText(this, "Gofood2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, ordergofood2.class);
        startActivity(intent);
    }

    public void Login(View view) {
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
    }

    public void Gojek2(View view) {
        Toast.makeText(this, "Gojek 2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Gojek2.class);
        startActivity(intent);
    }

    public void Login2(View view){
        Toast.makeText(this,"Login 2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Login2.class);
        startActivity(intent);
    }
    public void kal(View view){
        Toast.makeText(this,"Latihan kalkulator", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Kalkulator.class);
        startActivity(intent);
    }
    public void arr(View view){
        Toast.makeText(this,"Latihan kalkulator", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, array.class);
        startActivity(intent);
    }
}