package com.chudnovskiy.lab_49_webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val webView: WebView = findViewById(R.id.web_view)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("http:\\google.com")
    }
}