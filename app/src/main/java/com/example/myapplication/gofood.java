package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gofood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);

        Bundle b = getIntent().getExtras();
        String nama = b.getString("nama");
        String alamat = b.getString("alamat");
        String pesan = b.getString("pesan");

        TextView tvNama = (TextView) findViewById(R.id.tv_nama_2);
        TextView tvAlamat = (TextView) findViewById(R.id.tv_alamat_2);
        TextView tvPesan = (TextView) findViewById(R.id.tv_pesanan);

        tvNama.setText(nama);
        tvAlamat.setText(alamat);
        tvPesan.setText(pesan);

        Button btnCancel = (Button) findViewById(R.id.btn_cancel);
            btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(gofood.this,ordergofood.class);
                    startActivity(intent);

                }
            });
    }
}