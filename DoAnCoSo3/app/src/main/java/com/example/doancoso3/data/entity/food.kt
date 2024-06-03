package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class Food(
    @SerializedName("food_id") val foodId: Int,
    @SerializedName("food_name") val foodName: String,
    @SerializedName("food_description") val foodDescription: String?,
    @SerializedName("food_price") val foodPrice: Float,
    @SerializedName("food_restaurant_id") val foodRestaurantId: Int
)
