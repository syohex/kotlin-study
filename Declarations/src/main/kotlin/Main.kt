fun main(args: Array<String>) {
    val number = 10
    println("number = $number")

    var foo = 20
    println("foo=$foo")
    foo = 90
    println("foo=$foo")

    val employee = Employee("Tom Brown", 999)
    employee.print()
}

class Employee(val name: String, val id: Int) {
    fun print() {
        println("name=$name, id=$id")
    }
}