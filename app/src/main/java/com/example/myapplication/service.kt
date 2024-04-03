package com.example.myapplication

import retrofit2.http.GET

interface Service {
    @GET("/random")
    suspend fun getdate():
            Class1
}