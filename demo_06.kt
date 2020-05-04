package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* Anyは(Non-nullの)全てのクラスのスーパクラス */
    // 型を気にせずなんでもぶっこめる点では便利。
    // 全てのスーパクラスだけに、型特定のメソッドは実行できない(.lengthなど)
    var a:Any = "test"
    a = 100
    a = 8000L

    /* Nullableにすることで、なんでもぶっ込めちゃう最強なやつになる */
    // やばそう。あまり触りたくない
    var b:Any? = null

    /* Nothingは、全てのクラスのサブクラス */
    // 全てを継承しているわけないので、インスタンスもない → 存在しないという値を返す
    // 関数の戻り値として、正常終了していないという意味を持たせることもできる。
    // KotlinにはNothingを返す、TODOメソッドがある。
    // TODO("分岐処理の実装をする")

    printInt(4)
}

/* Unitは、戻り値がないことを表す(省略可能) */
fun printInt(i:Int):Unit {
    println("printInt $i")
}