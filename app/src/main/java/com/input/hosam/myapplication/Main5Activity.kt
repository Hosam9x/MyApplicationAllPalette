package com.input.hosam.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl("https://stackoverflow.com/questions/45518139/kotlin-android-start-new-activity")
    }
}
