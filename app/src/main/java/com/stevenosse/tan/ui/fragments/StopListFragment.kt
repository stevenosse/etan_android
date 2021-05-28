package com.stevenosse.tan.ui.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.stevenosse.tan.R
import com.stevenosse.tan.adapters.StopListAdapter
import kotlinx.android.synthetic.main.fragment_stop_list.*

class StopListFragment : Fragment() {
    private lateinit var stopListAdapter: StopListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stop_list, container, false)
    }

    override fun onStart() {
        super.onStart()
        initializeStopsListView()
    }

    private fun initializeStopsListView() {
        stopListAdapter = StopListAdapter()

        rvStopList.adapter = stopListAdapter
        rvStopList.layoutManager = LinearLayoutManager(this.context)
    }

    companion object {
        @JvmStatic
        fun newInstance() = StopListFragment()
    }
}