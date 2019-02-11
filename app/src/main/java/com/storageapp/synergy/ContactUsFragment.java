package com.storageapp.synergy;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;



/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUsFragment extends Fragment
{

    CardView facebook,instagram,emailUs,website;
    LinearLayout linkedin;


    public ContactUsFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {


//        return inflater.inflate(R.layout.fragment_contact_us, container, true);

        View view =  inflater.inflate(R.layout.fragment_contact_us, container, false);
//        container.addView(view);

        facebook = (CardView) view.findViewById(R.id.facebook);
        instagram = (CardView) view.findViewById(R.id.instagram);
        emailUs = (CardView) view.findViewById(R.id.emailUs);
        website = (CardView) view.findViewById(R.id.website);
        linkedin = (LinearLayout) view.findViewById(R.id.linkedin);

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/ujjwal-sinha-b8032514b/"));
                startActivity(intent);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/ieteisf/"));
                startActivity(intent);
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/iete_vit/"));
                startActivity(intent);
            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.synergyietevit.com/"));
                startActivity(intent);
            }
        });
        emailUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:ietevit@vit.ac.in"));
                startActivity(emailIntent);
            }
        });


        return view;

    }


}
