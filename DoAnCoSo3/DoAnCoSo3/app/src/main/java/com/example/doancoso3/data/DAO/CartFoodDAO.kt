package com.example.doancoso3.data.DAO

import com.example.doancoso3.data.entity.CartResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface CartFoodDAO {
    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_cart.php")
    suspend fun loadCart(
        @Field("username") username: String,
        @Field("restaurant_id") restaurantId: Int,
    ): CartResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/addToCart.php")
    suspend fun addToCart(
        @Field("cart_id") cart_id: Int,
        @Field("restaurant_id") restaurantId: Int,
        @Field("username") username: String,
        @Field("food_id") food_id: Int,
        @Field("quantity") quantity: Int,
        @Field("total") total: Float
    ): CartResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/delete_cart_by_id.php")
    suspend fun deleteCart(
        @Field("cart_id") cart_id: Int,
    ): CartResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/confirm_total.php")
    suspend fun confirmCart(
        @Field("username") username: String,
        @Field("restaurant_id") restaurantId: Int,
    ): CartResponse

}