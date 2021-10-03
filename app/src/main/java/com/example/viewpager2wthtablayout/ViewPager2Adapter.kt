package com.example.viewpager2wthtablayout

import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class ViewPager2Adapter(val images: List<Int>): RecyclerView.Adapter<ViewPager2Adapter.ViewPagerViewHolder>() {


    inner class ViewPagerViewHolder(view: View):RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.ivImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.view_pager_layout, parent, false)
        return ViewPagerViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.image.setImageResource(images[position])

    }

    override fun getItemCount(): Int {
        return images.size
    }
}