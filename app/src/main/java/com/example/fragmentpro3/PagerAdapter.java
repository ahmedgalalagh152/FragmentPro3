package com.example.fragmentpro3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                FragmentOne fragmentOne=new FragmentOne();
                return  fragmentOne;
            case 1:
                FragmentTwo fragmentTwo=new FragmentTwo();
                return fragmentTwo;
            case 2:
                FragmentThree fragmentThree=new FragmentThree();
                return  fragmentThree;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
