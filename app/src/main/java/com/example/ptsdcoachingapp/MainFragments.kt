package com.example.ptsdcoachingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainFragments : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var bar: androidx.appcompat.widget.Toolbar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragments)

            pager = findViewById(R.id.viewPager)
            tab = findViewById(R.id.tabs)
            bar = findViewById(R.id.toolbar)

            setSupportActionBar(bar)

            //Initializing the ViewPagerAdapter
            val adapter = ViewPagerAdapter(supportFragmentManager)

            //add fragment to the list
            adapter.addFragment(firstFragment(),"This is a hassle,not a horror. ")
            adapter.addFragment(secondFragment(),"I have been through many hard things in my life and survived")
            adapter.addFragment(thirdFragment(),"I can tolerate this.")
            adapter.addFragment(fourthFragment(),"I will survive even if i do not sleep at all tonight.")
            adapter.addFragment(fifthFragment(),"I am right here,right now.")
            adapter.addFragment(sixthFragment(),"When this is over, I'll be glad I did it.")

            //Adding the Adapter to the ViewPager
            pager.adapter = adapter

            //Bind the viewPager with the TabLayout.
            tab.setupWithViewPager(pager)

        }

}


