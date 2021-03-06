package com.testapp.saschamelcher.testlogin.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testapp.saschamelcher.testlogin.R;

/**
 * Created by saschamelcher on 06/08/15.
 */
public class LeaderboardFragment extends Fragment {

    public static final String TAG = "leaderboard";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Leaderboard");
        return inflater.inflate(R.layout.fragment_leaderboard, container, false);
    }

}
