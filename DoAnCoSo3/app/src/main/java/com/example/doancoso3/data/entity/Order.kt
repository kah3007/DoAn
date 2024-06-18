package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class Order(
    @SerializedName("OrderID") var orderId: Int,
    @SerializedName("RestaurantID") var restaurantId: Int,
    @SerializedName("Username") var username: String,
    @SerializedName("OrderDate") var orderDate: String,
    @SerializedName("TotalPrice") var totalPrice: Float,
    @SerializedName("Status") var status: Int
)
