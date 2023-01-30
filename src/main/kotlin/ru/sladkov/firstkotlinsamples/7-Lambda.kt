package ru.sladkov.firstkotlinsamples

fun main() {
    val nums = listOf(3, 8, 1, -5, 14)

    println("testLambda1")
    testLambda1(nums)
    println("\ntestLambda2")
    testLambda2(nums)
    println("\ntestLambda3")
    testLambda3(nums)

    println("\nprintEvenOrOdd")
    printEvenOrOdd(nums)

    println(nums.map { it * 2 })
    println(nums.filter { num -> num % 2 == 0 })
    println(nums.reduce { sum, e -> sum + e }) // or nums.sum()

    println(nums.sorted())
    println(nums.sortedDescending())
    println(nums.sortedBy { it.hashCode() })

    println(nums.any { it > 5 }) // if collection has at least one element with condition
    println(nums.all { it > 5 }) // if all elements

    val (positive, negative) = nums.partition { it > 0 }
    println(positive)
    println(negative)

    val result: Map<Int, List<String>> = listOf("a", "b", "ba", "ccc", "aa").groupBy { it.length }
    println(result)
}

fun testLambda1(numbers: List<Int>) {
    numbers.forEach { number -> print(number) }
}

fun testLambda2(numbers: List<Int>) {
    numbers.forEach { print(it) }
}

fun testLambda3(numbers: List<Int>) {
    numbers.forEach(::print)
}

fun printEvenOrOdd(numbers: List<Int>) {
    numbers.forEach { if (it % 2 == 0) println("$it is even") else println("$it is odd") }
}