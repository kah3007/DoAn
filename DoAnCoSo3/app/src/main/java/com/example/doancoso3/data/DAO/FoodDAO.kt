package com.example.doancoso3.data.DAO

import com.example.doancoso3.data.entity.FoodInfoResponse
import com.example.doancoso3.data.entity.FoodResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface FoodDAO {
    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_food_admin.php")
    suspend fun loadFoodAdmin(
        @Field("username") username: String,
    ): FoodResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/delete_food_by_id.php")
    suspend fun deleteFoodById(
        @Field("food_id") foodID: Int,
    ): FoodResponse

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

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/update_food_info.php")
    suspend fun updateFoodInfo(
        @Field("food_id") foodId: Int,
        @Field("name") name: String,
        @Field("description") description: String,
        @Field("price") price: Float,
        ): FoodInfoResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/add_food.php")
    suspend fun addFood(
        @Field("Name") name: String?,
        @Field("Description") description: String?,
        @Field("Username") username: String?,
        @Field("Price") price: Float?,
        @Field("Img") img: String?,
        ): FoodInfoResponse
    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_lasted_food_info.php")
    suspend fun loadLastedFoodInfo(
        @Field("food_id") foodId: Int,
    ): FoodResponse
}