package com.gestion.admin.climatecontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ProfileActivity extends AppCompatActivity{

    WebView html ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        html = (WebView)this.findViewById(R.id.web);
        html.getSettings().setJavaScriptEnabled(true);
        html.loadUrl("file:///android_asset/index.html");
    }
}
