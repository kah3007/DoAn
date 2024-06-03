package com.example.doancoso3.data.entity

import com.google.gson.annotations.SerializedName

data class FoodReponse (
    @SerializedName("foods") var foodList: List<Food>,
    @SerializedName("success") var success: Boolean
)