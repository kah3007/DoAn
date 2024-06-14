package com.example.doancoso3.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doancoso3.data.DAO.OrderDAO
import com.example.doancoso3.data.DAO.RestaurantDAO
import com.example.doancoso3.data.DAO.UserDAO
import com.example.doancoso3.data.entity.Order
import com.example.doancoso3.data.entity.Restaurant
import com.example.doancoso3.data.entity.User
import com.example.doancoso3.data.retrofit.rest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyOderViewModel: ViewModel() {
    var username = ""

    private val _orderList = MutableLiveData<List<Order>>()
    val orderList: MutableLiveData<List<Order>> = _orderList

    private val _orderHistory = MutableLiveData<List<Order>>()
    val orderHistory: MutableLiveData<List<Order>> = _orderHistory

    private val _restaurantList = MutableLiveData<List<Restaurant>>()
    val restaurantList: LiveData<List<Restaurant>> = _restaurantList

    private var mOrderService: OrderDAO? = rest.client.create(OrderDAO::class.java)
    private var mResService: RestaurantDAO? = rest.client.create(RestaurantDAO::class.java)

    fun loadOrder(){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mOrderService?.loadOrderByUsername(username)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _orderList.postValue(response.orderList!!)
                    } else {
                        _orderList.postValue(emptyList())
                    }
                } else {
                    _orderList.postValue(emptyList())
                }
            } catch (e: Exception) {
                Log.e("MyOrderViewModel", "Failed to load order: ${e}")
            }
        }
    }
    fun loadOrderHistory(){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mOrderService?.loadOrderHistoryByUsername(username)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _orderHistory.postValue(response.orderList!!)
                    } else {
                        _orderHistory.postValue(emptyList())
                    }
                } else {
                    _orderHistory.postValue(emptyList())
                }
            } catch (e: Exception) {
                Log.e("MyOrderViewModel", "Failed to load order: ${e}")
            }
        }
    }
    fun loadRes(){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mResService?.loadRestaurant()
                if (response != null && response.success) {
                    if (response.success == true) {
                        _restaurantList.postValue(response.restaurantList!!)
                    } else {
                        Log.e("MyOrderViewModel", " Failed to load user: ${response.success}")
                    }
                } else {
                    Log.e("MyOrderViewModel", " Failed to load user: ${response!!.success}")
                }
            } catch (e: Exception) {
                Log.e("MyOrderViewModel", "Failed to load user: ${e}")
            }
        }
    }
    fun getButtonActionText(order: Order): String {
        return if (order.status == 0) {
            "Waitting for submit..."
        }else if(order.status == 1){
            "Order was submitted"
        }else if(order.status == 2){
            "Order is delivering"
        }else{
            "Completed"
        }
    }
}