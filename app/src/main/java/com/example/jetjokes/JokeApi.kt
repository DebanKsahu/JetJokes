package com.example.jetjokes

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface JokeApi {
    @Headers(
        "Accept: application/json",
        "User-Agent: DebanDad"
    )
    @GET("/")
    suspend fun getNewJoke(): Response<JokeDto>
}