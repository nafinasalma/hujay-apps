package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IqroSatuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro_satu);
    }

    public void movesatuteori(View view) {
        Intent i = new Intent(IqroSatuActivity.this, TeoriSatuActivity.class);
        startActivity(i);
    }

    public void movesatunulis(View view) {
        Intent i = new Intent(IqroSatuActivity.this, NulisSatuActivity.class);
        startActivity(i);
    }

    public void movesatugame(View view) {
        Intent i = new Intent(IqroSatuActivity.this, GameSatuActivity.class);
        startActivity(i);
    }

    public void movesatuqa(View view) {
        Intent i = new Intent(IqroSatuActivity.this, QaSatuActivity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}
