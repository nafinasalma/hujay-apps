package com.example.asus.hujayapps;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import static android.support.v4.view.PagerAdapter.POSITION_NONE;

public class CanvasFragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;

    private ArrayList<CanvasFragment> canvasFragments = new ArrayList<>();

    public CanvasFragmentAdapter(Context context, FragmentManager fm,
                                 ArrayList<CanvasFragment> canvasFragments) {
        super(fm);
        mContext = context;
        this.canvasFragments = canvasFragments;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return canvasFragments.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return canvasFragments.get(position);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return canvasFragments.size();
    }
}
