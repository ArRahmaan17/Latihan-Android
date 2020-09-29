package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class gojek extends AppCompatActivity {

        EditText etKilometer;
        Button btnTotal;
        TextView tvTotal;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gojek);
            etKilometer = (EditText) findViewById(R.id.et_kilometer);
            btnTotal = (Button) findViewById(R.id.btn_total_biaya);
            tvTotal = (TextView) findViewById(R.id.tv_Total);

        }
        public void totalBiaya(View view){
            if(etKilometer.getText().toString().isEmpty()){
                etKilometer.setError("Error");
                return;
            }
            String jarak = etKilometer.getText().toString().trim();
            int hargaPerKilometer = 3000;

            int jarakAngka = Integer.parseInt(jarak);

            int hasilHitung = jarakAngka*hargaPerKilometer;

            Toast.makeText(this,""+hasilHitung, Toast.LENGTH_SHORT).show();

            tvTotal.setText(""+hasilHitung);
    }
}