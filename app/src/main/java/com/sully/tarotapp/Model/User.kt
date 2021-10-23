package com.sully.tarotapp.Model

class User(
    val id: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val tirages: MutableList<Tirage> = mutableListOf()) {

    init{
        println("First init block that prints ${firstName}")
    }


}