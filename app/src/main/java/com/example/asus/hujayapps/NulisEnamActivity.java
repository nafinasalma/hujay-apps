package com.example.asus.hujayapps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class NulisEnamActivity extends AppCompatActivity {

    private CanvasView canvasView;
    private ViewPager vpFragments;
    private ArrayList<CanvasFragment> canvasFragments = new ArrayList<>();
    private CanvasFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nulis_enam);

        canvasView = (CanvasView) findViewById(R.id.canvas);
        canvasFragments.add(new CanvasFragment("waunulis"));
        canvasFragments.add(new CanvasFragment("lamalif"));
        canvasFragments.add(new CanvasFragment("hamzah"));
        canvasFragments.add(new CanvasFragment("ya"));

        adapter = new CanvasFragmentAdapter(this, getSupportFragmentManager(), canvasFragments);
        vpFragments = (ViewPager) findViewById(R.id.vpCanvas);
        vpFragments.setAdapter(adapter);
    }

    public void clearCanvas(View v) {
        canvasView.clearCanvas();
    }
}
