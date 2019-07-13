package com.peter.aneke.alcchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {
    
    val url = "https://andela.com/alc"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        title="About ALC"

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        alc_web_view.loadUrl(url)
        alc_web_view.settings.javaScriptEnabled=true
        //alc_web_view.settings.cacheMode= WebSettings.LOAD_CACHE_ELSE_NETWORK


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
