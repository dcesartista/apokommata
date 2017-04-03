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
public class TimelineFragment extends Fragment {
    public static final String TIMELINE_ARG = "TIMELINE_ARG";

    public static TimelineFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(TIMELINE_ARG, page);
        TimelineFragment fragment = new TimelineFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public TimelineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_timeline, container, false);
    }

}
