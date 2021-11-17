package com.milyasarmans.utsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainWBelerang extends AppCompatActivity {

    private int plus, totalMinus, totalHarga, totaltiket;
    private int total = 0;
    private TextView hargaBayar, tiket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_wbelerang);
        hargaBayar = findViewById(R.id.hargaBayar);
        tiket = findViewById(R.id.tiket);
    }

    public void plus(View view) {
        plus = 1;
        total += plus;
        totaltiket = total;
        totalHarga = total*15000;
        tiket.setText(Integer.toString(totaltiket));
        hargaBayar.setText(Integer.toString(totalHarga));
    }

    public void minus(View view) {
        if (total==0){
            total = 0;
            tiket.setText(Integer.toString(total));
            hargaBayar.setText(Integer.toString(total));
        }
        else if (total>0){
            totalMinus = total-1;
            totalHarga = totalMinus*15000;
            tiket.setText(Integer.toString(totalMinus));
            hargaBayar.setText(Integer.toString(totalHarga));
        }
        else{
            total = 0;
            tiket.setText(Integer.toString(total));
            hargaBayar.setText(Integer.toString(total));
        }
        total = totalMinus;
    }

    public void Bayar(View view) {
        Integer sumPrice = totalHarga;
        Intent intent = new Intent(MainWBelerang.this, MainTHWB.class);
        intent.putExtra("Bayar", sumPrice.toString());
        startActivity(intent);
    }
}