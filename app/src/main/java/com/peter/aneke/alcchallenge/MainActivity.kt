package com.peter.aneke.alcchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title ="AlC 4 Phase 1"


        alcBtn.setOnClickListener {
            startActivity(Intent(this, WebActivity::class.java))
        }


    }
}
