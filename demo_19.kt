package Kotlin_Demo

import kotlin.text.*

/* 
【概要】
プライマリコンストラクタ→関数の()のところで定義できるやつ
セカンダリコンストラクタ→関数の中でconstructor使って定義できるやつ
処理の流れは、constructor->initの順。
セカンダリコンストラクタのみでも可能なので、見やすい方を採用する。
 */
fun main() {
    var food = Food(0, "おにぎり")
    var food2 = Food2()
    var food3 = Food2(2, "唐揚げ")

    food.disp()
    food2.disp()
    food3.disp()

    var secFood = secondaryFood(0)
    var secFood2 = secondaryFood(1)
    var secFood3 = secondaryFood(2, "そば")
}

class Food (type:Int, name:String) {
    /* プライマリコンストラクタ = クラス名の後に()で定義 -> initでコンストラクタを初期化 */
    // 引数が無ければ()無しでもOK
    var type:Int = 0
    var name:String = "名前"

    init {
        // 引数のnameと、Foodオブジェクト自身が持つnameの区別をするためthisを付ける
        this.type = type
        this.name = name
    }

    fun disp() {
        println("type:${type}, name:${name}")
    }
}

/* プライマリコンストラクタの省略 -> スマートにしちゃおうぜ */
// 以下のようにすれば、初期化もデフォルト値も兼ねることができる。
class Food2 (private var type:Int = 0, private var name:String = "食べ物") {
    fun disp() {
        println("type:${type}, name:${name}")
    }
}

/* セカンダリコンストラクタ -> コンストラクタが複数ある場合、constructor(){}で定義する */
class secondaryFood (private var type:Int, private var name:String) {
    
    constructor (type:Int) : this(type, "食べ物"){
        println("[セカンダリ] type:${type}, name:${name}")
    }
    init {
        println("[プライマリ] type:${type}, name:${name}")
    }

    fun disp() {
        println("type:${type}, name:${name}")
    }
}