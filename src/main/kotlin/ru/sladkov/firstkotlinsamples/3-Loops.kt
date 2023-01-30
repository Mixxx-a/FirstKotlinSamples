package ru.sladkov.firstkotlinsamples

fun main() {
    val cars = listOf("Audi", "BMW", "Mercedes") // immutable list

    //foreach
    for (car in cars) {
        println(car)
    }
    println()

    //for
    for (index in cars.indices) {
        println(cars[index])
    }
    println()

    for (i in 0..cars.size - 1) {
        println(cars[i])
    }
    println()
    //or
    for (i in 0 until cars.size) { // until - without last element
        println(cars[i])
    }
    println()

    //while
    var i = 0
    while (i < cars.size) {
        println(cars[i])
        i++
    }
    println()

    //reverse
    for (revI in cars.size - 1 downTo 0) {
        println(cars[revI])
    }
    println()
}