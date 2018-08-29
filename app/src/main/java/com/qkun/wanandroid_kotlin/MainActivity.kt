package com.qkun.wanandroid_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import com.qkun.wanandroid_kotlin.base.BaseFragment
import com.qkun.wanandroid_kotlin.ui.home.HomeFragment
import com.qkun.wanandroid_kotlin.ui.knowledge.KnowledgeFragment
import com.qkun.wanandroid_kotlin.ui.navigation.NavigationFragment
import com.qkun.wanandroid_kotlin.ui.project.ProjectFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    val mFragments = listOf<BaseFragment>(HomeFragment.getInstance(), KnowledgeFragment.getInstance(),
            NavigationFragment.getInstance(), ProjectFragment.getInstance())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

//        initFragment()
        //设置默认的Item
        setDefaultFragment()
    }


    private fun initFragment() {


    }

    private fun setDefaultFragment() {
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.container, mFragments[0])
        transaction.commit()
    }

    private fun initView() {
        toolbar.run {
            title = getString(R.string.app_name)
            setSupportActionBar(this)
        }

        navigation_bar.apply {
            setMode(BottomNavigationBar.MODE_FIXED)
            setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
            addItem(BottomNavigationItem(R.drawable.ic_home_black_24dp, getString(R.string.home)))
            addItem(BottomNavigationItem(R.drawable.ic_apps_black_24dp, getString(R.string.knowledge_system)))
            addItem(BottomNavigationItem(R.drawable.ic_navigation, getString(R.string.navigation)))
            addItem(BottomNavigationItem(R.drawable.ic_project, getString(R.string.project)))
            setFirstSelectedPosition(0)
            initialise()
        }.apply {
            setTabSelectedListener(object : BottomNavigationBar.OnTabSelectedListener {
                override fun onTabReselected(position: Int) {
                    if (position < mFragments.size) {
                        val fm = supportFragmentManager
                        val ft = fm.beginTransaction()
                        //当前的fragment
                        val from = fm.findFragmentById(R.id.container)
                        //点击即将跳转的fragment
                        val fragment = mFragments[position]
                        if (fragment.isAdded) {
                            // 隐藏当前的fragment，显示下一个
                            ft.hide(from).show(fragment)
                        } else {
                            ft.hide(from).add(R.id.container, fragment)
                            if (fragment.isHidden) {
                                ft.show(fragment)

                            }
                        }
                        ft.commitAllowingStateLoss()
                    }
                }

                override fun onTabUnselected(position: Int) {
                    if (position < mFragments.size) {
                        val fm = supportFragmentManager
                        val ft = fm.beginTransaction()
                        val fragment = mFragments[position]
                        // 隐藏当前的fragment
                        ft.hide(fragment)
                        ft.commitAllowingStateLoss()
                    }
                }

                override fun onTabSelected(position: Int) {

                }

            })
        }

        nav_layout.run {

        }

    }


}














