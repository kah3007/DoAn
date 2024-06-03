package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class CartReponse (
    @SerializedName("cartFoods") var cartFoods: CartFood,
    @SerializedName("success") var success: Boolean
)