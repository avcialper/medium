package com.avcialper.basictypes

fun main() {
    /**
     *  İçerisinde sadece true ve false değerlerini tutabilirler.
     */
    val isStudent = true
    val isWorking: Boolean = false

    println(isStudent && isWorking)     // false
    println(isStudent || isWorking)     // true
    println(!isStudent)                 // false
}