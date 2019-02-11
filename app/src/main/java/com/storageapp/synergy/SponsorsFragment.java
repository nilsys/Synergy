package com.storageapp.synergy;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SponsorsFragment extends Fragment
{

    CardView fortinet, drunkenmonkey;
    Button button;
    public SponsorsFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sponsors, container, false);

        fortinet = (CardView)view.findViewById(R.id.fortinet);
        drunkenmonkey = (CardView)view.findViewById(R.id.drunkenmonkey);


        fortinet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fortinet.com"));
                startActivity(intent);
            }
        });

        drunkenmonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thedrunkenmonkey.in"));
                startActivity(intent);
            }
        });


        return view;
    }

}
