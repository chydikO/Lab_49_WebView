package com.chudnovskiy.lab_49_webview
import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mWebView: WebView? = null

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val mWebView: WebView = findViewById(R.id.web_view)
        val webSettings = mWebView.getSettings()
        webSettings.javaScriptEnabled = true
        mWebView.setWebViewClient(MyWebViewClient())

        // REMOTE RESOURCE
        mWebView.loadUrl("https://censor.net")

        // LOCAL RESOURCE
        // mWebView.loadUrl("file:///android_asset/index.html");
    }

    override fun onBackPressed() {
        if (mWebView!!.canGoBack()) {
            mWebView!!.goBack()
        } else {
            super.onBackPressed()
        }
    }
}