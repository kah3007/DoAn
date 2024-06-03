package com.example.doancoso3.data.DAO

import com.example.doancoso3.data.entity.CartReponse
import com.example.doancoso3.data.entity.FoodReponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface CartFoodDAO {
    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @GET("/x/load_food.php")
    fun addToCart(
        @Field("restaurant_id") restaurantId: Int,
    ): FoodReponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_cart.php")
    fun loadCart(
        @Field("username") username: String,
        @Field("restaurant_id") restaurantId: Int,
        ): CartReponse
}