package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class RestaurantResponse (
    @SerializedName("restaurants") var restaurantList: List<Restaurant>?,
    @SerializedName("success") var success: Boolean
)