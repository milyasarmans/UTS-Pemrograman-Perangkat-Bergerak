package com.milyasarmans.utsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu = findViewById(R.id.menuspinner);

        List<String> submenu = new ArrayList<>();
        submenu.add("MENU");
        submenu.add("BANTUAN");
        submenu.add("PROFIL");

        ArrayAdapter<String> dataMenu;
        dataMenu = new ArrayAdapter(this, android.R.layout.simple_spinner_item, submenu);
        dataMenu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        menu.setAdapter(dataMenu);

        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (parent.getItemAtPosition(i).equals("MENU")){
                }
                else{
                    String item = parent.getItemAtPosition(i).toString();

                    if(parent.getItemAtPosition(i).equals("BANTUAN")){
                        Intent intent = new Intent(MainActivity.this, MainPanduan.class);
                        startActivity(intent);
                    }
                    else if(parent.getItemAtPosition(i).equals("PROFIL")){
                        Intent intent = new Intent(MainActivity.this, MainAuthor.class);
                        startActivity(intent);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void waybelerang(View view) {
        Intent wbintent = new Intent(MainActivity.this, MainWBelerang.class);
        startActivity(wbintent);
    }

    public void pantaiklara (View view) {
        Intent pkintent = new Intent(MainActivity.this, MainPKlara.class);
        startActivity(pkintent);
    }

    public void pantaigigihiu(View view) {
        Intent pghintent = new Intent(MainActivity.this, MainPantaiGigiHiu.class);
        startActivity(pghintent);
    }

    public void danaubekri(View view) {
        Intent dbintent = new Intent(MainActivity.this, MainDanauBekri.class);
        startActivity(dbintent);
    }
}