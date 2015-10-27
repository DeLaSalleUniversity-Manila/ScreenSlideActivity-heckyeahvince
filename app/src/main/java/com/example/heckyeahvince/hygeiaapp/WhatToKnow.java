package com.example.heckyeahvince.hygeiaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class WhatToKnow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_to_know);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        pager.setPageTransformer(true, new DepthPageTransformer());
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return WhatToKnowFragment_1.newInstance("Infographic 1: Breast Cancer");
                case 1: return WhatToKnowFragment_2.newInstance("Infographic 2: Breast Cancer Facts");
                case 2: return WhatToKnowFragment_3.newInstance("Infographic 3: Breast Cancer in Numbers");
                default: return WhatToKnowFragment_3.newInstance("Error.");
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}