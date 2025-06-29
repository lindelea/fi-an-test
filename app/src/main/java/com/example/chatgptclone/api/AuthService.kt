package com.example.chatgptclone.api

import com.example.chatgptclone.models.LoginRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("auth/login")
    fun login(@Body request: LoginRequest): Call<Unit>
}
