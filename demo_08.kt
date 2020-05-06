package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* Set = 集合のコレクションで、重複した要素を持たない、順序を保持しない */
    /* setOf = イミュータブル(変更不可)なSetを作成 */
    val intSet = setOf(1, 2, 3, 2, 4, 3, 5)

    /* mutableSetOf = ミュータブル(変更可能)なSetを作成 */
    val strMtbSet = mutableSetOf("Bowl", "Ladle", "Kettle", "Ladle", "Whisk")

    println("intSet: ${intSet}")
    println("strMtbSet: ${strMtbSet}")

    // 追加削除(ミュータブル限定)
    strMtbSet.add("Tom")
    strMtbSet.add("John")
    strMtbSet.remove("Bowl")
    println("strMtbSet: ${strMtbSet}")
    
    strMtbSet += ("Michel")
    strMtbSet -= ("Ladle")
    println("strMtbSet: ${strMtbSet}")

    // SetとListを相互変換する場合は、「toSet」、「toList」を使う
}