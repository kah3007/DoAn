package com.example.doancoso3.data.DAO

import com.example.doancoso3.data.entity.ApiResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface UserDAO{
    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/add_user.php")
    fun addUser(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("email") email: String
    ): Call<ApiResponse>

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/check_user.php")
    fun checkUser(
        @Field("username") username: String,
        @Field("password") email: String
    ): Call<ApiResponse>
}