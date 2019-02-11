package com.storageapp.synergy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SynergyFragment extends Fragment {


    TextView days,hours,minutes,seconds;

    public SynergyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_synergy, container, false);

        days = (TextView) view.findViewById(R.id.days);
        hours = (TextView) view.findViewById(R.id.hours);
        minutes = (TextView) view.findViewById(R.id.minutes);
        seconds = (TextView) view.findViewById(R.id.seconds);

        return view;
    }

}
