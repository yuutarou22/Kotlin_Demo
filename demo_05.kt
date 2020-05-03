package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* ..演算子で、範囲を扱うことができる！スゲー */
    val range:IntRange = 1..5
    val range2 = 2..6

    for (i in range) print("$i ")
    println("")

    /* 拡張関数を使うことで範囲をもっと便利に */
    // step 関数   = ステップ単位を指定できる
    val testRange:IntRange = 1..25
    for (i in testRange step 5) print("$i ")
    println("")

    // downTo 関数 = 逆順を取得する（..演算子では通常逆順はNGっぽい）
    for (i in 25 downTo 1 step 3) print("$i ")
    println("")

    /* CharRangeで、文字の範囲を扱える */
    val charRange:CharRange = 'I'..'P'
    for (c in charRange) print("$c")
    println("")

    val charRangeKana:CharRange = 'あ'..'そ'
    for (c in charRangeKana) print("$c")
    println("")

    // 「ふ」はハ行に含まれる判定
    val halineRange:CharRange = 'は'..'ほ'
    println('ふ' in halineRange)

    // 文字の範囲でも、ステップが使える
    for (c in charRange step 2) print("$c")
}