package Kotlin_Demo

import kotlin.text.*

fun main() {
    myFunc("pen")
    myFuncDefault()
    myFuncDefault("唐揚げ")

    // 引数名を指定する
    functionTest(c=7, a=1)

    // 可変長引数
    functionVararg(1,2,2,2,3,4,5,6,6,9)
    sum(1,2,2,2,3,4,5,6,6,9)

    // ワンライナー
    println(add(10, 5))

    // ::で関数をオブジェクトにできる（高階関数で使う）
    val myFuncObj = ::myFunc
    highFunc('a', ::charFunc)
    // ラムダ式を渡すことも可能。
    // hightFuncとしては、第二引数で受け取るのが、Char型で受け、String型で返す関数であれば何でも良いわけですな。
    highFunc('r',{c:Char -> "${c}${c}${c}"})
    /* 以下のようなこともできる */
    // ・ラムダ式を()の外に出す
    // ・()を省略する←デフォルト値がある場合ね。
}

// 引数の型指定は必須、デフォルト値の指定がない場合は、
// 呼び出し側も値を渡さなければならない。
fun myFunc(str:String) {
    println("This is a ${str}")
}

// デフォルト値あり
fun myFuncDefault(s:String = "peeee") {
    println("あなたの好きな食べ物は${s}ですね？")
}

// 引数名を指定する
fun functionTest(a:Int, b:Int=2, c:Int) {
    println("a: ${a}, b: ${b}, c: ${c}")
}

// 可変長引数(vararg)
fun functionVararg(vararg prms:Int) {
    prms.forEach{ print("${it} ") }
    println("")
}
fun sum(vararg prms:Int) {
    var sum = 0
    prms.forEach{ sum += it }
    println("引数の合計は、${sum}です")
}

// 1文で書ける関数であれば、ワンライナーで作成可能
fun add(a:Int, b:Int):Int = a+b

/* 関数を引数としたり、戻り値とする関数を「高階関数」と呼ぶ */
fun charFunc(c:Char):String = "${c}${c}${c}"
fun highFunc(c:Char, pf:(Char)->String) {
    println(pf(c))
}


