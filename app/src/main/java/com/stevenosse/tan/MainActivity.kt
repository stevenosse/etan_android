package com.stevenosse.tan

import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.stevenosse.tan.ui.fragments.FavoriteListFragment
import com.stevenosse.tan.ui.fragments.SearchStopFragment
import com.stevenosse.tan.ui.fragments.StopListFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var previousFragment: Fragment? = null
    private lateinit var selectedFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFragment = StopListFragment.newInstance()

        this.updateActiveFragment()
        initializeBottomNavigationBar()
        initializeSearchButtonListener()
    }

    fun initializeBottomNavigationBar() {
        bottomNavigationView.background = null
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.bbHomeItem -> selectedFragment = StopListFragment.newInstance()
                R.id.bbFavItem -> selectedFragment = FavoriteListFragment.newInstance()
            }

            this.updateActiveFragment()
            true
        }
    }

    fun initializeSearchButtonListener() {
        // TODO: change search icon content
        fabSearch.setOnClickListener {
            if (previousFragment == null) {
                previousFragment = selectedFragment
                selectedFragment = SearchStopFragment.newInstance()

                fabSearch.setImageResource(R.drawable.ic_close_icon)
            } else {
                selectedFragment = previousFragment as Fragment
                previousFragment = null

                fabSearch.setImageResource(R.drawable.ic_search_icon)
            }
            updateActiveFragment()
        }
    }

    fun updateActiveFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.flMainContent, selectedFragment).commit()
    }
}