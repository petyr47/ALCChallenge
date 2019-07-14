package com.peter.aneke.alcchallenge

import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.webkit.*
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {
    
    private val url = "https://andela.com/alc/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        title="About ALC"

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val webView= alc_web_view as WebView


        webView.webViewClient=object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(url)
                return true
            }
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler?.proceed()
            }
        }

        webView.settings.javaScriptEnabled=true
        webView.settings.cacheMode= WebSettings.LOAD_CACHE_ELSE_NETWORK


        webView.loadUrl(url)


    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
