package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* Pairは、値を２つ保持することができる */
    // first, secondプロパティで取得できる。
    val twentiesPair = Pair(20, "二十路")
    println(twentiesPair)
    println("twentiesPair.first: ${twentiesPair.first}")
    println("twentiesPair.second: ${twentiesPair.second}")

    /* 分解宣言 = 2つの変数で受け取ることも可能 */
    val (age, kanji) = Pair(30, "三十路")
    println("${age}は、${kanji}です")

    /* Tripleは、値を3つ保持することができる */
    // first, second, thirdプロパティで取得できる
    val thirtiesTriple = Triple(30, "三十路", "みそじ")
    println(thirtiesTriple)
    println("thirtiesTriple.first: ${thirtiesTriple.first}")
    println("thirtiesTriple.second: ${thirtiesTriple.second}")
    println("thirtiesTriple.third: ${thirtiesTriple.third}")

    /* よく使うポイント----> 関数の戻り値で複数の値を返す時 */
    val (age2, kanji2) = getTwenties()
    println("${age2}は、${kanji2}です")
}

fun getTwenties(): Pair<Int, String> {
    return Pair(20, "二十路")
}