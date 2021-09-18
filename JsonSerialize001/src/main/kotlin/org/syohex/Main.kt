package org.syohex

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString
import kotlinx.serialization.decodeFromString

@Serializable
data class Data(val name: String, val age: Int)

@OptIn(ExperimentalSerializationApi::class)
fun main() {
    val json = Json.encodeToString(Data(name = "Taro", age = 99))
    println(json)

    val datas = Json.encodeToString(listOf(Data("taro", 10), Data("hanako", 83)))
    println(datas)

    val list = Json.decodeFromString<List<Data>>(datas)
    println(list)
}