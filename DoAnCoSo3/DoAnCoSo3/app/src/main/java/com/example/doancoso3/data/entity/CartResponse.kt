package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class CartResponse (
    @SerializedName("cartFoods") var cartFoods: List<CartFood>,
    @SerializedName("success") var success: Boolean
)