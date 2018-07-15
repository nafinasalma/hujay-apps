package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IqroTigaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro_tiga);
    }

    public void movetigateori(View view) {
        Intent i = new Intent(IqroTigaActivity.this, TeoriTigaActivity.class);
        startActivity(i);
    }

    public void movetiganulis(View view) {
        Intent i = new Intent(IqroTigaActivity.this, NulisTigaActivity.class);
        startActivity(i);
    }

    public void movetigagame(View view) {
        Intent i = new Intent(IqroTigaActivity.this, GameTigaActivity.class);
        startActivity(i);
    }

    public void movetigaqa(View view) {
        Intent i = new Intent(IqroTigaActivity.this, QaTigaActivity.class);
        startActivity(i);
    }
}
