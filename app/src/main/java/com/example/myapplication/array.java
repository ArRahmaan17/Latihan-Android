package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class array extends AppCompatActivity {
    TextView tvCekArray;
    TextView tvCekArrayList;
    int[] angka={1,2,3,4,5,6};
    ArrayList <Integer> listangka = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        tvCekArray = (TextView)findViewById(R.id.tv_cek);
        tvCekArrayList =(TextView)findViewById(R.id.tv_cek2);

        for (int a = 0; a<angka.length;a++){
            tvCekArray.append(""+angka[a]);
        }
        for (int i=1;i< angka.length;i++){
            listangka.add(i);
        }
        tvCekArrayList.setText(""+listangka);
    }

    public void rubahDataArray(View view){
        Toast.makeText(this,"maaf tidak bisa menambah element baru pada array angka", Toast.LENGTH_LONG).show();
    }
    public void rubahDataArrayList(View view){
        int x = listangka.size();
        int y = x+1;
        listangka.add(y);
        tvCekArrayList.setText(""+listangka);
    }
}