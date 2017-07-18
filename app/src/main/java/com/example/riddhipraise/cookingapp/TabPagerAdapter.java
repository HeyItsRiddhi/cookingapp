package com.example.riddhipraise.cookingapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by PRAISEAyorinde on 2017-07-17.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {

        final int TAB_COUNT;


    public TabPagerAdapter(FragmentManager supportFragmentManager, int numberOfTabs) {
        super(supportFragmentManager);
        this.TAB_COUNT = numberOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            //Open home tab
            case 0:
                HomeTab homeTab = new HomeTab();
                return homeTab;

            //open search tab
            case 1:
                SearchTab searchTab = new SearchTab();
                return searchTab;

            //open user profile tab
            case 2:
                UserProfileTab userTab = new UserProfileTab();
                return userTab;

            default:
                return null;
        }

    }

    public int getCount(){
        return TAB_COUNT;
    }

}
