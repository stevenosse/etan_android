package com.stevenosse.tan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stevenosse.tan.R
import kotlinx.android.synthetic.main.stop_item.view.*

class FavoriteListAdapter: RecyclerView.Adapter<FavoriteListAdapter.FavoriteListViewHolder>() {
    class FavoriteListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteListViewHolder {
        return FavoriteListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.stop_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FavoriteListViewHolder, position: Int) {
        holder.itemView.apply {
            tvStopName.text = "Mitrie"
        }
    }

    override fun getItemCount(): Int {
        return 2
    }

}