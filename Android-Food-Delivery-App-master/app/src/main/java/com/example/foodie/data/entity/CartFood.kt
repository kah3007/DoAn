package com.example.foodie.data.entity

import com.google.gson.annotations.SerializedName

data class CartFood(
    @SerializedName("cartFoodId") var cartFoodId: Int,
    @SerializedName("foodName") var foodName: String,
    @SerializedName("foodImageName") var foodImageName: String,
    @SerializedName("foodPrice") var foodPrice: Int,
    @SerializedName("foodQuantity") var foodQuantity: Int,
    @SerializedName("username") var username: String
)