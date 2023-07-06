package com.tuanayilmaz.hw2


fun main() {

    data class Student(val name: String, val age: Int, val school: String)

    val students = arrayListOf(
        Student("Ahmet", 20, "University A"),
        Student("Ayşe", 27, "University B"),
        Student("Mehmet", 22, "University C"),
        Student("Fatma", 28, "University A"),
        Student("Ali", 29, "University B"),
        Student("Feyza", 24, "University A"),
        Student("Berkay", 22, "University B"),
        Student("Caner", 26, "University A")
    )

    var oldest = Student("", 0, "")
    var youngest = Student("", 0, "")

    oldest = students.find{it.age == students.maxOf{it.age}}!!
    youngest = students.find{it.age == students.minOf{it.age}}!!

    val studentMaxIndex = students.indexOf(Student(oldest.name, students.maxOf{it.age}, oldest.school ))
    val studentMinIndex = students.indexOf(Student(youngest.name, students.minOf{it.age}, youngest.school ))

    println("Oldest student: " + oldest.name + ", Index on the list: " + studentMaxIndex)
    println("Youngest student: " + youngest.name +  ", Index on the list: " + studentMinIndex)

    val uniA = students.filter { it.school == "University A" }
    println("Students who go to University A: " + uniA)

    println("Students who are over 25 are: " + uniA.filter {it.age > 25})
    println("Students who are under 25 are: " + uniA.filter {it.age < 25})

}