package com.ldxx.kotlin.mvp.presenter.impl

import com.ldxx.kotlin.base.IBaseRequestCompleteCallBack
import com.ldxx.kotlin.base.ListBase
import com.ldxx.kotlin.mvp.bean.Cell
import com.ldxx.kotlin.mvp.bean.ColTitle
import com.ldxx.kotlin.mvp.bean.LotteryResult
import com.ldxx.kotlin.mvp.model.IExcelPanelModel
import com.ldxx.kotlin.mvp.presenter.IExcelPanelPresenter
import com.ldxx.kotlin.mvp.ui.ExcelPanelView

/**
 * Created by wangzhuo-neu
 * on 2017/2/27.
 */
class ExcelPanelPresenterImpl(var view: ExcelPanelView, var model: IExcelPanelModel) : IExcelPanelPresenter {

    override fun loadResult() {

        model.getResult(object : IBaseRequestCompleteCallBack<ListBase<LotteryResult>> {
            override fun requestComplete(t: ListBase<LotteryResult>?) {
                makeData(t!!.list)
            }

            override fun requestError(e: Throwable?) {

            }
        })
    }

    fun makeData(data: List<LotteryResult>) {
        val rowTitle: MutableList<ColTitle> = mutableListOf()
        val cellData: MutableList<MutableList<Cell>> = mutableListOf()
        var key: String
        var rowData: MutableList<Cell>

        for ((issue, red_balls, blue_ball) in data) {
            rowTitle.add(ColTitle(issue, 1))
            rowData = mutableListOf()
            cellData.add(rowData)
            for (j in 1..49) {
                if (j < 34) {

                    key = when {
                        j < 10 -> "0" + j
                        else -> j.toString()
                    }
                    if (red_balls.contains(key)) {
                        rowData.add(Cell(1, key, true))
                    } else {
                        rowData.add(Cell(1, key, false))
                    }
                } else {


                    key = when (j - 33) {
                        in 1..9 -> "0" + (j - 33)
                        else -> (j - 33).toString()
                    }
                    if (blue_ball.contains(key)) {
                        rowData.add(Cell(2, key, true))
                    } else {
                        rowData.add(Cell(2, key, false))
                    }
                }

            }

        }
        view.setData(cellData, rowTitle)
    }

}