package org.d3ifcool.matepets;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DidinHamdaniA.Md.Kom on 14/03/2018.
 */

public class MenuAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MenuAdapter(Context petsTabs, FragmentManager fm) {
        super(fm);
        mContext = petsTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MyPetsFragment();
            default:
                return new FavoritePetsFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.Your_Pets);
            default:
                return mContext.getString(R.string.Favorite);
        }
    }
}
