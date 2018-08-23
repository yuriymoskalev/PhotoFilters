package com.wootography.photofilters.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.wootography.photofilters.R
import com.wootography.photofilters.Interface.FilterListFragmentListener
import com.zomato.photofilters.utils.ThumbnailItem
import kotlinx.android.synthetic.main.thumbnail_list_item.view.*

/**
 * Created by y.moskalev on 22.08.2018.
 * You can contact me at: y.moskalev@gmail.com
 */
class ThumbnailAdapter(private val context: Context,
                       private val thumbnailItemList: List<ThumbnailItem>,
                       private val listener: FilterListFragmentListener) : RecyclerView.Adapter<ThumbnailAdapter.MyViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.thumbnail_list_item, parent, false)
        return MyViewholder(itemView)
    }

    private var selectedIndex = 0


    override fun getItemCount(): Int {
        return thumbnailItemList.size
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        val thumbNailItem = thumbnailItemList[position]
        holder.thumbNail.setImageBitmap(thumbNailItem.image)
        holder.thumbNail.setOnClickListener {
            listener.onFilterSelected(thumbNailItem.filter)
            selectedIndex = position
            notifyDataSetChanged()
        }
    }


    class MyViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var thumbNail: ImageView
        var filterName: TextView

        init {
            thumbNail = itemView.img_thumbnail
            filterName = itemView.txt_filter_name

        }

    }
}