package com.example.fizzbuzz

fun main() {

    println("Enter the maximum number:")
    val maxNumber = readlnOrNull()?.toIntOrNull()?: return println("Invalid number")

    fizzbuzzStretch(maxNumber)
}

fun fizzbuzzStretch(maxNumber: Int) {

    for (i in 1..maxNumber) {
        //initialise mutable list of strings so that is can be reversed
        val parts = mutableListOf<String>()

        if (i % 11 == 0) {
            parts.add("Bong")
        } else {
            if (i % 3 == 0) parts.add("Fizz")
            if (i % 13 == 0) parts.add("Fezz")
            if (i % 5 == 0) parts.add("Buzz")
            if (i % 7 == 0) parts.add("Bang")
        }

        if (i % 17 == 0) {
            parts.reverse()
        }

        if (parts.isEmpty()) println(i.toString()) else println(parts.joinToString(""))
    }


}
