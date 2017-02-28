package com.ldxx.kotlin.base

import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by wangzhuo-neu on 2017/2/22.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, NetWorkModule::class))
interface AppComponent {
    fun inject(app: KotlinApplication)

    fun getRetrofit(): Retrofit
}