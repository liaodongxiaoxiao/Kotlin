package com.ldxx.kotlin.di.module

import com.ldxx.kotlin.api.KotlinAPI
import com.ldxx.kotlin.mvp.model.IExcelPanelModel
import com.ldxx.kotlin.mvp.model.impl.ExcelPanelModelImpl
import com.ldxx.kotlin.mvp.presenter.IExcelPanelPresenter
import com.ldxx.kotlin.mvp.presenter.impl.ExcelPanelPresenterImpl
import com.ldxx.kotlin.mvp.ui.ExcelPanelView
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by wangzhuo-neu
 * on 2017/2/27.
 */
@Module
class ExcelPanelModule(var view: ExcelPanelView) {

    @Provides
    fun provideExcelPanelView(): ExcelPanelView {
        return this.view
    }

    @Provides
    fun provideExcelPanelPresenter(model: IExcelPanelModel): IExcelPanelPresenter {
        return ExcelPanelPresenterImpl(view, model)
    }

    @Provides
    fun provideExcelPanelModel(api: KotlinAPI): IExcelPanelModel {
        return ExcelPanelModelImpl(api)
    }

    @Provides
    fun provideKotlinApi(retrofit: Retrofit): KotlinAPI {
        return retrofit.create(KotlinAPI::class.java)
    }
}