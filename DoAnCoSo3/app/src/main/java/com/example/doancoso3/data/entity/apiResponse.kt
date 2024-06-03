package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("message") val message: String?,
    @SerializedName("error") val error: String?
)