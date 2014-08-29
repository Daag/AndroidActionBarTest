package com.daag.rpg.actionbartest.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.daag.rpg.actionbartest.fragment.CharacterCombatFragment;
import com.daag.rpg.actionbartest.fragment.CharacterInfoFragment;
import com.daag.rpg.actionbartest.fragment.CharacterSpellsFragment;

/**
 * Created by Daag on 8/25/2014.
 */
public class CharacterSheetPagerAdapter extends FragmentStatePagerAdapter {

    private static final int NUM_PAGES = 3;
    private String[] tabTitles = { "Info", "Combat", "Spells" };

    public CharacterSheetPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CharacterInfoFragment();
            case 1:
                return new CharacterCombatFragment();
            case 2:
                return new CharacterSpellsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
