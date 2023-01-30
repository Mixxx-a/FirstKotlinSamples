package ru.sladkov.firstkotlinsamples

fun main() {
    var test = "test"
    println(test);
    test = "newTest"
    println("test after change:" + test);

    // static
    val testStatic = "testStatic"
//    testStatic = "newTestStatic" - compile error
    println("testStatic: $testStatic");

    // define type
    // everything is an object (reference type)
    val number1: Double = 1.0
    val number2: Int = 1
    println("number1 + number2: ${number1 + number2}")

}