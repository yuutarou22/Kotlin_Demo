package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* 関数の中に関数（ローカル関数）を定義することも可能 */
    outsideFunc()
}

fun outsideFunc (a:Char='a') {
    val b = 'b'

    fun localFunc(c:Char='c') {
        val d = 'd'
        println("${a} ${b} ${c} ${d}")
    }

    localFunc()
    println("${a} ${b}")
}

/* 拡張関数 = クラスを拡張させた関数を追加することが可能(Swiftにもあるんだっけ) */
fun Int.plusTen():Int {
    // レシーバーオブジェクトにthisでアクセスする。ここではIntクラスのインスタンス(Int型のi)
    return this + 10
}