package com.ldxx.kotlin.mvp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.zhouchaoyuan.excelpanel.BaseExcelPanelAdapter
import com.ldxx.kotlin.R
import com.ldxx.kotlin.extensions.getColorByResource
import com.ldxx.kotlin.mvp.bean.Cell
import com.ldxx.kotlin.mvp.bean.ColTitle
import kotlinx.android.synthetic.main.item_e_p_coltitle.view.*

/**
 * Created by wangzhuo-neu
 * on 2017/2/27.
 */
class ExcelPanelDemoAdapter(var context: Context) : BaseExcelPanelAdapter<ColTitle, ColTitle, Cell>(context) {
    val colTitle: MutableList<ColTitle> = mutableListOf()
    var data: MutableList<MutableList<Cell>> = mutableListOf()
    var inflater: LayoutInflater = LayoutInflater.from(context)

    var rowTitle: MutableList<ColTitle> = mutableListOf()

    init {
        var key: String
        (1..33).forEach { i ->
            key = when {
                i < 10 -> "0" + i
                else -> i.toString()
            }
            colTitle.add(ColTitle(key, 1))
        }
        (1..16).forEach { i ->
            when {
                i < 10 -> key = "0" + i
                else -> key = i.toString()
            }
            colTitle.add(ColTitle(key, 2))
        }
    }

    override fun onCreateTopViewHolder(parent: ViewGroup, viewType: Int): ColTitleViewHolder {
        return ColTitleViewHolder(inflater.inflate(R.layout.item_top_title, parent, false))
    }

    override fun onBindCellViewHolder(holder: RecyclerView.ViewHolder, verticalPosition: Int, horizontalPosition: Int) {
        var cell: Cell = getMajorItem(verticalPosition, horizontalPosition)
        if (holder is CellViewHolder) {
            holder.bindData(cell)
        }
    }

    override fun onBindTopViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ColTitleViewHolder) {
            holder.bindData(colTitle [position])
        }
    }

    override fun onCreateTopLeftView(): View {
        return inflater.inflate(R.layout.title_view, null);
    }

    override fun onBindLeftViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is RowTitleViewHolder) {
            holder.bindData(rowTitle[position])
        }
    }

    override fun onCreateCellViewHolder(parent: ViewGroup, viewType: Int): CellViewHolder {
        return CellViewHolder(inflater.inflate(R.layout.item_e_p_title, parent, false))
    }

    override fun onCreateLeftViewHolder(parent: ViewGroup, viewType: Int): RowTitleViewHolder {
        return RowTitleViewHolder(inflater.inflate(R.layout.item_e_p_coltitle, parent, false))
    }

    fun setDatas(datas: MutableList<MutableList<Cell>>, rowTitles: MutableList<ColTitle>) {
        data.addAll(datas)
        rowTitle.addAll(rowTitles)
        setAllData(rowTitle, colTitle, data)
    }

    class ColTitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(colTitle: ColTitle) {
            itemView.col_title.text = colTitle.title
            if (colTitle.type == 1) {
                itemView.col_title.setTextColor(itemView.context.getColorByResource(R.color.k_red))
            } else {
                itemView.col_title.setTextColor(itemView.context.getColorByResource(R.color.k_blue))
            }
        }
    }

    class RowTitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(colTitle: ColTitle) {
            itemView.col_title.text = colTitle.title
        }
    }

    class CellViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(result: Cell) {

            itemView.col_title.text = result.value
            //itemView.setBackgroundColor(Color.parseColor("#556677"))
            if (result.status == 1) {
                when (result.value.toInt()) {
                    in 1..11 -> itemView.col_title.setBackgroundColor(R.color.red_one)
                    in 12..22 -> itemView.col_title.setBackgroundColor(R.color.red_two)
                    else -> itemView.col_title.setBackgroundColor(R.color.red_three)
                }
                if (result.selected) {
                    itemView.col_title.setTextColor(itemView.context.getColorByResource(R.color.k_red))
                } else {
                    itemView.col_title.setTextColor(itemView.context.getColorByResource(R.color.k_red_normal))
                }
            } else {
                if (result.value.toInt() < 9) {
                    itemView.col_title.setBackgroundColor(R.color.blue_one)
                } else {
                    itemView.col_title.setBackgroundColor(R.color.blue_two)
                }
                if (result.selected) {
                    itemView.col_title.setTextColor(itemView.context.getColorByResource(R.color.k_blue))
                } else {
                    itemView.col_title.setTextColor(itemView.context.getColorByResource(R.color.k_blue_normal))
                }

            }
        }
    }
}