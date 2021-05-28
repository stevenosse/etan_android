package com.stevenosse.tan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.stevenosse.tan.R
import com.stevenosse.tan.viewmodels.StopListViewModel
import kotlinx.android.synthetic.main.stop_item.view.*

class StopListAdapter : RecyclerView.Adapter<StopListAdapter.StopListViewHolder>() {
    class StopListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {  }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StopListAdapter.StopListViewHolder {
        return StopListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.stop_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StopListAdapter.StopListViewHolder, position: Int) {
        holder.itemView.apply {
            tvStopName.text = "Mitrie"
        }
    }

    override fun getItemCount(): Int {
        return 1//StopListViewModel.shared.stopList.count()
    }
}