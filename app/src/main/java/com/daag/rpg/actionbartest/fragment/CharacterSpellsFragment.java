package com.daag.rpg.actionbartest.fragment;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daag.rpg.actionbartest.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class CharacterSpellsFragment extends Fragment {


    public CharacterSpellsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_spells, container, false);
    }


}
