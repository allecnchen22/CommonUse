package com.example.allenchen.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initViewPager();

    }

    private void initViewPager(){
        List<Fragment> fragments = getFragments();
        PagerAdapter pagerAdapter = new PagerAdapter( getSupportFragmentManager() ,fragments);
        ViewPager viewPager = (ViewPager)this.findViewById(R.id.vp1);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager);
    }

    private List<Fragment> getFragments() {

        List<Fragment> fragments = new ArrayList<Fragment> ();

        fragments.add(PageFragment.newInstance(R.drawable.a1));
        fragments.add(PageFragment.newInstance(R.drawable.a2));
        fragments.add(PageFragment.newInstance(R.drawable.a3));
        fragments.add(PageFragment.newInstance(R.drawable.a4));

        return fragments;
    }
}
