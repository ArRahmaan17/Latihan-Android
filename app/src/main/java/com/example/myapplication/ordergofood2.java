package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ordergofood2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordergofood2);

        final EditText etNama2 = (EditText) findViewById(R.id.et_nama2);
        final EditText etPesanan2 = (EditText) findViewById(R.id.et_pesanan2);
        final EditText etAlamat2 = (EditText) findViewById(R.id.et_alamat2);
        Button btnOrder = (Button) findViewById(R.id.btn_order2);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                String nama = etNama2.getText().toString();
                String pesanan = etPesanan2.getText().toString();
                String alamat = etAlamat2.getText().toString();
                b.putString("nama",nama);
                b.putString("alamat",alamat);
                b.putString("pesanan",pesanan);
                Intent intent = new Intent(ordergofood2.this, gofood2.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}