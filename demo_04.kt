package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* 配列を作成する方法は3つ
     * 　・arrayOf
     * 　・arrayOfNulls
     * 　・Arrayクラスのコンストラクタ
     */
    
    /* arrayOf関数を使って配列を作成 */
    // ちなみにArrayクラスには、addやremoveAtメソッドはない。
    val intArray = arrayOf(1,2,3,4,5)
    val strArray = arrayOf("aaa", "bbb", "ccc")

    println(intArray[0])
    println(strArray[1])
    println(strArray.get(2))
    
    // 普通に、インデックス指定して代入も可能。
    intArray[0] = 20
    println(intArray[0])

    /* arrayOfNulls関数を使ってNull埋めの配列を作成 */
    // 全てNullのため、型推論ができないので型指定する必要がある
    val intNullArray:Array<Int?> = arrayOfNulls(3); // NullableのInt型配列を作るよ〜

    /* コンストラクタで配列を作成 */
    // Array<型>(サイズ, {初期化処理})
    // 数値で規則があるのであれば、予約変数it(i)を使って配列を作ると便利
    val intAry = Array<Int>(5, {it*3})

    for (i in intArray) print("$i")
    println("")
    intAry.forEach { print("$it") }
}