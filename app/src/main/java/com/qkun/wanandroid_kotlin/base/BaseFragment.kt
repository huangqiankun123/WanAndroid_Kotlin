package com.qkun.wanandroid_kotlin.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by QKun on 2018/8/28.
 */
abstract class BaseFragment : Fragment() {

    protected abstract fun layoutId(): Int
    protected abstract fun isLoaded(): Boolean
    protected abstract fun initView(mRootView: View?)


    //视图是否已经初始化完毕
    private var isViewReady: Boolean = false
    //fragment是否处于可见状态
    private var isFragmentVisible: Boolean = false
    //是否已经初始化加载过
    private var isLoaded: Boolean = false

    private var mRootView: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mRootView = inflater?.inflate(layoutId(), null)
        return mRootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isViewReady = true
        if (!isLoaded() || isFragmentVisible) {
            init()
        }
    }

    private fun init() {
        if (!isLoaded) {
            isLoaded = true
            initView(mRootView)
        }
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        isFragmentVisible = isVisibleToUser
        if (isLoaded() && isViewReady && isFragmentVisible) {
            init()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        isViewReady = false
        isLoaded = false
    }

}