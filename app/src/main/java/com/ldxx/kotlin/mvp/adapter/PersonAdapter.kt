package com.ldxx.kotlin.mvp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ldxx.kotlin.R
import com.ldxx.kotlin.mvp.adapter.PersonAdapter.ViewHolder
import com.ldxx.kotlin.mvp.bean.Person
import kotlinx.android.synthetic.main.item_person.view.*


/**
 * Created by
 * ldxx on 2017/2/20.
 */
class PersonAdapter : RecyclerView.Adapter<ViewHolder>() {
    var list: MutableCollection<Person> = mutableListOf()

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list.elementAt(position))
        holder.itemView.setOnClickListener {
            onItemClick(list.elementAt(position))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false))
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindData(person: Person) {
            itemView.item_name.text = person.name
            itemView.item_age.text = String.format(itemView.context.getString(R.string.str_age_format), person.age)
            itemView.item_img.setImageResource(person.img)
        }
    }

    fun addDatas(person: List<Person>) {
        list.addAll(person)
    }

    var onItemClick = fun(person: Person): Unit {}
}