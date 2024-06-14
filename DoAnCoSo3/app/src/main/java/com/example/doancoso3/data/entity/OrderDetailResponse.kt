package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class OrderDetailResponse (
    @SerializedName("orderDetailList") var orderDetailList: List<OrderDetail>,
    @SerializedName("success") var success: Boolean
)