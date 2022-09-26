package com.anil.vidyakuldemo.app.ui.home.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.anil.vidyakuldemo.app.model.StoriesDataModel
import com.anil.vidyakuldemo.app.ui.story.StoryViewFragment


class StoriesPagerAdapter(fragment: Fragment, val dataList: MutableList<StoriesDataModel> = mutableListOf()) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun createFragment(position: Int): Fragment {
        return StoryViewFragment.newInstance(dataList[position])
    }
}