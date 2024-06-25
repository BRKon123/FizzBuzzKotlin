package com.example.fizzbuzz

fun main() {
    fizzbuzz(100)
}

fun fizzbuzz(maxNumber: Int) {

    for (i in 1..maxNumber) {
        val sb = StringBuilder()
        if (i % 3 == 0) sb.append("Fizz")
        if (i % 5 == 0) sb.append("Buzz")
        if(sb.isEmpty()) {
            println(i)
        } else {
            println(sb.toString())
        }
    }

}
