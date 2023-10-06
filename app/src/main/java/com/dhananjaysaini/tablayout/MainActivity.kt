package com.dhananjaysaini.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.dhananjaysaini.tablayout.R
import com.dhananjaysaini.tablayout.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

public class MainActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var bar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        bar = findViewById(R.id.toolbar)


        setSupportActionBar(bar)


        val adapter = ViewPagerAdapter(supportFragmentManager)


        adapter.addFragment(Fragment1(), "Code 1")
        adapter.addFragment(Fragment2(), "Code 2")
        adapter.addFragment(Fragment3(), "Code 3")


        pager.adapter = adapter


        tab.setupWithViewPager(pager)
    }
}
