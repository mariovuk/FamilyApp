package com.example.mariovuksic.familyapp.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mariovuksic.familyapp.R;

/**
 * Created by mariovuksic on 2017-10-28.
 */

public class NotesFragment extends Fragment {

    private static final String TAG = "NotesFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notes, container, false);

        return view;
    }
}
