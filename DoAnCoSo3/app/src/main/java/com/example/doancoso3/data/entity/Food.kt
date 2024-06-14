package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class Food(
    @SerializedName("FoodID") var foodId: Int,
    @SerializedName("Name") var foodName: String,
    @SerializedName("Description") var foodDescription: String?,
    @SerializedName("Price") var foodPrice: Float,
    @SerializedName("RestaurantID") var foodRestaurantId: Int,
    @SerializedName("Img") var img: String?
)
