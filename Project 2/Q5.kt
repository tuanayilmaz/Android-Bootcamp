package com.tuanayilmaz.hw2

fun main() {

    data class Workers(val name: String, var salary: Double)

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    workers.forEach {
        it.salary += it.salary*0.35
    }

    var shuffledWorkers = workers.shuffled()

    var highest = Workers("", 0.0)
    var lowest = Workers("", 0.0)

    highest = workers.find{it.salary == workers.maxOf{it.salary}}!!
    lowest= workers.find{it.salary == workers.minOf{it.salary}}!!

    println("Worker with the highest pay: "  + highest.name + " with the salary of "+ shuffledWorkers.maxOf { it.salary })
    println ("Worker with the lowest pay: "  + lowest.name + " with the salary of " + shuffledWorkers.minOf { it.salary })

    println("The average of the salaries is: " + workers.sumOf { it.salary }/workers.count())

}