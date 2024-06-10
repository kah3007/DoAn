package com.example.doancoso3.data.entity
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("userId") var userId: Int = 0,
    @SerializedName("username") val username: String,
    @SerializedName("password") val password: String,
    @SerializedName("email") val email: String,
    @SerializedName("role") val role: Int = 0

)
