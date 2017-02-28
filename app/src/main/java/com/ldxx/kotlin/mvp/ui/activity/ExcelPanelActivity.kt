package com.ldxx.kotlin.mvp.ui.activity

import android.os.Bundle
import com.ldxx.kotlin.R
import com.ldxx.kotlin.base.AppComponent
import com.ldxx.kotlin.base.BaseActivity
import com.ldxx.kotlin.di.component.DaggerExcelPanelComponent
import com.ldxx.kotlin.di.module.ExcelPanelModule
import com.ldxx.kotlin.mvp.adapter.ExcelPanelDemoAdapter
import com.ldxx.kotlin.mvp.bean.Cell
import com.ldxx.kotlin.mvp.bean.ColTitle
import com.ldxx.kotlin.mvp.presenter.IExcelPanelPresenter
import com.ldxx.kotlin.mvp.ui.ExcelPanelView
import kotlinx.android.synthetic.main.activity_excel_panel.*
import javax.inject.Inject

class ExcelPanelActivity : BaseActivity(), ExcelPanelView {
    @Inject
    lateinit var presenter: IExcelPanelPresenter

    override fun setupComponent(appComponent: AppComponent) {
        DaggerExcelPanelComponent.builder().appComponent(appComponent).excelPanelModule(ExcelPanelModule(this)).build().inject(this)
    }

    val adapter: ExcelPanelDemoAdapter by lazy {
        ExcelPanelDemoAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excel_panel)

        result.setAdapter(adapter)

        presenter.loadResult()
    }


    override fun setData(datas: MutableList<MutableList<Cell>>, rowTitles: MutableList<ColTitle>) {
        adapter.setDatas(datas, rowTitles)
    }
}
