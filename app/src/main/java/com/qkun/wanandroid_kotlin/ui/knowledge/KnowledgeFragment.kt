package com.qkun.wanandroid_kotlin.ui.knowledge

import android.view.View
import com.qkun.wanandroid_kotlin.R
import com.qkun.wanandroid_kotlin.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by QKun on 2018/8/29.
 */
class KnowledgeFragment : BaseFragment() {

    companion object {
        fun getInstance(): KnowledgeFragment {
            return KnowledgeFragment()
        }
    }

    override fun layoutId(): Int {
        return R.layout.fragment_home
    }

    override fun isLoaded(): Boolean {
        return false
    }

    override fun initView(mRootView: View?) {
       text.text="学习体系"
    }

}