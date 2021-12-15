package com.programmersbox.webviewtest

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webview)

        WebView.setWebContentsDebuggingEnabled(BuildConfig.DEBUG)

        // Enable Javascript
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.allowFileAccessFromFileURLs = true
        webSettings.defaultTextEncodingName = "utf-8"
        webSettings.allowFileAccess = true
        webSettings.allowContentAccess = true
        webSettings.domStorageEnabled = true

        val file = "android_asset/game/FluffyBreeder.html"

        val indexFile = File(file)
        val projectMainPageUri = Uri.fromFile(indexFile)

        webView.loadUrl(projectMainPageUri.toString())
    }
}