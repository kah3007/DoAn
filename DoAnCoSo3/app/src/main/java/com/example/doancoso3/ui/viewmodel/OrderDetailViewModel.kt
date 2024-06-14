package com.example.doancoso3.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doancoso3.data.DAO.FoodDAO
import com.example.doancoso3.data.DAO.OrderDAO
import com.example.doancoso3.data.DAO.UserDAO
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.data.entity.Order
import com.example.doancoso3.data.entity.OrderDetail
import com.example.doancoso3.data.entity.UserInfo
import com.example.doancoso3.data.retrofit.rest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OrderDetailViewModel: ViewModel() {
    private val _foodList = MutableLiveData<List<Food>>()
    val foodList: MutableLiveData<List<Food>>? = _foodList

    private val _orderDetailList = MutableLiveData<List<OrderDetail>>()
    val orderDetailList: MutableLiveData<List<OrderDetail>>? = _orderDetailList

    private val _order = MutableLiveData<Order>()
    val order: MutableLiveData<Order> = _order

    private val _userInfo = MutableLiveData<UserInfo>()
    val userInfo: MutableLiveData<UserInfo> = _userInfo

    private val _orderStatus = MutableLiveData<Int>()
    val orderStatus: MutableLiveData<Int> = _orderStatus

    private var mApiService: FoodDAO? = rest.client.create(FoodDAO::class.java)
    private var mUserService: UserDAO? = rest.client.create(UserDAO::class.java)
    private var mOrderService: OrderDAO? = rest.client.create(OrderDAO::class.java)
    fun loadOrderDetail(orderID: Int){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mOrderService?.loadOrderDetail(orderID)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _orderDetailList.postValue(response.orderDetailList)
                    } else {
                        Log.e("OrderDetailViewModel", "Failed to load food: ${response.success}")
                    }
                } else {
                    Log.e("OrderDetailViewModel", "Response is null or unsuccessful.")
                }
            } catch (e: Exception) {
                Log.e("OrderDetailViewModel", "Error loading food: ${e.message}")
            }
        }
    }
    fun loadUserInfo(username: String){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mUserService?.loadLastestUserInfo(username)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _userInfo.postValue(response.userInfo)
                    } else {
                        Log.e("ManageOrder", " Failed to load order: ${response.success}")
                    }
                } else {
                    Log.e("ManageOrder", " Failed to load order: ${response!!.success}")
                }
            } catch (e: Exception) {
                Log.e("ManageOrder", "Failed to load order: ${e}")
            }
        }
    }
    fun loadFood(restaurantId: Int){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mApiService?.loadFood(restaurantId)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _foodList.postValue(response.foodList)
                    } else {
                        Log.e("OrderDetailViewModel", "Failed to load food: ${response.success}")
                    }
                } else {
                    Log.e("OrderDetailViewModel", "Response is null or unsuccessful.")
                }
            } catch (e: Exception) {
                Log.e("OrderDetailViewModel", "Error loading food: ${e.message}")
            }
        }
    }
    fun updateStatus(order: Order){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mOrderService?.updateStatus(order.orderId)
                if (response != null && response.success) {
                    if (response.success == true) {
                        loadOrder(order.orderId)
                    } else {
                        Log.e("ManageOrder", " Failed to update order: ${response.success}")
                    }
                } else {
                    Log.e("ManageOrder", " Failed to update order: ${response!!.success}")
                }
            } catch (e: Exception) {
                Log.e("ManageOrder", "Failed to update order: ${e}")
            }
        }
    }
    fun getButtonActionText(order: Order): String {
        return if (order.status == 0) {
            "Receive Order"
        }else if(order.status == 1){
            "Delivery"
        }else{
            "Delivery was done"
        }
    }
    fun loadOrder(orderID: Int){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mOrderService?.loadOrderByID(orderID)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _order.postValue(response.orderList[0]!!)
                        _orderStatus.postValue(response.orderList[0]!!.status)
                    } else {
                        Log.e("ManageOrder", " Failed to load order: ${response.success}")
                    }
                } else {
                    Log.e("ManageOrder", " Failed to load order: ${response!!.success}")
                }
            } catch (e: Exception) {
                Log.e("ManageOrder", "Failed to load order: ${e}")
            }
        }
    }
}