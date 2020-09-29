package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gofood2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood2);

        Bundle b = getIntent().getExtras();
        String nama = b.getString("nama");
        String alamat = b.getString("alamat");
        String pesanan = b.getString("pesanan");

        TextView tvNama = (TextView)findViewById(R.id.tv_nama_3);
        final TextView tvAlamat = (TextView) findViewById(R.id.tv_alamat_3);
        TextView tvPesanan = (TextView) findViewById(R.id.tv_pesanan3);

        tvNama.setText(nama);
        tvAlamat.setText(alamat);
        tvPesanan.setText(pesanan);

        Button btnCancel = (Button)findViewById(R.id.btn_cance2);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gofood2.this, ordergofood2.class);
                startActivity(intent);
            }
        });
    }
}