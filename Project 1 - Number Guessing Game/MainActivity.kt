package com.tuanayilmaz.numberguessname

import java.util.Scanner
import kotlin.system.exitProcess

fun main() {

    val randomNumber = (0..100).random() //a random number between 0 and 101 (101 not included)
    var userTurn = 3 //the number of turns the user has
    val userGuess = -1 //initial user input
    val input = Scanner(System.`in`)

    while (userGuess != randomNumber) {
        println("Enter your guess: ")
        val userGuess = input.nextInt()
        if (userGuess > randomNumber) {
            userTurn -=1
            if (userTurn!=0) {
                println("Try a smaller number. You have $userTurn guesses left")
            }
        }
        else if(userGuess < randomNumber) {
            userTurn -=1
            if (userTurn!=0) {
                println("Try a bigger number. You have $userTurn guesses left")
            }
        }
        else {
            println("Congratulations! You win!")
            exitProcess(0)
        }
        if (userTurn==0) {
            println("Computer won! The number was $randomNumber.")
            exitProcess(0)
        }
    }
}