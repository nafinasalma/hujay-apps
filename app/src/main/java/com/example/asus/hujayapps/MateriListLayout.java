package com.example.asus.hujayapps;

import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.RawRes;

/**
 * Created by super on 7/19/2018.
 */

public class MateriListLayout {
    private String title;
    private @DrawableRes int drawableTitleResId;
    private @LayoutRes int layoutResId;
    private @DrawableRes int imagePopupResId;
    private @RawRes int soundResId;
    private MateriFragment mFragment;

    public MateriListLayout(String title, @DrawableRes int drawableTitleResId, @LayoutRes int layoutResId,
                            @DrawableRes int imagePopupResId, @RawRes int soundResId) {
        this.title = title;
        this.drawableTitleResId = drawableTitleResId;
        this.layoutResId = layoutResId;
        this.imagePopupResId = imagePopupResId;
        this.soundResId = soundResId;
        mFragment = new MateriFragment(layoutResId);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDrawableTitleResId() {
        return drawableTitleResId;
    }

    public void setDrawableTitleResId(int drawableTitleResId) {
        this.drawableTitleResId = drawableTitleResId;
    }

    public int getLayoutResId() {
        return layoutResId;
    }

    public void setLayoutResId(int layoutResId) {
        this.layoutResId = layoutResId;
    }

    public int getImagePopupResId() {
        return imagePopupResId;
    }

    public void setImagePopupResId(int imagePopupResId) {
        this.imagePopupResId = imagePopupResId;
    }

    public int getSoundResId() {
        return soundResId;
    }

    public void setSoundResId(int soundResId) {
        this.soundResId = soundResId;
    }

    public MateriFragment getmFragment() {
        return mFragment;
    }

    public void setmFragment(MateriFragment mFragment) {
        this.mFragment = mFragment;
    }
}
