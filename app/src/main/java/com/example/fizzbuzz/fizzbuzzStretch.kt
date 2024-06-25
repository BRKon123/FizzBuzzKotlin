package com.example.fizzbuzz

fun main(args: Array<String>) {


    // define teh valid values for rules
    val validValues = setOf(3, 5, 7, 11, 13, 17)

    // parse command-line arguments for to contain only ints, and then pass filter to ensure only contain valid values
    val rules = args.mapNotNull({ it.toIntOrNull() }).filter({ it in validValues }).toSet()
    println("The rules: ")
    println(rules)

    println("Enter the maximum number:")
    val maxNumber = readlnOrNull()?.toIntOrNull()

    fizzbuzzStretch(rules, maxNumber?: 100) //if maxNumber null then just default to 100
}

fun fizzbuzzStretch(rules: Set<Int>, maxNumber: Int) {

    for (i in 1..maxNumber) {
        //initialise mutable list of strings so that is can be reversed
        val parts = mutableListOf<String>()

        if (rules.contains(11) && i % 11 == 0) {
            parts.add("Bong")
        } else {
            if (rules.contains(3) && i % 3 == 0) parts.add("Fizz")
            if (rules.contains(13) && i % 13 == 0) parts.add("Fezz")
            if (rules.contains(5) && i % 5 == 0) parts.add("Buzz")
            if (rules.contains(7) && i % 7 == 0) parts.add("Bang")
        }

        if (rules.contains(17) && i % 17 == 0) {
            parts.reverse()
        }

        val result = if (parts.isEmpty()) i.toString() else parts.joinToString("")
        println(result)
    }


}
