package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* みんな大好きif構文。君の人生も分岐点だ〜。 */
    var msg:String
    var score = 80
    if (score >= 80) {
        msg = "合格です！"
    } else if (score >= 70) {
        msg = "あと少し……！"
    } else {
        msg = "不合格です…"
    }
    println(msg)

    // Kotlinでは、ifを使って値を返せる（else必須）
    var score2 = 20
    var msg2 = if (score2 >= 80) {
        "良い"
    } else if (score2 >= 50) {
        "まぁまぁ"
    } else {
        "頑張ろう"
    }
    println(msg2)
}