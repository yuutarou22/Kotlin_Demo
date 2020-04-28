package Kotlin_Demo

import kotlin.text.*

fun main() {
    val a = 10
    val b = 20

    // warning: variable 'max' initializer is redundant
    // -> 結局参照する前に代入するなら初期化は冗長じゃない？と警告してくれる賢い子
    var max = a

    // --- ifのみ ---
    if (a < b)
        max = b
        println("max b:" + max)

    // --- if else ---
    if (a > b)
        max = a
    else
        max = b
    
    println("max :" + max)
    
    // --- 三項演算子風 ---
    // Kotlinには三項演算子が存在しない->ifが全てを兼ねる
    var max_2 = if (a > b) a else b

    // ifの分岐をブロックにでき、最後の式がそのブロックの値となる -> つまり、返り値がある
    // ただし、elseブロックが必須
    var max_3 = if (a > b) {
        print ("aが最大値です。　")
        a
    } else {
        print ("bが最大値です。　")
        b
    }
    println("max_3 : " + max_3)
}