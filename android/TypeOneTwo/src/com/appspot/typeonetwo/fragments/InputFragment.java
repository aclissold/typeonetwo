package com.appspot.typeonetwo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.appspot.typeonetwo.R;

public class InputFragment extends Fragment {

    public InputFragment() { }

    public static InputFragment newInstance() {
        InputFragment inputFragment = new InputFragment();

        return inputFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_input, container, false);

        return v;
    }
}