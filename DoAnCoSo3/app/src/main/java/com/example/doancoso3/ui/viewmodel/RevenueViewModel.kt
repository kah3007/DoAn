package com.example.doancoso3.ui.viewmodel

import android.content.Context
import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doancoso3.data.DAO.OrderDAO
import com.example.doancoso3.data.DAO.UserDAO
import com.example.doancoso3.data.entity.Order
import com.example.doancoso3.data.entity.User
import com.example.doancoso3.data.retrofit.rest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class RevenueViewModel(private val context: Context): ViewModel() {
    var username = ""
    val hintText = ObservableField<String>("")

    val _total = MutableLiveData<Float>()
    val total: MutableLiveData<Float> = _total

    private val _orderHistory = MutableLiveData<List<Order>>()
    val orderHistory: MutableLiveData<List<Order>> = _orderHistory

    private val _userList = MutableLiveData<List<User>>()
    val userList: LiveData<List<User>> = _userList

    private var mOrderService: OrderDAO? = rest.client.create(OrderDAO::class.java)
    private var mUserService: UserDAO? = rest.client.create(UserDAO::class.java)

    init {
        loadUser()
    }
    fun loadOrderHistory(){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mOrderService?.loadOrderAdminHistoryByUsername(username)
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
                Log.e("ManageOrder", "Failed to load order history: ${e}")
            }
        }
    }
    fun loadUser(){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mUserService?.loadUser()
                if (response != null && response.success) {
                    if (response.success == true) {
                        _userList.postValue(response.userList!!)
                    } else {
                        Log.e("ManageOrder", " Failed to load user: ${response.success}")
                    }
                } else {
                    Log.e("ManageOrder", " Failed to load user: ${response!!.success}")
                }
            } catch (e: Exception) {
                Log.e("ManageOrder", "Failed to load user: ${e}")
            }
        }
    }
    fun updateHintText(selectedOption: String) {
        hintText.set(
            when (selectedOption) {
                "Date" -> "DD/MM/YYYY"
                "Month" -> "MM/YYYY"
                "Year" -> "YYYY"
                else -> ""
            }
        )
    }
    fun getButtonActionText(order: Order): String {
        return if (order.status == 0) {
            "Receive Order"
        }else if(order.status == 1){
            "Delivery"
        }else if(order.status == 2){
            "Delivery was done"
        }
        else{
            "Completed"
        }
    }
    fun getTimeOrderText(order: Order): String {
        val orderDateTime = order.orderDate
        val timeString = orderDateTime.substringAfterLast(' ')
        return timeString
    }
    fun getDateOrderText(order: Order): String {
        val orderDateTime = order.orderDate
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())

        try {
            val date = dateFormat.parse(orderDateTime)
            val calendar = Calendar.getInstance()
            calendar.time = date ?: Date()

            val dateFormatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            return dateFormatter.format(calendar.time)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ""
    }
}