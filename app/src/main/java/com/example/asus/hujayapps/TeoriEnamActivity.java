package com.example.asus.hujayapps;

import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TeoriEnamActivity extends AppCompatActivity implements HurufFragment.OnFragmentButtonClick {

    private CustomViewPager vpFragments;
    private ArrayList<HurufFragment> hurufFragments = new ArrayList<>();
    private HurufFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teori_enam);

        hurufFragments.add(new HurufFragment("wau"));
        hurufFragments.add(new HurufFragment("hak"));
        hurufFragments.add(new HurufFragment("lamalif"));
        hurufFragments.add(new HurufFragment("hamzah"));
        hurufFragments.add(new HurufFragment("ya"));

        adapter = new HurufFragmentAdapter(this, getSupportFragmentManager(), hurufFragments);
        vpFragments = (CustomViewPager) findViewById(R.id.vpHuruf);
        vpFragments.setAdapter(adapter);

    }

    public void nextItem(){
        if(vpFragments.getCurrentItem() != adapter.getCount())
            vpFragments.setCurrentItem(vpFragments.getCurrentItem()+1);
    }

    public void prevItem(){
        if(vpFragments.getCurrentItem() != 0)
            vpFragments.setCurrentItem(vpFragments.getCurrentItem()-1);
    }

    @Override
    public void onFragmentButtonClick(String button) {
        if(button.equalsIgnoreCase("next"))
            nextItem();
        else
            prevItem();
    }
}
