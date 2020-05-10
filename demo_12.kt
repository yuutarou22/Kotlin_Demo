package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* whenは、switchに該当する。 */
    // break不要！、defaultの代わりにelse、式として値を返せる
    val foodType = 1
    val msg = when(foodType) {
        1 -> {
            "和食"
        }
        2 -> {
            "洋食"
        }
        3 -> {
            "中華"
        }
        else -> {
            "それ以外"
        }
    }
    println(msg)

    /* 引数なしでの条件判定も可能 */
    // breakが無い→流れで2つの条件に引っかかることはない→if文の代用もできる
    val a = 3
    val b = 10

    when {
        a in 1..5 -> println("aは１〜５です")
        (b == 1 || b == 10) -> println("bは１か１０です")
        else -> println("それ以外です")
    }
}