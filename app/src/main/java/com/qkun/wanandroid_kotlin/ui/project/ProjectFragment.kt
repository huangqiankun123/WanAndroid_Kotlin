package com.qkun.wanandroid_kotlin.ui.project

import android.os.Bundle
import android.view.View
import com.qkun.wanandroid_kotlin.R
import com.qkun.wanandroid_kotlin.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by QKun on 2018/8/29.
 */
class ProjectFragment : BaseFragment() {

    companion object {
        fun getInstance(): ProjectFragment {
            return ProjectFragment()
        }
    }

    override fun layoutId(): Int {
        return R.layout.fragment_home
    }

    override fun isLoaded(): Boolean {
        return false
    }

    override fun initView(mRootView: View?) {
        text.text="项目"
    }

}