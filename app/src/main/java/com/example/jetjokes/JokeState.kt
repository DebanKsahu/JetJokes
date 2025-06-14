package com.example.jetjokes

data class JokeState(
    val joke: String = "No Joke",
    val author: String = "Deban",
    val isClicked: Boolean = false
)