package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText etSimpanPin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etSimpanPin = (EditText) findViewById(R.id.et_simpan_pin);
    }
    public void simpanPin(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("auth",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if(etSimpanPin.getText().toString().isEmpty()){
            editor.remove("pin");
            editor.commit();
            Toast.makeText(this,"PIN di hapus", Toast.LENGTH_SHORT).show();
            return;
        }

        String simpanPin = etSimpanPin.getText().toString().trim();
        editor.putString("pin",simpanPin);
        editor.commit();
        Toast.makeText(this,"PIN Telah di simpan" , Toast.LENGTH_SHORT).show();
    }
}