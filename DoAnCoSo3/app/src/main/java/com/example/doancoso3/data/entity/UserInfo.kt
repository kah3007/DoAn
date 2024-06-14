package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class UserInfo(
    @SerializedName("UserInfoID") var userId: Int = 0,
    @SerializedName("Username") val username: String,
    @SerializedName("Address") val Address: String,
    @SerializedName("Ward") val Ward: String,
    @SerializedName("Note") val Note: String
)
