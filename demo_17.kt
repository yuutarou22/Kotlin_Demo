package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* ジェネリクス関数 = 様々な方に対応できる汎用的なクラスや関数を作成できる */
    intFunc(4)
    genericsFunc<Int>(10)
    genericsFunc<String>("100")
    genericsFunc2<String, Boolean>("test", false)

    // もちろん型推論もOK
    genericsFunc(1000)
    genericsFunc("aaaaa")
    genericsFunc2(123455789, "testest")

    genericsFunc3(listOf(1, 2, 3))
    genericsFunc3(listOf<Number>(1, 2, 3))
    genericsFunc3(listOf(1.1, 1.2, 1.3))

    // tailrec
    println(gcd(14, 63))
}

// Int型のみ受け付ける
fun intFunc (prm:Int) {
    println(prm)
}

// 様々な方を受け取ることが可能
fun <T> genericsFunc(prm:T) {
    println(prm)
}

// 複数の型パラメータを持つジェネリクス関数
fun <T, R> genericsFunc2(prm:T, prm2:R) {
    println("${prm} ${prm2}")
}

// 型パラメータに制約をつけることも可能。
// <T:Number> とすると、Numberのサブクラスである制約が付与される
fun <T:Number> genericsFunc3(prmlist:List<T>) {
    println(prmlist.first())
}

/*
複数の制約をつける場合は、where句を使用する（SQLみたいね）
LunchBox,Riceballクラスがあったとして、そのサブクラスである制約を付与している例

fun <T> genericsFunc4(prmlist:List<T>) where T:LunchBox, T:Riceball {
     println(prmlist.first())
}
*/

/* 【補足】末尾再帰最適化 */
// tailrec修飾子はコンパイラに関数の末尾再帰を最適化する指示を伝える。
// 「関数の末尾で再帰処理をする場合」trailrecをつけると再帰処理が早くなる
tailrec fun gcd(a:Int, b:Int): Int =
    if (b == 0) a
    else gcd(b, a % b)