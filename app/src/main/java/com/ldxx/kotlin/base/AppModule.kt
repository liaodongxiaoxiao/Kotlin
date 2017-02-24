package com.ldxx.kotlin.base

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by wangzhuo-neu on 2017/2/22.
 */
@Module
class AppModule(private val application: Application) {

    @Provides @Singleton
    fun provideContext(): Context {
        return application
    }
}