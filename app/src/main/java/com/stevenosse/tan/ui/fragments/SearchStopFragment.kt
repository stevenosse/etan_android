package com.stevenosse.tan.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.stevenosse.tan.R
import com.stevenosse.tan.adapters.StopSearchResultAdapter
import kotlinx.android.synthetic.main.fragment_search_stop.*

class SearchStopFragment : Fragment() {
    lateinit var stopSearchResultAdapter: StopSearchResultAdapter

    override fun onStart() {
        super.onStart()
        this.initializeResultList()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_stop, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = SearchStopFragment()
    }

    private fun initializeResultList() {
        stopSearchResultAdapter = StopSearchResultAdapter()
        rvSearchResultList.adapter = stopSearchResultAdapter
        rvSearchResultList.layoutManager = LinearLayoutManager(this.context)
    }
}