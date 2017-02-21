package com.ldxx.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils
import com.ldxx.kotlin.adapter.PersonAdapter
import com.ldxx.kotlin.bean.Person
import com.ldxx.kotlin.extensions.hideKeyboard
import com.ldxx.kotlin.extensions.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate.setOnClickListener {
            calculate()
        }

        //var personList: List<Person> = emptyList()
        val list: MutableCollection<Person> = initData()
        val adapter: PersonAdapter = PersonAdapter()
        adapter.onItemClick = fun(person: Person) {
            toast(person.name + " clicked")
            val intent: Intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("person", person)
            startActivity(intent)
        }

        person_list.layoutManager = LinearLayoutManager(this)
        person_list.adapter = adapter

        adapter.addDatas(list.toList())
        adapter.notifyDataSetChanged()
    }

    private fun initData(): MutableCollection<Person> {
        val list: MutableCollection<Person> = mutableListOf()
        val names = arrayOf("Jim", "Tom", "Lin Tao", "Lucy", "Han Meimei")
        val ages: IntArray = intArrayOf(12, 14, 20, 15, 18)
        val images: IntArray = intArrayOf(R.mipmap.p1, R.mipmap.p2, R.mipmap.p3, R.mipmap.p4, R.mipmap.p5)
        (0..4).mapTo(list) { Person(names[it], ages[it], images[it]) }
        return list
    }


    fun sum(a: Int, b: Int): String {
        return "$a + $b = ${a + b}"
    }

    fun calculate() {
        hideKeyboard(text_a)
        val a: String = text_a.text.toString()
        val b: String = text_b.text.toString()
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b)) {
            toast("a 和 b 是必填项")
            text_result.text = ""
        } else
            text_result.text = sum(a.toInt(), b.toInt())
    }


}


