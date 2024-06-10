package com.example.doancoso3.data.DAO

import com.example.doancoso3.data.entity.FavResponse
import com.example.doancoso3.data.entity.Restaurant
import com.example.doancoso3.data.entity.RestaurantResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestaurantDAO {
    @GET("x/load_restaurant_by_rating.php")
    suspend fun loadRestaurant(): RestaurantResponse

    @GET("x/load_fav_restaurant.php")
    suspend fun loadFavRestaurant(): RestaurantResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("x/set_fav.php")
    suspend fun set_Fav(
        @Field("restaurant_id") restaurantId: Int
    ): FavResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("x/remove_fav.php")
    suspend fun remove_Fav(
        @Field("restaurant_id") restaurantId: Int
    ): FavResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("x/load_restaurant_by_id.php")
    suspend fun loadResById(
        @Field("restaurant_id") restaurantId: Int
    ): RestaurantResponse
}