package com.qkun.wanandroid_kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(){

    val mFragments = listOf<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        initFragment()
        //设置默认的Item
        setDefaultFragment()
    }



    private fun initFragment() {

    }

    private fun setDefaultFragment() {
    }

    private fun initView() {
        toolbar.run {
            title = getString(R.string.app_name)
            setSupportActionBar(this)
        }

        navigation_bar.apply {
            setMode(BottomNavigationBar.MODE_FIXED)
            setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
            addItem(BottomNavigationItem(R.drawable.ic_home_black_24dp,getString(R.string.home)))
            addItem(BottomNavigationItem(R.drawable.ic_home_black_24dp,getString(R.string.home)))
            addItem(BottomNavigationItem(R.drawable.ic_home_black_24dp,getString(R.string.home)))
            addItem(BottomNavigationItem(R.drawable.ic_home_black_24dp,getString(R.string.home)))
            setFirstSelectedPosition(0)
            initialise()
        }.apply {
            setTabSelectedListener(object :BottomNavigationBar.OnTabSelectedListener{
                override fun onTabReselected(position: Int) {

                }

                override fun onTabUnselected(position: Int) {

                }

                override fun onTabSelected(position: Int) {

                }

            })
        }

    }








}














