package com.ldxx.kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}