package com.chudnovskiy.lab_49_webview

import android.content.Intent
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient

class MyWebViewClient : WebViewClient()  {
    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        var hostname: String

        // YOUR HOSTNAME
        hostname = "example.com"

        // YOUR HOSTNAME
        hostname = "example.com"

        val uri = Uri.parse(url)
        if (url!!.startsWith("file:") || uri.host != null && uri.host!!.endsWith(hostname)) {
            return false
        }
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        view!!.context.startActivity(intent)
        return true
    }
}