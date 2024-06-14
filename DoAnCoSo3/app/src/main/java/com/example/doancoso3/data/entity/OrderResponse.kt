package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class OrderResponse (
    @SerializedName("orders") var orderList: List<Order>,
    @SerializedName("success") var success: Boolean
)