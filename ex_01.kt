package Kotlin_Demo

import kotlin.text.*

fun main() {
    println ("Hello Kotlin!")
    var a = 10
    val b = 5
    println (sum(a,b))

    a = 15
    // b = 50 -> error: val cannot be reassigned
    println (sum(a,b))
}

/**
 * fun method(変数:型): 戻値型
 */
fun sum(a: Int, b:Int): Int {
    return a + b
}
