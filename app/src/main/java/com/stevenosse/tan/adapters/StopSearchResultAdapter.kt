package com.stevenosse.tan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stevenosse.tan.R
import kotlinx.android.synthetic.main.stop_item.view.*

class StopSearchResultAdapter: RecyclerView.Adapter<StopSearchResultAdapter.StopSearchResultViewHolder>() {
    class StopSearchResultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StopSearchResultViewHolder {
        return StopSearchResultViewHolder(
          LayoutInflater.from(parent.context).inflate(R.layout.stop_item, parent, false)
        );
    }

    override fun onBindViewHolder(holder: StopSearchResultViewHolder, position: Int) {
        holder.itemView.apply {
            tvStopName.text = "Toutes aides"
        }
    }

    override fun getItemCount(): Int {
        return 1;
    }
}