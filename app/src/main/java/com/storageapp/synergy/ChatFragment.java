package com.storageapp.synergy;


import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class ChatFragment extends Fragment {

    public WebView w;
    private ProgressBar progressBar;

    public ChatFragment()
    {

        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_chat, container, false);

        w = (WebView)view.findViewById(R.id.wi);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        w.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
            }
        });
        WebSettings ws = w.getSettings();
        ws.setJavaScriptEnabled(true);
        w.loadUrl("https://tawk.to/chat/5c3b502e494cc76b7872d77a/default");
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        return view;
    }

}

