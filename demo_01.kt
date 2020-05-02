package Kotlin_Demo

import kotlin.text.*

/**
 * val = 実行時定数
 * const = コンパイル時定数
 * (main関数実行前、つまりコンパイルされた時点で値が入っている定数のこと)
 * ローカル変数として扱えないので、関数の外で定義する。
 */
const val APP_NAME:String = "AppTest"
const val APP_VER_NUM:String = "1.0.0"

fun main() {
    // 文字列を出力
    // print→改行なし
    // println→改行あり
    println("hello")

    // Kotlinのバージョンを出力
    println(KotlinVersion.CURRENT)

    /**
     * var = 再代入可能
     * val = 再代入不可
     */
     var a = 10;
     val b = 20;

    // 値の埋め込みが楽すぎるっ！！！（${a}でも可能）
    // 注意点：半角スペースを空けないと、変数が認識されない！
     print("a = $a, b = $b")

    /* 型推論があるが、初期値がない場合は型指定が必要 */
    val c = 1      // OK
    val d = "abc" // OK
    val e:String // OK
    // val f        NG
}