package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class CartFood(
    @SerializedName("cartFoodId") var cartFoodId: Int,
    @SerializedName("restaurantId") var restaurantId: Int,
    @SerializedName("username") var username: String,
    @SerializedName("foodId") var foodId: Int,
    @SerializedName("foodQuantity") var quantity: Int,
    @SerializedName("price") var price: Float,
    @SerializedName("total") var total: Float
)