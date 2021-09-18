package ru.geekbrains.kotlinlesson1

object Repository {
    val people: List<Person>

    init {
        people = mutableListOf(
            Person("Владимир", 30),
            Person("Генадий", 35),
            Person("Борис", 25)
        )
    }
}