package com.codingblocks.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager):FragmentPagerAdapter(supportFragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


   val mfragmentlst = ArrayList<Fragment>()


    override fun getCount(): Int {
       return mfragmentlst.size
    }



    override fun getItem(position: Int): Fragment {

        return mfragmentlst[position]
    }
    fun addFragment(fragment:Fragment)
    {
        mfragmentlst.add(fragment)

    }





}