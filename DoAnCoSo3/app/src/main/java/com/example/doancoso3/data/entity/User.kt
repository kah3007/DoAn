package com.example.doancoso3.data.entity
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("UserID") var userId: Int = 0,
    @SerializedName("Username") val username: String,
    @SerializedName("Password") val password: String,
    @SerializedName("Email") val email: String,
    @SerializedName("Role") val role: Int = 0
)
