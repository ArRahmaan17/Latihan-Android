package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ordergofood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordergofood);

        final EditText etNama = (EditText) findViewById(R.id.et_nama);
        final EditText etPesan = (EditText) findViewById(R.id.et_pesanan);
        final EditText etAlamat = (EditText) findViewById(R.id.et_alamat);
        Button btnOrder = (Button) findViewById(R.id.btn_order);

        btnOrder.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                String nama = etNama.getText().toString();
                String pesan = etPesan.getText().toString();
                String alamat = etAlamat.getText().toString();
                b.putString("nama", nama);
                b.putString("alamat", alamat);
                b.putString("pesan", pesan);
                Intent intent = new Intent(ordergofood.this, gofood.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}