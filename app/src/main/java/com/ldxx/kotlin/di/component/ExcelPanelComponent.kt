package com.ldxx.kotlin.di.component

import com.ldxx.kotlin.base.AppComponent
import com.ldxx.kotlin.di.module.ExcelPanelModule
import com.ldxx.kotlin.di.scope.ActivityScope
import com.ldxx.kotlin.mvp.model.IExcelPanelModel
import com.ldxx.kotlin.mvp.presenter.IExcelPanelPresenter
import com.ldxx.kotlin.mvp.ui.activity.ExcelPanelActivity
import dagger.Component

/**
 * Created by wangzhuo-neu
 * on 2017/2/27.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ExcelPanelModule::class))
interface ExcelPanelComponent {
    fun inject(activity: ExcelPanelActivity)

    fun getExcelPanelModel(): IExcelPanelModel

    fun getExcelPanelPresenter(): IExcelPanelPresenter
}