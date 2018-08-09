package com.example.asus.hujayapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class TeoriEmpatActivity extends AppCompatActivity implements HurufFragment.OnFragmentButtonClick {

    private CustomViewPager vpFragments;
    private ArrayList<HurufFragment> hurufFragments = new ArrayList<>();
    private HurufFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teori_empat);

        hurufFragments.add(new HurufFragment("tho"));
        hurufFragments.add(new HurufFragment("dzo"));
        hurufFragments.add(new HurufFragment("ain"));
        hurufFragments.add(new HurufFragment("ghoin"));
        hurufFragments.add(new HurufFragment("fa"));

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