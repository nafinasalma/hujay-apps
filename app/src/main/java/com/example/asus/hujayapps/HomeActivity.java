package com.example.asus.hujayapps;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    PopupMenu popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView txt = (TextView) findViewById(R.id.custom_font);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/comic.ttf");
        txt.setTypeface(font);
        TextView txt1 = (TextView) findViewById(R.id.font_custom);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/comic.ttf");
        txt.setTypeface(font);
}

    public void pindahsatu(View view) {
        Intent i = new Intent(HomeActivity.this, IqroSatuActivity.class);
        startActivity(i);
    }

    public void pindahdua(View view) {
        Intent i = new Intent(HomeActivity.this, IqroDuaActivity.class);
        startActivity(i);
    }

    public void pindahtiga(View view) {
        Intent i = new Intent(HomeActivity.this, IqroTigaActivity.class);
        startActivity(i);
    }

    public void pindahempat(View view) {
        Intent i = new Intent(HomeActivity.this, IqroEmpatActivity.class);
        startActivity(i);
    }

    public void pindahlima(View view) {
        Intent i = new Intent(HomeActivity.this, IqroLimaActivity.class);
        startActivity(i);
    }

    public void pindahenam(View view) {
        Intent i = new Intent(HomeActivity.this, IqroEnamActivity.class);
        startActivity(i);
    }

    public void openMenu(View view) {
        Log.e("MENU", "Open");
        openOptionsMenu();
    }

    public void showPopup(View v) {

        popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popup.getMenu());
        popup.show();
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent;
                switch (item.getItemId()) {
                    case R.id.menuPetunjuk:
                        intent = new Intent(HomeActivity.this, CaraPenggunaanActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.menuInfo:
                        intent = new Intent(HomeActivity.this, AppInfoActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popup_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menuPetunjuk:
                intent = new Intent(this, CaraPenggunaanActivity.class);
                startActivity(intent);
                break;
            case R.id.menuInfo:
                intent = new Intent(this, AppInfoActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}