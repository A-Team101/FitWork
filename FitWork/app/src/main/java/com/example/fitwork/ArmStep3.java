package com.example.fitwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ArmStep3 extends AppCompatActivity {
    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_step3);

        webView1 = findViewById(R.id.agif);

        WebSettings webSettings1 = webView1.getSettings();
        webSettings1.setJavaScriptEnabled(true);
        String file = "file:android_asset/declinepush.gif";
        webView1.loadUrl(file);
    }
}