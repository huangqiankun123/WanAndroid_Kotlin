package com.qkun.wanandroid_kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by QKun on 2018/8/28.
 */
abstract class BaseActivity : AppCompatActivity() {

    protected abstract fun layoutId(): Int

    protected abstract fun initView()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        initView()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}