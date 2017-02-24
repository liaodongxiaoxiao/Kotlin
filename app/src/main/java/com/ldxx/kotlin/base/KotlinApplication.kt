package com.ldxx.kotlin.base

import android.app.Application

/**
 * Created by wangzhuo-neu on 2017/2/22.
 */
class KotlinApplication : Application(){
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = createAppComponent()
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .netWorkModule(NetWorkModule())
                .appModule(AppModule(this)).build()
    }

}