package com.example.doancoso3.ui.adapter

import android.annotation.SuppressLint
import com.example.doancoso3.databinding.OrderAdminCardBinding
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.Order
import com.example.doancoso3.data.entity.User
import com.example.doancoso3.utils.changePage
import com.example.doancoso3.ui.fragment.ManageOrderFragmentDirections
import com.example.doancoso3.ui.fragment.RevenueFragmentDirections
import com.example.doancoso3.ui.viewmodel.ManageOrderViewModel
import com.example.doancoso3.ui.viewmodel.RevenueViewModel
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
class OrderHistoryAdminAdapter (
    private val context: Context,
    private var orderList: List<Order>,
    private var userList: List<User>,
    private val viewModel: ManageOrderViewModel? = null,
    private val viewModel2: RevenueViewModel? = null
) : RecyclerView.Adapter<OrderHistoryAdminAdapter.OrderHistoryAdminViewHolder>() {

    private var filteredOrderList: List<Order> = orderList.toList()

    inner class OrderHistoryAdminViewHolder(val binding: OrderAdminCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderHistoryAdminViewHolder {
        val binding: OrderAdminCardBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.order_admin_card, parent, false)
        return OrderHistoryAdminViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderHistoryAdminViewHolder, position: Int) {
        val binding = holder.binding
        val order = filteredOrderList[position] // Use filteredOrderList instead of orderList
        val matchingUser = userList.find { it.username == order.username }

        binding.user = matchingUser
        binding.orderObject = order
        binding.manageOrderViewModel = viewModel
        binding.revenueViewModel = viewModel2 // Ensure to set both view models if they are present

        binding.orderAdminCard.setOnClickListener {
            val direction = if (viewModel != null) {
                ManageOrderFragmentDirections.actionManageOrderFragmentToOrderDetailFragment(orderID = order.orderId, username = matchingUser!!.username, restaurantId = order.restaurantId)
            } else {
                RevenueFragmentDirections.actionRevenueFragmentToOrderDetailFragment(orderID = order.orderId, username = matchingUser!!.username, restaurantId = order.restaurantId)

            }
            Navigation.findNavController(it).navigate(direction)
            Log.e("ManageOrder", "${order.orderId} ${matchingUser!!.username}")
        }
    }

    override fun getItemCount(): Int {
        return filteredOrderList.size
    }

    fun updateOrder(newOrder: List<Order>) {
        orderList = newOrder
        filteredOrderList = newOrder
        notifyDataSetChanged()
    }

    fun updateUser(newUserList: List<User>) {
        userList = newUserList
        notifyDataSetChanged()
    }
    fun filterOrdersByDate(dateText: String) {
        filteredOrderList = orderList.filter { getDateOrderText(it) == dateText }
        notifyDataSetChanged()
    }

    fun filterOrdersByMonth(monthText: String) {
        filteredOrderList = orderList.filter { getMonthOrderText(it) == monthText }
        notifyDataSetChanged()
    }

    fun filterOrdersByYear(yearText: String) {
        filteredOrderList = orderList.filter { getYearOrderText(it) == yearText }
        notifyDataSetChanged()
    }

    private fun getDateOrderText(order: Order): String {
        val orderDateTime = order.orderDate
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return formatDate(orderDateTime, dateFormat, "dd/MM/yyyy")
    }

    private fun getMonthOrderText(order: Order): String {
        val orderDateTime = order.orderDate
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return formatDate(orderDateTime, dateFormat, "MM/yyyy")
    }

    private fun getYearOrderText(order: Order): String {
        val orderDateTime = order.orderDate
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return formatDate(orderDateTime, dateFormat, "yyyy")
    }

    private fun formatDate(orderDateTime: String, dateFormat: SimpleDateFormat, pattern: String): String {
        try {
            val date = dateFormat.parse(orderDateTime)
            val calendar = Calendar.getInstance()
            calendar.time = date ?: Date()

            val dateFormatter = SimpleDateFormat(pattern, Locale.getDefault())
            return dateFormatter.format(calendar.time)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ""
    }

    fun getTotalPrice(): Float {
        var totalPrice = 0f
        filteredOrderList.forEach { order ->
            totalPrice += order.totalPrice
        }
        return totalPrice
    }
}
