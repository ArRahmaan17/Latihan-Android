package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Gojek2 extends AppCompatActivity {

    EditText etKilometer2 ;
    TextView tvTotal;
    Button btnAkumulasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gojek2);

        etKilometer2 = (EditText)findViewById(R.id.et_kilometer2);
        tvTotal = (TextView) findViewById(R.id.tv_Total2);
        btnAkumulasi = (Button)findViewById(R.id.btn_akumulasi);
    }

    public void Total(View view){
        if(etKilometer2.getText().toString().isEmpty()){
            etKilometer2.setError("Isi Donk");
            return;
        }
        String jarak = etKilometer2.getText().toString().trim();
        int Perkilo = 3000;
        int jarakAngka = Integer.parseInt(jarak);
        int Hasil = jarakAngka * Perkilo;

        tvTotal.setText(""+ Hasil);
    }
}