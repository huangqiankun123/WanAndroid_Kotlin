package com.qkun.wanandroid_kotlin.ui.home

import android.os.Bundle
import android.view.View
import com.qkun.wanandroid_kotlin.R
import com.qkun.wanandroid_kotlin.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by QKun on 2018/8/28.
 */
class HomeFragment : BaseFragment() {

    companion object {
        fun getInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    override fun layoutId(): Int = R.layout.fragment_home

    override fun isLoaded(): Boolean = false

    override fun initView(mRootView: View?) {
        text.text="首页"
    }


}