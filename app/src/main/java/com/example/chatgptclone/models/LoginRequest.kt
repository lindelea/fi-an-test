package com.example.chatgptclone.models

data class LoginRequest(
    val email: String,
    val password: String,
    val opt: String,
    val tenant: String
)
