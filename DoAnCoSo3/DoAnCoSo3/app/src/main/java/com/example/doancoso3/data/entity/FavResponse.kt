package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class FavResponse (
    @SerializedName("success") val success: Boolean,
    @SerializedName("message") val message: String
)