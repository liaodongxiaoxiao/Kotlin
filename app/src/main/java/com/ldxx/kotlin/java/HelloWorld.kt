package com.ldxx.kotlin.java

/**
 * Created by ldxx
 * on 2017/2/20.
 */

fun main(args: Array<String>) {
    //sumAB(2, 6)
    val a:Int =8
    val b =a.toDouble()
    //print(a==b)
    val bl:Boolean =true
    println(bl)
    //
    val x: Array<Int> = arrayOf(2,4,6)
    for (i in x) {
        print("$i ")
    }

    println("\n------")
    val asc = Array(5, {i -> (i * i).toString() })
    for (i in asc.indices){
        println("$i :${asc[i]}")
    }

    val hello:String ="hello world"
    for (s in hello){
        println(s.toUpperCase())
    }
}

fun sum(a: Int, b: Int) {
    print(" $a + $b = " + (a + b))
}

fun sumAB(a:Int,b:Int) = print(" $a + $b = " + (a + b))


