package org.syohex.challenge003

abstract class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

class MountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) : Bicycle(cadence, speed, gear) {
    private var color : String = ""

    constructor(seatHeight: Int, cadence: Int, speed: Int, gear: Int, color: String) : this(
        seatHeight,
        cadence,
        speed,
        gear
    ) {
        println("This is the color $color")
        this.color = color
    }

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has seat height: $seatHeight")
    }
}

class RoadBike(var tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10) : Bicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has tire width: $tireWidth")
    }
}
