package com.example.webviewtest0516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editUrl : EditText
    lateinit var btnGo : Button
    lateinit var btnPrev : Button
    lateinit var webV : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editUrl = findViewById(R.id.editUrl)
        btnGo = findViewById(R.id.btnGo)
        btnPrev = findViewById(R.id.btnPrev)
        webV = findViewById(R.id.webV)

        webV.webViewClient = PolyWebViewClient()

        var webSet = webV.settings
        webSet.builtInZoomControls = true
        webSet.javaScriptEnabled = true

        btnGo.setOnClickListener {
            webV.loadUrl(editUrl.text.toString())
        }
    }

    class PolyWebViewClient : WebViewClient(){

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {

            return super.shouldOverrideUrlLoading(view, url)
        }
    }


}