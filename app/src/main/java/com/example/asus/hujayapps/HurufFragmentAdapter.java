package com.example.asus.hujayapps;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class HurufFragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;

    private ArrayList<HurufFragment> hurufFragments = new ArrayList<>();

    public HurufFragmentAdapter(Context context, FragmentManager fm,
                                ArrayList<HurufFragment> hurufFragments) {
        super(fm);
        mContext = context;
        this.hurufFragments = hurufFragments;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return hurufFragments.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return hurufFragments.get(position);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return hurufFragments.size();
    }

}