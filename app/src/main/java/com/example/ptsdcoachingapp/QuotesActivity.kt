package com.example.ptsdcoachingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class QuotesActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var bar: androidx.appcompat.widget.Toolbar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)

            pager = findViewById(R.id.viewPager)
            tab = findViewById(R.id.tabs)
            bar = findViewById(R.id.toolbar)

            setSupportActionBar(bar)

            //Initializing the ViewPagerAdapter
            val adapter = ViewPagerAdapter(supportFragmentManager)

            //add fragment to the list
            adapter.addFragment(quote1Fragment(),"Never, never,never,never,never give up ")
            adapter.addFragment(quote2Fragment(),"Although the world is full of suffering, it is full also of overcoming of it.")
            adapter.addFragment(quote3Fragment(),"No feeling is final")
            adapter.addFragment(quote4Fragment(),"Not to laugh, not to lament, not to judge,but to understand.")
            adapter.addFragment(quote5Fragment(),"And the trouble is, if you don't risk anything, you risk even more.")
            adapter.addFragment(quote6Fragment(),"Don't compromise yourself. You are all you've got")

            //Adding the Adapter to the ViewPager
            pager.adapter = adapter

            //Bind the viewPager with the TabLayout.
            tab.setupWithViewPager(pager)

        }
    }
