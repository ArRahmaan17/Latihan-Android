package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    //inisialisasi
    Button btnKali;
    Button btnBagi;
    Button btnTambah;
    Button btnKurang;
    EditText etAngka1;
    EditText etAngka2;
    TextView tvHasilKalkulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        //mencari target inisialisasinya
        btnBagi = (Button) findViewById(R.id.btn_bagi);
        btnKali = (Button) findViewById(R.id.btn_kali);
        btnKurang = (Button) findViewById(R.id.btn_kurang);
        btnTambah = (Button) findViewById(R.id.btn_tambah);
        etAngka1 = (EditText) findViewById(R.id.et_angka1);
        etAngka2 = (EditText) findViewById(R.id.et_angka2);
        tvHasilKalkulator = (TextView) findViewById(R.id.tv_hasil_kalkulator);
    }
    //button tambah (method)
    public void tambah(View view){
        if (etAngka1.getText().toString().isEmpty()){
            etAngka1.setError("ISI DULU");
            etAngka1.hasFocus();
        }else if(etAngka2.getText().toString().isEmpty()){
            etAngka2.setError("ISI DULU");
            etAngka1.hasFocus();
        }else{
            String angka1s = etAngka1.getText().toString().trim();
            String angka2s = etAngka2.getText().toString().trim();
            int angka1 = Integer.parseInt(angka1s);
            int angka2 = Integer.parseInt(angka2s);
            int hasil = angka1 + angka2;
            tvHasilKalkulator.setText(""+hasil);
        }
    }

    public void kurang(View view){
        if (etAngka1.getText().toString().isEmpty()){
            etAngka1.setError("ISI DULU");
            etAngka1.hasFocus();
        }else if(etAngka2.getText().toString().isEmpty()){
            etAngka2.setError("ISI DULU");
            etAngka1.hasFocus();
        }else{
            String angka1s = etAngka1.getText().toString().trim();
            String angka2s = etAngka2.getText().toString().trim();
            int angka1 = Integer.parseInt(angka1s);
            int angka2 = Integer.parseInt(angka2s);
            int hasil = angka1 - angka2;
            tvHasilKalkulator.setText(""+hasil);
        }
    }

    public void bagi(View view){
        if (etAngka1.getText().toString().isEmpty()){
            etAngka1.setError("ISI DULU");
            etAngka1.hasFocus();
        }else if(etAngka2.getText().toString().isEmpty()){
            etAngka2.setError("ISI DULU");
            etAngka1.hasFocus();
        }else{
            String angka1s = etAngka1.getText().toString().trim();
            String angka2s = etAngka2.getText().toString().trim();
            int angka1 = Integer.parseInt(angka1s);
            int angka2 = Integer.parseInt(angka2s);
            int hasil = angka1 / angka2;

            tvHasilKalkulator.setText(""+hasil);
        }
    }

    public void kali(View view){
        if (etAngka1.getText().toString().isEmpty()){
            etAngka1.setError("ISI DULU");
            etAngka1.hasFocus();
        }else if(etAngka2.getText().toString().isEmpty()){
            etAngka2.setError("ISI DULU");
            etAngka1.hasFocus();
        }else{
            String angka1s = etAngka1.getText().toString().trim();
            String angka2s = etAngka2.getText().toString().trim();
            int angka1 = Integer.parseInt(angka1s);
            int angka2 = Integer.parseInt(angka2s);
            int hasil = angka1 * angka2;

            tvHasilKalkulator.setText(""+hasil);
        }
    }

    public void mod(View view){
        if (etAngka1.getText().toString().isEmpty()){
            etAngka1.setError("ISI DULU");
            etAngka1.hasFocus();
        }else if(etAngka2.getText().toString().isEmpty()){
            etAngka2.setError("ISI DULU");
            etAngka1.hasFocus();
        }else{
            String angka1s = etAngka1.getText().toString().trim();
            String angka2s = etAngka2.getText().toString().trim();
            int angka1 = Integer.parseInt(angka1s);
            int angka2 = Integer.parseInt(angka2s);
            int hasil = angka1 % angka2;
            tvHasilKalkulator.setText(""+hasil);
        }
    }
    //method button clear
    public void clear(View view){
            etAngka1.setText("");
            etAngka2.setText("");
            tvHasilKalkulator.setText("0");
            etAngka1.findFocus();
    }
}