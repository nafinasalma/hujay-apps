package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QaEnamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa_enam);
    }

    public void pilgansatu(View view) {
        Intent i = new Intent(QaEnamActivity.this, PilganEnamActivity.class);
        startActivity(i);
    }

    public void esaysatu(View view) {
        Intent i = new Intent(QaEnamActivity.this, EsayEnamActivity.class);
        startActivity(i);
    }
}
