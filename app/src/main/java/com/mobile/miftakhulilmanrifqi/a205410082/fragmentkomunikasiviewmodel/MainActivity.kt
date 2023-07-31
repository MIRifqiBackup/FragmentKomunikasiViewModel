package com.mobile.miftakhulilmanrifqi.a205410082.fragmentkomunikasiviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.miftakhulilmanrifqi.a205410082.fragmentkomunikasiviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager.adapter = ViewPagerAdapter(
            this, supportFragmentManager)
        binding.tabs.setupWithViewPager(binding.viewPager)
        binding.viewPager.setCurrentItem(1)
    }
}
