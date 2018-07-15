package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IqroLimaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro_lima);
    }

    public void movelimateori(View view) {
        Intent i = new Intent(IqroLimaActivity.this, TeoriLimaActivity.class);
        startActivity(i);
    }

    public void movelimanulis(View view) {
        Intent i = new Intent(IqroLimaActivity.this, NulisLimaActivity.class);
        startActivity(i);
    }

    public void movelimagame(View view) {
        Intent i = new Intent(IqroLimaActivity.this, GameLimaActivity.class);
        startActivity(i);
    }

    public void movelimaqa(View view) {
        Intent i = new Intent(IqroLimaActivity.this, QaLimaActivity.class);
        startActivity(i);
    }
}
