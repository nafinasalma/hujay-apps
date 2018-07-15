package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IqroDuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro_dua);
    }

    public void moveduateori(View view) {
        Intent i = new Intent(IqroDuaActivity.this, TeoriDuaActivity.class);
        startActivity(i);
    }

    public void moveduanulis(View view) {
        Intent i = new Intent(IqroDuaActivity.this, NulisDuaActivity.class);
        startActivity(i);
    }

    public void movegamekedua(View view) {
        Intent i = new Intent(IqroDuaActivity.this, GameDuaActivity.class);
        startActivity(i);
    }

    public void moveqakedua(View view) {
        Intent i = new Intent(IqroDuaActivity.this, QaDuaActivity.class);
        startActivity(i);
    }
}
