package com.ldxx.kotlin.base

/**
 * Created by wangzhuo-neu on 2017/2/27.
 */
interface IBaseRequestCompleteCallBack<T> {
    fun requestComplete(t: T?)
    fun requestError(e: Throwable?)
}