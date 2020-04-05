package ru.example


object SomeUtils {

    fun qwer(a1: Int, a2: Int): Int {

        if (a1 == a2)
            return 0

        if (a1 < a2) {
            return 1
        } else {
            return -1
        }
    }
}