package com.ldxx.kotlin.api

import com.ldxx.kotlin.base.BaseResponse
import com.ldxx.kotlin.base.ListBase
import com.ldxx.kotlin.mvp.bean.LotteryResult
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by wangzhuo-neu
 * on 2017/2/24.
 */
interface KotlinAPI {
    @GET("/result/getRecentlyResult/{num}")
    fun getRecentlyResult(@Path("num") num: Int): Observable<BaseResponse<ListBase<LotteryResult>>>

}