package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* listOf = イミュータブル(変更不可)なListを作成 */
    val intList = listOf(1, 2, 3, 4, 5)

    /* mutableListOf = ミュータブル(変更可能)なListを作成 */
    val intMtbList = mutableListOf(1, 2, 3, 4, 5)

    // 添字指定やgetメソッドで値を取得できる
    println ("intList[2]: ${intList[2]}")
    println ("intList.get(4): ${intList.get(4)}")
    println ("intList全要素: ${intList}")

    // Mutableのみ代入が可能
    intMtbList[3] += 10
    println ("intMtbList[3]: ${intMtbList[3]}")

    /* 追加と削除 */
    // Arrayにはなかった追加削除メソッドが、Listにはある
    // ※imutableの方には無い。
    intMtbList.add(10)
    intMtbList.removeAt(2)
    println ("intMtbList全要素: ${intMtbList}")

    /* よく使うメソッドやプロパティたち */
    // Listのサイズ取得
    println ("size: ${intList.size}")
    
    // 重複を削除
    val list = listOf(1,2,2,2,3,3,3,4,5,5,5,6)
    println ("list.distinct(): ${list.distinct()}")
    
    // 指定した値があればTrue
    println ("intList.contains(3): ${intList.contains(3)}")
    println ("list.containsAll(listOf(1,5,6)): ${list.containsAll(listOf(1,5,6))}")

    // 指定した値が出現する最初の位置、最後の位置を返す(見つからない場合は-1)
    val strList = listOf("aaa", "bbb", "ccc", "ddd", "ccc")
    println("strList.indexOf(\"b\"): ${strList.indexOf("b")}")
    println("strList.indexOf(\"ccc\"): ${strList.indexOf("ccc")}")
    println("strList.lastIndexOf(\"ccc\"): ${strList.lastIndexOf("ccc")}")

    // 全ての要素が条件を満たしているか
    println("intList.all{it < 5}: ${intList.all{it < 5}}")
    println("intList.all{it >= 1}: ${intList.all{it >= 1}}")

    // どれかの要素が条件を満たしているか
    println("intList.any{it < 5}: ${intList.any{it < 5}}")
    println("intList.any{it >= 1}: ${intList.any{it >= 1}}")

    // 条件を満たした要素数
    println("intList.count{it > 3}: ${intList.count{it > 3}}")

    // この他にも集計(sum,average,min,max)、ソート、
    // 和集合、積集合、差集合などがある
}