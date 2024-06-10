package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class Restaurant(
    @SerializedName("RestaurantID") var id: Int,
    @SerializedName("Name") var name: String,
    @SerializedName("Address") var address: String,
    @SerializedName("Phone") var phone: String?,
    @SerializedName("Rating") var rating: Float?,
    @SerializedName("Hours") var hours: String?,
    @SerializedName("isFav") var isFav: Int?,
    @SerializedName("Img") var img: String?,
    )
