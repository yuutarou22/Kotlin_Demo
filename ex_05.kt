package Kotlin_Demo

import kotlin.text.*

fun main() {
    var x = 10
    while (x > 0) {
        x-- /* デクリメントするだけで、xにも代入されている */
        print("$x")
    }

    do {
        var y = retrieveData()
        print("$y")
    } while(y == null)
}

fun retrieveData():Int {
    return 1
}