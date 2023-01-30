package ru.sladkov.firstkotlinsamples

fun main() {
    voidFun1()
    voidFun2()

    println("sumInt")
    println(sumInt1(2, 5))
    println(sumInt2(2, 5))

    println("testNamedArgs")
    println(testNamedArgs(2, 3, 5))
    println(testNamedArgs(z = 5, y = 3, x = 2))

    println("testDefaultArgs")
    testDefaultArgs()
    testDefaultArgs(y = 5)
    testDefaultArgs(3, 6)

    println("testVarargs")
    println("0 args:")
    testVarargs()
    println("\n1 arg:")
    testVarargs(6)
    println("\n5 args:")
    testVarargs(1, 2, 3, 4, 5)
    // decomposition with * operator
    val numbers: IntArray = intArrayOf(1, 3, 5)
    println("\ndecomposition of IntArray:")
    testVarargs(*numbers)
    println("\ndecomposition of IntArray + 2 args:")
    testVarargs(*numbers, 7, 9)
    println()

}

fun voidFun1(): Unit {
    return Unit
}

fun voidFun2() {
    return
}

fun sumInt1(x: Int, y: Int): Int {
    return x + y
}

fun sumInt2(x: Int, y: Int): Int = x + y

fun testNamedArgs(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

// useful for overloading methods
fun testDefaultArgs(x: Int = 1, y: Int = 2) {
    println(x + y)
}

//vararg
fun testVarargs(vararg numbers: Int) {
    for (number in numbers) {
        print(number)
    }
}