package com.pt.projekti_trete.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

import com.pt.projekti_trete.R;

public class WebView extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getSupportActionBar().hide();


        android.webkit.WebView webView = (android.webkit.WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.google.com");
        webView.setWebViewClient(new WebViewClient());
    }


}
