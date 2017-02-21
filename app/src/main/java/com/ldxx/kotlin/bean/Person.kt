package com.ldxx.kotlin.bean

import com.ldxx.kotlin.R

/**
 * Created by ldxx
 * on 2017/2/21.
 */
data class Person constructor(val name: String,val age: Int,val img: Int){
    constructor( name:String, age:Int): this(name,age, R.mipmap.p1)
}