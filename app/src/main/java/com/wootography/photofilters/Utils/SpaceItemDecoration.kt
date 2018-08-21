package com.wootography.photofilters.Utils

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by y.moskalev on 11.08.2018.
 * You can contact me at: y.moskalev@gmail.com
 */
class SpaceItemDecoration(private val space: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        if (parent!!.getChildAdapterPosition(view) == state!!.itemCount - 1) {
            outRect!!.left = space
            outRect!!.right = 0
        } else {
            outRect!!.left = 0
            outRect!!.right = space
        }

    }
}