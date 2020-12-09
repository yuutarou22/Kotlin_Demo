package Kotlin_Demo

import kotlin.text.*

fun main () {
    /* クラスの継承 */
    val riceball = Riceball(1, "おにぎり", true)
    println("${riceball.type}, ${riceball.name}, ${riceball.seaweed}")
}

/* open修飾子 = クラス継承を許可する。無ければ継承元にはなれない */
open class Food(var type:Int, var name:String) {}

/* 「子クラス:親クラス」で定義する */
// final修飾子 = それ以降、継承できなくさせる
// 注意：親クラスにコンストラクタが無くても、子クラスでは明示的にする必要がある
final class Riceball(type:Int, name:String, var seaweed:Boolean = true) : Food(type, name) {
}