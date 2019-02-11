package com.storageapp.synergy;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ramotion.foldingcell.FoldingCell;

public class EventsFragment extends Fragment {

    Button mlRegister,csRegister,roboRegister,arRegister,codeRegister,paperRegsiter;

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);

        final FoldingCell machineLearningFoldingCell = view.findViewById(R.id.machineLearningFoldingCell);
        machineLearningFoldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                machineLearningFoldingCell.toggle(false);
            }
        });

        final FoldingCell cyberSecurityFoldingCell = view.findViewById(R.id.cyberSecurityFoldingCell);
        cyberSecurityFoldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cyberSecurityFoldingCell.toggle(false);
            }
        });

        final FoldingCell roboticsFoldingCell = view.findViewById(R.id.roboticsFoldingCell);
        roboticsFoldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roboticsFoldingCell.toggle(false);
            }
        });

        final FoldingCell ar = view.findViewById(R.id.arFoldingCell);
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ar.toggle(false);
            }
        });

        final FoldingCell codeFoldingCell = view.findViewById(R.id.codeOlympiaFoldingCell);
        codeFoldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codeFoldingCell.toggle(false);
            }
        });

        final FoldingCell paperFoldingCell = view.findViewById(R.id.paperFoldingCell);
        paperFoldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paperFoldingCell.toggle(false);
            }
        });

        mlRegister = (Button) view.findViewById(R.id.machineLearningRegister);
        csRegister = (Button) view.findViewById(R.id.cyberSecurityRegister);
        roboRegister = (Button) view.findViewById(R.id.roboticsRegister);
        arRegister = (Button) view.findViewById(R.id.arRegister);
        codeRegister = (Button) view.findViewById(R.id.codeOlympiaRegister);
        paperRegsiter = (Button) view.findViewById(R.id.paperRegister);

        mlRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://info.vit.ac.in/Events-VIT/synergy-2019/apply.asp"));
                startActivity(intent);
            }
        });
        csRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://info.vit.ac.in/Events-VIT/synergy-2019/apply.asp"));
                startActivity(intent);
            }
        });
        roboRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://info.vit.ac.in/Events-VIT/synergy-2019/apply.asp"));
                startActivity(intent);
            }
        });
        arRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://info.vit.ac.in/Events-VIT/synergy-2019/apply.asp"));
                startActivity(intent);
            }
        });
        codeRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://info.vit.ac.in/Events-VIT/synergy-2019/apply.asp"));
                startActivity(intent);
            }
        });
        paperRegsiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://info.vit.ac.in/Events-VIT/synergy-2019/apply.asp"));
                startActivity(intent);
            }
        });




        return view;


    }


}
