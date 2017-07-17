package com.example.mahmoud.multiscreen_miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mahmoud on 23/02/17.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Numbers", "Coloers", "Family", "Phrases" };
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new ColorsFragment();
        } else if(position == 2) {
            return new FamilyFragment();
        } else if(position == 3) {
            return new PhrasesFragment();
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
