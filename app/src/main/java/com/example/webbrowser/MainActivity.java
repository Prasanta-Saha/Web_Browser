package com.example.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView world;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        world=(WebView)findViewById(R.id.world_web);
        WebSettings webSettings=world.getSettings();

        world.loadUrl("https://www.google.com");
        webSettings.setJavaScriptEnabled(true);
        world.setWebViewClient(new WebViewClient());
    }
}
