package org.syohex.challenge003

fun main() {
    val mountainBike = MountainBike(100, 20, 10, 1)
    val roadBike = RoadBike(101, 21, 11, 12)

    mountainBike.printDescription()
    roadBike.printDescription()

    val mountainBike2 = MountainBike(100, 20, 10)
    mountainBike2.printDescription()

    val mountainBike3 = MountainBike(1, 2, 3, 4, "Pink")
    mountainBike3.printDescription()

    MountainBike.availableColors.forEach { println(it) }
}