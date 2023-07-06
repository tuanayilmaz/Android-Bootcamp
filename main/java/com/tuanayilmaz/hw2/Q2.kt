package com.tuanayilmaz.hw2

fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")

    names.sort()

    println("Enter a name: ")

    val userInput = readLine()?.uppercase() //turn the input to the uppercase so that there will be no error if the user enters the name without capitalized or with lowercase

    var upperNames = names.map {it.uppercase()} //turn the list into uppercase so that the input that is uppercase will be matched

    if (upperNames.contains(userInput)) {
        println(userInput?.reversed())
        println(upperNames)
    }
    else {
        println("The name does not contain in the list.")
    }

}

