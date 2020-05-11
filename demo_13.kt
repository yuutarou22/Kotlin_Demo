package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* Kotlinのfor文では、配列やコレクションの要素を順番に取得する（Foreachみたいに） */
    val intArray = arrayOf(1,2,3,4,5)
    for (i in intArray) {
        println(i)
    }

    // breakでループを中断する
    for (i in 1..5) {
        print("No.")
        if (i>3) break
        println(i)
    }

    // 処理をスキップする
    for (i in 1..5) {
        print("No.")
        if (i==3) continue
        print(i)
    }

    println("")

    /* ラベル */
    for (c in 'a'..'c') {
        for(i in 1..2) {
            println("${c} - ${i}")
        }
    }

    println("")

    // a→bまで表示させて終わらせようとしたけど、中断されるのは内側ループのみ。
    for (c in 'a'..'c') {
        for(i in 1..2) {
            if (c == 'b' && i == 2) break
            println("${c} - ${i}")
        }
    }

    println("")

    // 外側のループまで中断させたいときは、ラベルを使う！
    test@ for(c in 'a'..'c') {
        for (i in 1..2) {
            if (c == 'c' && i == 1) break@test
            println("${c} - ${i}")
        }
    }
}