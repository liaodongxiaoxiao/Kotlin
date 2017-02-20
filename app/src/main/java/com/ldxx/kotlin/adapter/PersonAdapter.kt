package com.ldxx.kotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.ldxx.kotlin.adapter.PersonAdapter.ViewHolder


/**
 * Created by wangzhuo-neu on 2017/2/20.
 */
class PersonAdapter : RecyclerView.Adapter<ViewHolder>() {
    override fun getItemCount(): Int {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(view:View) : RecyclerView.ViewHolder(view) {

    }
}