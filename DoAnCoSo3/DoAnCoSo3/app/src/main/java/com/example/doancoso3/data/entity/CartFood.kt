package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class CartFood(
    @SerializedName("CartFoodID") var cartFoodId: Int = 0,
    @SerializedName("RestaurantID") var restaurantId: Int,
    @SerializedName("Username") var username: String,
    @SerializedName("FoodID") var foodId: Int,
    @SerializedName("Quantity") var quantity: Int = 0,
    @SerializedName("TotalPrice") var total: Float = 0f
)