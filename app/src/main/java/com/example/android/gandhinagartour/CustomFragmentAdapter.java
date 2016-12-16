package com.example.android.gandhinagartour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mind on 15/12/16.
 */

public class CustomFragmentAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CustomFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SwaminarayanAkshardham();
        }else if (position == 1) {
            return new DandiKutir();
        }else if (position == 2) {
            return new IndrodaNaturePark();
        }else {
            return new SaritaUdhyan();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.akshardham);
        }else if (position == 1) {
            return mContext.getString(R.string.dandikutir);
        }else if (position == 2) {
            return mContext.getString(R.string.indroda);
        }else {
            return mContext.getString(R.string.saritaudhyan);
        }
    }
}
