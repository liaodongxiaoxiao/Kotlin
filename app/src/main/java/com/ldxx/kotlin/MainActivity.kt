package com.ldxx.kotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import com.ldxx.kotlin.adapter.PersonAdapter
import com.ldxx.kotlin.bean.Person
import com.ldxx.kotlin.bean.PersonList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate.setOnClickListener {
            calculate()
        }

        //var personList: List<Person> = emptyList()
        var list:MutableCollection<Person> = mutableListOf<Person>()
        val names = arrayOf("Jim", "Tom", "Lin Tao","Lucy","Han Meimei" )
        val ages: IntArray = intArrayOf( 12,14,20,15,18 )
        val images: IntArray = intArrayOf(R.mipmap.p1,R.mipmap.p2,R.mipmap.p3,R.mipmap.p4,R.mipmap.p5 )
        for (i in 0..4) {
            //personList.plus()
            list.add(Person(names[i], ages[i], images[i]))
        }
        val adapter:PersonAdapter = PersonAdapter()

        person_list.layoutManager = LinearLayoutManager(this)
        person_list.adapter = adapter

        adapter.addDatas(list.toList())
        adapter.notifyDataSetChanged()
        Log.e("TAG","size:"+adapter.itemCount)
    }


    fun sum(a: Int, b: Int): String {
        return "$a + $b = ${a + b}"
    }

    fun calculate() {
        val a: String = text_a.text.toString()
        val b: String = text_b.text.toString()
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b)) {
            toast("a 和 b 是必填项")
            text_result.text = ""
        } else
            text_result.text = sum(a.toInt(), b.toInt())
    }

    fun Context.toast(message: CharSequence) =
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}


