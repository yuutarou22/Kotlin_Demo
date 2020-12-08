package demo_18

import kotlin.text.*

fun main() {
    val food = Food()
    food.type = 1
    food.name = "おにぎり"
    food.disp()

    val food2 = Food2()
    // アクセス修飾子はprivateなので、クラス外からはアクセスできない。
    // food.type,name [NG] 下のは、クラス内アクセスするメソッドなのでOK
    food2.disp()
}

/* クラスを定義するときの注意点 */
// プロパティの初期化は必須
class Food {
    var type:Int = 0
    var name:String = "名前"

    fun disp() {
        println("type:${type}, name:${name}")
    }
}

class Food2 {
    private var type:Int = 0
    private var name:String = "名前"

    fun disp() {
        println("type:${type}, name:${name}")
    }
}