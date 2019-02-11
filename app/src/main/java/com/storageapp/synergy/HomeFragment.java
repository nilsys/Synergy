package com.storageapp.synergy;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {



    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) view.findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.dayFrameLayout,new Day1Fragment());
        fragmentTransaction.commit();
        return view;


    }



    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch(menuItem.getItemId()){
                case R.id.navigation_day1:
                    FragmentTransaction fragmentTransaction1 = getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.dayFrameLayout,new Day1Fragment());
                    fragmentTransaction1.commit();
                    break;
                case R.id.navigation_day2:
                    FragmentTransaction fragmentTransaction2 = getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.dayFrameLayout,new Day2Fragment());
                    fragmentTransaction2.commit();
                    break;
                case R.id.navigation_day3:
                    FragmentTransaction fragmentTransaction3 = getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.dayFrameLayout,new Day3Fragment());
                    fragmentTransaction3.commit();
                    break;

            }
            return true;
        }
    };

}
