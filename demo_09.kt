package Kotlin_Demo

import kotlin.text.*

fun main() {
    /* Mapは、Key-Valueで構成されるコレクション */
    /* mapOf = イミュータブル(変更不可)なMapを作成 */
    val ageMap = mapOf(20 to "二十路", 30 to "三十路", 40 to "四十路")

    /* mutableMapOf = ミュータブル(変更可能)なMapを作成 */
    val ageMtbMap = mutableMapOf(20 to "二十路", 30 to "三十路", 40 to "四十路")

    for ((age, kanji) in ageMap) {
        println("${age}歳は、「${kanji}」と書きます。")
    }

    println("ageMap.keys: ${ageMap.keys}")
    println("ageMap.values: ${ageMap.values}")

    ageMtbMap[50] = "五十路"
    ageMtbMap[60] = "六十路"

    println("ageMtbMap: ${ageMtbMap}")
}