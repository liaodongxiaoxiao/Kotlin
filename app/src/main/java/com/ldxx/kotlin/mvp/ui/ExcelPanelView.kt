package com.ldxx.kotlin.mvp.ui

import com.ldxx.kotlin.mvp.bean.Cell
import com.ldxx.kotlin.mvp.bean.ColTitle


/**
 * Created by wangzhuo-neu
 * on 2017/2/27.
 */
interface ExcelPanelView {
    fun setData(datas: MutableList<MutableList<Cell>>, rowTitles: MutableList<ColTitle>)
}