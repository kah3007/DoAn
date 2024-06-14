package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class UserInfoDetailResponse(
    @SerializedName("userInfo") val userInfo: UserInfo,
    @SerializedName("success") val success: Boolean
)
