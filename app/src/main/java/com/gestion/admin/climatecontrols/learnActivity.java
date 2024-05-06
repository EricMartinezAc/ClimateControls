package com.gestion.admin.climatecontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class learnActivity extends AppCompatActivity {

    WebView htmlLearn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        htmlLearn = (WebView)findViewById(R.id.webLearn);
        htmlLearn.getSettings().setJavaScriptEnabled(true);
        htmlLearn.loadUrl("file:///android_asset/learn.html");


    }
}
