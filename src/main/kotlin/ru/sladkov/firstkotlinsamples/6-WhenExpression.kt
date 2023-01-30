package ru.sladkov.firstkotlinsamples

fun main() {
    testWhen(1)
    testWhen(2)
    testWhen(3)
    testWhen("abcd")
    testWhen(listOf(1, 2, 3))
}

// replacement of switch operator
fun testWhen(input: Any) { // Any - like Object in Java
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 3..10 -> println("From 3 to 10")
        is String -> println("String with length ${input.length}") // check type + cast to type
        else -> println("Something else: $input")
    }
}