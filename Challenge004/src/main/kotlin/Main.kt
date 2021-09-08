fun main() {
//    for (i in 5..5000 step 5) {
//        println(i)
//    }

//    val range = 500.downTo(0).step(50)
//    for (i in range) {
//        println(i)
//    }

//    var n1 = 0
//    var n2 = 1
//    println(0)
//    println(1)
//    for (i in 0..15) {
//        val n = n1 + n2
//        println(n)
//        n1 = n2
//        n2 = n
//    }

//    outer@ for (i in 1..5) {
//        for (j in 100..200) {
//            if (j == 150) {
//                continue@outer
//            }
//
//            println("i=$i, j=$j")
//        }
//    }

    val k = 100
    val num = if (k % 5 == 0) {
        10.0
    } else {
        12.3
    }
    println(num)

    when (num) {
        10.0 -> println("ten")
        else -> println("foo")
    }

    when {
        num < 10.0 -> println("small")
        num > 10.0 -> println("large")
        else -> println("equal")
    }
}