package ru.sladkov.firstkotlinsamples

fun main() {
    var a: String = "Some string a " // NPE not possible
//    a = null - compilation error

    var b: String? = if ((0..10).random() > 5) "abcd" else null
    println(b)
//    b = null

//    println(b.length) - compilation error; kotlin applies restrictions
    println(b?.length) // safe-call, returns null if b=null else b.length

    val bLength = b?.length ?: -1 //Elvis operator ?:
    println(bLength)

    val bLengthException = b!!.length //!! - throws NPE if null
}