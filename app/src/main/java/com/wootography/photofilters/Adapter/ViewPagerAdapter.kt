package com.wootography.photofilters.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by y.moskalev on 22.08.2018.
 * You can contact me at: y.moskalev@gmail.com
 */
class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentTitleList.add(title)
        fragmentList.add(fragment)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList.get(position)
    }

}