package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IqroEmpatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro_empat);
    }

    public void moveempatteori(View view) {
        Intent i = new Intent(IqroEmpatActivity.this, TeoriEmpatActivity.class);
        startActivity(i);
    }

    public void moveempatnulis(View view) {
        Intent i = new Intent(IqroEmpatActivity.this, NulisEmpatActivity.class);
        startActivity(i);
    }

    public void moveempatgame(View view) {
        Intent i = new Intent(IqroEmpatActivity.this, GameEmpatActivity.class);
        startActivity(i);
    }

    public void moveempatqa(View view) {
        Intent i = new Intent(IqroEmpatActivity.this, QaEmpatActivity.class);
        startActivity(i);
    }
}
