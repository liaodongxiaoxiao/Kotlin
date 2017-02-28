package com.ldxx.kotlin.mvp.model

import com.ldxx.kotlin.base.IBaseRequestCompleteCallBack
import com.ldxx.kotlin.base.ListBase
import com.ldxx.kotlin.mvp.bean.LotteryResult

/**
 * Created by wangzhuo-neu on 2017/2/27.
 */
interface IExcelPanelModel {
    fun getResult(callBack: IBaseRequestCompleteCallBack<ListBase<LotteryResult>>)
}