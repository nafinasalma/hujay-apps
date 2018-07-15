package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IqroEnamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro_enam);
    }

    public void moveenamteori(View view) {
        Intent i = new Intent(IqroEnamActivity.this, TeoriEnamActivity.class);
        startActivity(i);
    }

    public void moveenamnulis(View view) {
        Intent i = new Intent(IqroEnamActivity.this, NulisEnamActivity.class);
        startActivity(i);
    }

    public void moveenamgame(View view) {
        Intent i = new Intent(IqroEnamActivity.this, GameEnamActivity.class);
        startActivity(i);
    }

    public void moveenamqa(View view) {
        Intent i = new Intent(IqroEnamActivity.this, QaEnamActivity.class);
        startActivity(i);
    }
}
