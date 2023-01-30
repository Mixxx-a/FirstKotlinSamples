package ru.sladkov.firstkotlinsamples

fun main() {
    val p1: Person = Person("Mikhail", 24)
    println(p1.name)
    val p2 = Person("Vasya", 36, "Russian")
    println(p2) // link to object
    val p3 = Person()
    println()

    val r1 = Rectangle(5.0, 2.0)
    val r2 = Rectangle(1.0, 10.0)
    val r3 = Rectangle(5.0, 2.0)

    println(r1.perimeter)
    println(r1.area())

    println(r1.test)
    r1.test = 5
    println(r1.test)
    r1.test = -5
    println(r1.test)

    println(r2) // auto-generated toString()
    println(r1 == r3) // .equals()
    println(r1 === r3) // check link equality
}

class Person(var name: String, val age: Int) { // Primary constructor
    var language: String = "English"

    init {
        println("Person $name is created")
    }

    //Secondary constructor
    constructor(name: String, age: Int, language: String) : this(name, age) {
        this.language = language
    }

    constructor() : this("defaultName", 0) {}
}

//data - auto generates equals(), hashCode(), toString(), ...?
data class Rectangle(var height: Double, var width: Double) {
    var perimeter = (height + width) * 2

    //Custom getter and setter
    var test = 1
        get() = field + 1 // this.test + 1
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    fun area() = height * width
}