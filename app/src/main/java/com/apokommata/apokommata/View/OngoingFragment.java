package com.apokommata.apokommata.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apokommata.apokommata.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class OngoingFragment extends Fragment {
    public static final String ONGOING_ARG = "ONGOING_ARG";

    public static OngoingFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ONGOING_ARG, page);
        OngoingFragment fragment = new OngoingFragment();
        fragment.setArguments(args);
        return fragment;
    }


    public OngoingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ongoing, container, false);
    }

}
