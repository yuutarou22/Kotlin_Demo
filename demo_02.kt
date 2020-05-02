package Kotlin_Demo

import kotlin.text.*

fun main() {
    // 様々なデータ型
    // Long, Floatのみ、後ろに接尾辞を付ける。
    var i:Int = 5
    val l:Long = 123L
    val f:Float = 3.14F
    val d:Double = 3.14
    val c:Char = 'a'
    val s:String = "abc"

    i = f.toInt()

    println(i)

    // is = 型チェックを行うことができる
    if (s is String) {
        println("s is String!")
    } else {
        println("s is not String!")
    }

    // Unicode
    print("\u2600 のち \u2601")
}