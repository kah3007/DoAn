package com.example.doancoso3.data.DAO

import com.example.doancoso3.data.entity.OrderDetailResponse
import com.example.doancoso3.data.entity.OrderResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface OrderDAO {
    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_order_admin_by_username.php")
    suspend fun loadOrderAdminByUsername(
        @Field("username") username: String
    ): OrderResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_order_admin_history_by_username.php")
    suspend fun loadOrderAdminHistoryByUsername(
        @Field("username") username: String
    ): OrderResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_order_by_username.php")
    suspend fun loadOrderByUsername(
        @Field("username") username: String
    ): OrderResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_order_history_by_username.php")
    suspend fun loadOrderHistoryByUsername(
        @Field("username") username: String
    ): OrderResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_order_by_id.php")
    suspend fun loadOrderByID(
        @Field("order_id") orderId: Int,
    ): OrderResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/update_status.php")
    suspend fun updateStatus(
        @Field("order_id") orderId: Int,
        ): OrderResponse

    @Headers("Accept: application/json; charset=utf-8")
    @FormUrlEncoded
    @POST("/x/load_order_detail_by_id.php")
    suspend fun loadOrderDetail(
        @Field("order_id") orderId: Int,
    ): OrderDetailResponse
}