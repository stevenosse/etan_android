package com.stevenosse.tan.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.stevenosse.tan.R
import com.stevenosse.tan.adapters.FavoriteListAdapter
import kotlinx.android.synthetic.main.fragment_favorite_list.*

class FavoriteListFragment : Fragment() {
    private lateinit var favoriteListAdapter: FavoriteListAdapter

    override fun onStart() {
        super.onStart()

        initializeFavoriteList()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = FavoriteListFragment()
    }

    private fun initializeFavoriteList() {
        favoriteListAdapter = FavoriteListAdapter()
        rvFavoriteList.adapter = favoriteListAdapter
        rvFavoriteList.layoutManager = LinearLayoutManager(this.context)
    }
}