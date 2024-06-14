package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class FoodResponse (
    @SerializedName("foods") var foodList: List<Food>,
    @SerializedName("success") var success: Boolean
)