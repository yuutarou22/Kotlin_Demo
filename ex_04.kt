package Kotlin_Demo

import kotlin.text.*

fun main() {
    
    /* 1~10まで出力する */
    for (i in 1..10)
        println(i)

    /* 配列の例 */
    val array = arrayOf("aaa", "bbb", "ccc", "ddd")
    for (i in array) println(i)

    /* 降順にループを回す */
    // downTo: 指定の値まで、step: 指定の値ずつ
    for (i in 10 downTo 5 step 1) println(i)

    /* Mapを使う */
    var map = mapOf("1" to "Yamada", "2" to "Tanaka")
    for ((k, v) in map) println("$k : $v")
}