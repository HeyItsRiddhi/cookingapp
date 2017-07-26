package com.example.riddhipraise.cookingapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TabLayout menuTab = (TabLayout) findViewById(R.id.menuTab);

        final PagerAdapter adapter = new TabPagerAdapter (getSupportFragmentManager(), menuTab.getTabCount());
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pageView);

        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(menuTab));
        menuTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

    }
    public void editPassword(){
        EditText newPassword = (EditText) findViewById(R.id.new_password);
        newPassword.setVisibility(View.VISIBLE);

        TextView newPasswordTextView = (TextView) findViewById(R.id.newPasswordTextView);
        newPasswordTextView.setVisibility(View.VISIBLE);

        EditText cNewPassword = (EditText) findViewById(R.id.cNewPassword);
        cNewPassword.setVisibility(View.VISIBLE);

        TextView cNewPasswordTextView = (TextView) findViewById(R.id.cNewPasswordTextView);
        cNewPasswordTextView.setVisibility(View.VISIBLE);
    }


}
