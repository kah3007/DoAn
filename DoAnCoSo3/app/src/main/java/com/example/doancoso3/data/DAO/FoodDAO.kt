package com.example.doancoso3.data.DAO

import com.example.doancoso3.data.entity.FoodResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface FoodDAO {
    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_food.php")
    suspend fun loadFood(
        @Field("restaurant_id") restaurantId: Int,
    ): FoodResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_food_by_cart.php")
    suspend fun loadFoodByCart(
        @Field("username") username: String,
        @Field("restaurant_id") restaurantId: Int,
    ): FoodResponse

}