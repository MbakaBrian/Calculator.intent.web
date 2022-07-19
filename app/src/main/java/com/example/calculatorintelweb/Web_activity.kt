package com.example.calculatorintelweb

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Web_activity : AppCompatActivity() {

    lateinit var Web_view:WebView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        Web_view=findViewById(R.id.webView)
        web_view()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun web_view(){
        Web_view.webViewClient= WebViewClient()

        Web_view.apply {
            loadUrl("http://www.google.com/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (Web_view.canGoBack())Web_view.goBack()else
        super.onBackPressed()
    }
}