package com.peter.aneke.alcchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.peter.aneke.alcchallenge.databinding.ActivityProfileActvityBinding

class ProfileActvity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileActvityBinding
    private val viewModel by lazy { ViewModelProviders.of(this).get(ProfileViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_actvity)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile_actvity)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel


        title = "My Profile"

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
