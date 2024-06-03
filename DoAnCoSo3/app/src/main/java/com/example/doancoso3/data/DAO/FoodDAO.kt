package com.example.doancoso3.data.DAO

import com.example.doancoso3.data.entity.FoodReponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface FoodDAO {
    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_food.php")
    fun loadFood(
        @Field("restaurant_id") restaurantId: Int,
    ): FoodReponse

}