package com.ldxx.kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by wangzhuo-neu
 * on 2017/2/22.
 */
 abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(application is KotlinApplication){
            setupComponent((application as KotlinApplication).appComponent)
        }

    }

    protected abstract fun setupComponent(appComponent: AppComponent)
}