package com.ldxx.kotlin.java

import kotlinx.android.synthetic.main.activity_second.*
import java.util.*
import kotlin.comparisons.compareBy

/**
 * Created by wangzhuo-neu on 2017/3/14.
 */
data class Person(var name: String, var age: Int)

fun main(args: Array<String>) {
    var personList: MutableList<Person> = mutableListOf()
    personList.add(Person("Jim", 12))
    personList.add(Person("A-Lin", 12))
    personList.add(Person("Tom", 11))
    personList.add(Person("Mary", 14))

    println("----排序前----")
    personList.forEach(::println)
    println("----排序后----")
    //personList.sortBy ({ it.age })
    //personList.sortBy(Person::age)
    personList.sortByDescending({ it.age })
    //val pList: List<Person> = personList.sortedBy { it.name }
    //pList.forEach(::println)
    //println("-- --")

    personList.sortWith(compareBy({ it.age }, { it.name }))
    /* personList.sortWith(Comparator<Person> { person1: Person, person2: Person ->
         person2.age - person1.age
     })*/
    /*val c1: Comparator<Person> = Comparator { o1, o2 ->
        if (o2.age == o1.age) {
            o1.name.compareTo(o2.name)
        } else {
            o2.age - o1.age
        }
    }
    personList.sortWith(c1)*/
    personList.forEach(::println)

}