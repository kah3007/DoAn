package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class FoodInfoResponse(
    @SerializedName("message") val message: String?,
    @SerializedName("success") val success: Boolean
)
