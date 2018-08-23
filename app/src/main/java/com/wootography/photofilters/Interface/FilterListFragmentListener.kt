package com.wootography.photofilters.Interface

import com.zomato.photofilters.imageprocessors.Filter

/**
 * Created by y.moskalev on 22.08.2018.
 * You can contact me at: y.moskalev@gmail.com
 */
interface FilterListFragmentListener {
    fun onFilterSelected(filter:Filter)
}