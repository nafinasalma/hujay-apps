package com.example.asus.hujayapps;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class NulisLimaActivity extends AppCompatActivity {

    private CanvasView canvasView;
    private ViewPager vpFragments;
    private ArrayList<CanvasFragment> canvasFragments = new ArrayList<>();
    private CanvasFragmentAdapter adapter;
    private ImageButton btnNext,btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulis);

        btnNext = (ImageButton) findViewById(R.id.next) ;
        btnPrev = (ImageButton) findViewById(R.id.prev) ;
        canvasView = (CanvasView) findViewById(R.id.canvas);
        canvasFragments.add(new CanvasFragment("qof"));
        canvasFragments.add(new CanvasFragment("kaf"));
        canvasFragments.add(new CanvasFragment("lam"));
        canvasFragments.add(new CanvasFragment("mim"));
        canvasFragments.add(new CanvasFragment("nun"));

        adapter = new CanvasFragmentAdapter(this, getSupportFragmentManager(), canvasFragments);
        vpFragments = (ViewPager) findViewById(R.id.vpCanvas);
        vpFragments.setAdapter(adapter);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextItem();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevItem();
            }
        });
        btnPrev.bringToFront();
        btnNext.bringToFront();
    }

    public void clearCanvas(View v) {
        canvasView.clearCanvas();
    }

    public void nextItem(){
        if(vpFragments.getCurrentItem() != adapter.getCount())
            vpFragments.setCurrentItem(vpFragments.getCurrentItem()+1);
    }

    public void prevItem(){
        if(vpFragments.getCurrentItem() != 0)
            vpFragments.setCurrentItem(vpFragments.getCurrentItem()-1);
    }
}
