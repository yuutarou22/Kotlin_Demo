package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* Kotlinではヌルポ防止のため、通常の型ではNullを許可しない */
    // nullを代入しようとするとエラーになるので、?をつけてNullableにする
    var s:String? = "testring"
    s = null
    println(s)

    // Stringはクラスなので、メソッドを持つ。(https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/)
    // .lengthは文字数を返す。Nullableの変数に使おうとするとエラーになる
    // →Nullチェックが必要になる！（ヌルポ防止に徹している姿勢さすが）
    if (s != null) {
        print(s.length)
    }
    // 短絡評価で先にNullチェックするこういう書き方も！ 
    if(s != null && s.length >= 3) {
        println("sは3文字以上です")
    }

    // ?.演算子（セーフコール） = オブジェクトがNullでない場合はアクセス（実行）
    // $9をコメントアウトして試してみよう
    println(s?.length)

    // !!.演算子 = 強制的にNon-nullに変換する
    // Nullだった場合、ヌルポが発生する
    // println(s!!.length)

    // ?:演算子（エルビス） = Nullでなければ左辺、Nullであれば右辺を評価する
    println(s?.length ?: -1)
}