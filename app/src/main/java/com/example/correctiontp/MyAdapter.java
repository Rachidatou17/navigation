package com.example.correctiontp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            HomeFragment homeFragment = new HomeFragment();
            return homeFragment;
        } else if (position == 1) {
            SettingsFragment settingsFragment = new SettingsFragment();
            return settingsFragment;
        } else {
            SearchFragment searchFragment =new SearchFragment();
            return searchFragment;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
