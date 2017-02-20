package com.ldxx.kotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate.setOnClickListener {
            calculate()
        }
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


