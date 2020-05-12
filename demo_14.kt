package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* while */
    var i = 0
    while (i++ <5) {
        println(i)
    }

    i = 0
    do {
        val loopFlag = if (i<5) true else false
        print("${i} ")
        i++
    } while(loopFlag)
}