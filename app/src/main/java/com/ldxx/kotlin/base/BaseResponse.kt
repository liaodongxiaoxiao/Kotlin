package com.ldxx.kotlin.base

/**
 * Created by wangzhuo-neu
 * on 2017/2/27.
 */
data class BaseResponse<T>(var errorNum: Int, var msg: String, var data: T)