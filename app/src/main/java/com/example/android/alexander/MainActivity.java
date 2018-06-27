package com.example.android.alexander;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.viewpager);
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.geo);
        tabLayout.getTabAt(1).setIcon(R.drawable.history);
        tabLayout.getTabAt(2).setIcon(R.drawable.place);
        tabLayout.getTabAt(3).setIcon(R.drawable.enter);
        tabLayout.getTabAt(4).setIcon(R.drawable.events);
    }
}
