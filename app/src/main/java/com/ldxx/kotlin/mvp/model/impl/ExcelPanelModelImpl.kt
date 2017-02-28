package com.ldxx.kotlin.mvp.model.impl

import com.ldxx.kotlin.api.KotlinAPI
import com.ldxx.kotlin.base.BaseResponse
import com.ldxx.kotlin.base.IBaseRequestCompleteCallBack
import com.ldxx.kotlin.base.ListBase
import com.ldxx.kotlin.mvp.bean.LotteryResult
import com.ldxx.kotlin.mvp.model.IExcelPanelModel
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by wangzhuo-neu
 * on 2017/2/27.
 */
class ExcelPanelModelImpl(var api: KotlinAPI) : IExcelPanelModel {

    override fun getResult(callBack: IBaseRequestCompleteCallBack<ListBase<LotteryResult>>) {
        var s = object : Subscriber<BaseResponse<ListBase<LotteryResult>>>() {
            override fun onCompleted() {

            }

            override fun onError(e: Throwable?) {
                callBack.requestError(e)
            }

            override fun onNext(t: BaseResponse<ListBase<LotteryResult>>?) {
                callBack.requestComplete(t?.data)
            }
        }
        api.getRecentlyResult(30).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s)
    }

}