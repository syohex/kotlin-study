package org.syohex.challenge001

import java.util.*

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    if (hello1 === hello2) {
        println("equal reference")
    } else {
        println("not equal reference")
    }

    println("value equal=${hello1 == hello2}")

    var num = 2988
    println("num = $num")

    val str : Any = "The Any Type is the root of the Kotlin class hierarchy"
    if (str is String) {
        println(str.uppercase(Locale.getDefault()))
    }

    val lines = """
        |    1
        |   11
        |  111
        | 1111
    """.trimMargin("|")
    println(lines)
}
