package com.example.viewpager2wthtablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var viewPager2Adapter: ViewPager2Adapter
    lateinit var viewPager2: ViewPager2
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curImage = listOf(
            R.drawable.fernandes,
            R.drawable.greenwood,
            R.drawable.greenwood2,
            R.drawable.ozil2,
            R.drawable.paugba,
            R.drawable.ronaldo,
            R.drawable.ronaldo2
        )

        viewPager2 = findViewById(R.id.viewPager2)
        tabLayout =findViewById(R.id.tab_layout)
        viewPager2Adapter = ViewPager2Adapter(curImage)
        viewPager2.adapter = viewPager2Adapter

        TabLayoutMediator(tabLayout,viewPager2){ tab, position ->
            tab.text = "Tab ${position + 1}"

        }.attach()

        //  to add listener to each tab we do this
        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {

                    Toast.makeText(this@MainActivity,"Selected ${tab?.text}",Toast.LENGTH_SHORT).show()

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

                    Toast.makeText(this@MainActivity,"Unselected ${tab?.text}",Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

                    Toast.makeText(this@MainActivity,"Reselected ${tab?.text}",Toast.LENGTH_SHORT).show()
            }
        })
    }
}