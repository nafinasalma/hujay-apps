package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QaSatuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa_satu);
    }

    public void pilgansatu(View view) {
        Intent i = new Intent(QaSatuActivity.this, PilganSatuActivity.class);
        startActivity(i);
    }

    public void esaysatu(View view) {
        Intent i = new Intent(QaSatuActivity.this, EsaySatuActivity.class);
        startActivity(i);
    }
}
