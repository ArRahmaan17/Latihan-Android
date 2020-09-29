package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login2 extends AppCompatActivity {
    EditText etsimpanPin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        etsimpanPin2 = (EditText) findViewById(R.id.et_simpan_pin2);
    }
    public void simpanPin2(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("auth", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if(etsimpanPin2.getText().toString().isEmpty()){
            editor.remove("pin");
            editor.commit();
            Toast.makeText(Login2.this,"Pin di hapus", Toast.LENGTH_LONG).show();
            return;
        }

        String simpanPin2 = etsimpanPin2.getText().toString().trim();
        editor.putString("pin",simpanPin2);
        editor.commit();
        Toast.makeText(Login2.this,"pin di simpan",Toast.LENGTH_SHORT).show();
    }
}