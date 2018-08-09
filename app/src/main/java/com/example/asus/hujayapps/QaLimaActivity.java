package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QaLimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa_lima);
    }

    public void pilgansatu(View view) {
        Intent i = new Intent(QaLimaActivity.this, PilganLimaActivity.class);
        startActivity(i);
    }

    public void esaysatu(View view) {
        Intent i = new Intent(QaLimaActivity.this, EsayLimaActivity.class);
        startActivity(i);
    }
}
