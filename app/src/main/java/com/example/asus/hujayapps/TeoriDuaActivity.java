package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class TeoriDuaActivity extends AppCompatActivity implements HurufFragment.OnFragmentButtonClick {

    private CustomViewPager vpFragments;
    private ArrayList<HurufFragment> hurufFragments = new ArrayList<>();
    private HurufFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teori_dua);

        hurufFragments.add(new HurufFragment("ha"));
        hurufFragments.add(new HurufFragment("kho"));
        hurufFragments.add(new HurufFragment("dal"));
        hurufFragments.add(new HurufFragment("dzal"));
        hurufFragments.add(new HurufFragment("ro"));

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