package com.milyasarmans.utsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainTHWB extends AppCompatActivity {

    TextView totalPembayaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_thwb);
        totalPembayaran = findViewById(R.id.totalbayar);
        totalPembayaran.setText(getIntent().getStringExtra("Bayar"));
    }
}