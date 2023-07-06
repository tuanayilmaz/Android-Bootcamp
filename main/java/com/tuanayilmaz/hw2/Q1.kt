package com.tuanayilmaz.hw2

fun main() {

    val names = arrayListOf(
        "Tuana",
        "Alp",
        "İrem",
        "Ege",
        "Merve"
    )
    println("Enter 3 names using comma: ")
    val userInput = readLine()
    var newList = userInput?.split(",")?.map { it.trim() }

    if (newList != null) {
        //if the user wrote names and did not press enter without entering any names, add the names to the previous list
        if ("" !in newList) {
            names.addAll(newList)
        }
        println(names)
    }

}