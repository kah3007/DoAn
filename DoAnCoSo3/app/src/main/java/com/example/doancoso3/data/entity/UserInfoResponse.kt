package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class UserInfoResponse(
    @SerializedName("message") val message: String?,
    @SerializedName("success") val success: Boolean
)
