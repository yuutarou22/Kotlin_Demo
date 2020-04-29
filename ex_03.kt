package Kotlin_Demo

import kotlin.text.*

fun main () {
    /* whenを使う。範囲式を使う */
    val x = 10
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3,4 -> print("x == 3 or 4")
        in 10..15 -> print("in 10~15")
        else -> {
            print("当てはまりませんでした")
        }
    }

    /* 否定範囲式 */
    val y = 20
    when (y) {
        in 1..5 -> print("該当①")
        !in 10..20 -> print("範囲外") // 範囲式
        else -> print("もはや例外")
    }

    /* 値チェックの方法として'is'が使える */
    val z = 24
    val hasPrefix = when(z) {
        is Int -> print(z * 10)
        // is String -> z.startWith("prefix") // error: incompatible types: String and Int(互換性がないと言われるので、引数となる値の型は固定のよう)
        else -> false
    }

    /* if else-ifの代わりにも使える */
    when {
        x.isOdd() -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("x is funny")
    }
}