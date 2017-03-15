package com.ldxx.kotlin.java

/**
 * Created by wangzhuo-neu on 2017/3/15.
 */
fun main(args: Array<String>) {
  when(11){
      in (1..11),in (23..33) ->println("一区或三区")
      else -> println("二区")
  }
}