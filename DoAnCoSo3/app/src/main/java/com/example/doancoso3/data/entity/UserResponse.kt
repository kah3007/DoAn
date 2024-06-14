package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class UserResponse  (
    @SerializedName("users") var userList: List<User>,
    @SerializedName("success") var success: Boolean
)