package com.example.jetjokes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JokeDto(

    @field:Json(name = "id")
    val jokeId: String,

    @field:Json(name = "joke")
    val joke: String,

    @field:Json(name = "status")
    val status: Int
)
