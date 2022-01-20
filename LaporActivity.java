package com.example.smartcity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.smartcity.database.Activity2;

public class LaporActivity extends AppCompatActivity {
    Spinner spLokasi,spKategori;
    Button buttonNews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lapor);

        spLokasi = (Spinner) findViewById(R.id.spLokasi);
        spKategori = (Spinner) findViewById(R.id.spKategori);

        buttonNews = (Button) findViewById(R.id.buttonNews);
        buttonNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LaporActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
    }
}