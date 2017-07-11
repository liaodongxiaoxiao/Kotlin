package com.ldxx.kotlin.java

/**
 * Created by ldxx on 2017/7/11.
 */
class DataC(var list: MutableList<Person>) {
    constructor() : this(mutableListOf())
}

fun main(args:Array<String>){
    //MutableList<>
    var dc1 = DataC()
    print(dc1.list)
}