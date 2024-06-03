package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class Restaurant(
    @SerializedName("RestaurantID") val id: Int,
    @SerializedName("Name") val name: String,
    @SerializedName("Address") val address: String,
    @SerializedName("Phone") val phone: String?,
    @SerializedName("Rating") val rating: Float?,
    @SerializedName("Hours") val hours: String?,
    @SerializedName("isFav") val isFav: Int?
)