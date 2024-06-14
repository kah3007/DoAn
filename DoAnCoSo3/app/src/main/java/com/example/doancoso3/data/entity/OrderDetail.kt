package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class OrderDetail(
    @SerializedName("OrderDetailID") var orderDetailId: Int,
    @SerializedName("OrderID") var orderId: Int,
    @SerializedName("Username") var username: String,
    @SerializedName("FoodID") var foodId: Int,
    @SerializedName("Quantity") var quantity: Int,
    @SerializedName("PricePerUnit") var pricePerUnit: Float
)
