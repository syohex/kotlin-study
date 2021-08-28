package org.syohex.challenge002

import java.util.*

fun main(args: Array<String>) {
    val float1 = -3847.384f
    val float2: Float = -3847.384f
    val float3 = (-3847.384).toFloat()
    println(float1)
    println(float2)
    println(float3)

    val float4: Float? = null
    val float5: Float? = (-1234).toFloat()
    println(float4)
    println(float5)

    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    println(shortArray.contentToString());

    val shortArray2 = arrayOf<Short>(1, 2, 3, 4, 5)
    println(shortArray2.contentToString());

    val intArray = Array<Int?>(10) { i -> (i + 1) * 5 }
    println(intArray.contentToString());

    val charArray = charArrayOf('a', 'b', 'c')
    JavaMethod.method1(charArray)

    var x : String? = "I AM IN UPPERCASE"
    if (args.size > 2) {
        x = null
    }
    val z = x?.lowercase(Locale.getDefault()) ?: "I give up"
    println(z)

    x?.let { println(it.lowercase().replace("am", "am not")) }

    val nonNullVariable: Int? = 10
    println(nonNullVariable!!.toString())
}
