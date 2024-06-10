package com.example.doancoso3.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.Order
import com.example.doancoso3.data.entity.User
import com.example.doancoso3.databinding.OrderCardBinding
import com.example.doancoso3.ui.viewmodel.ManageOrderViewModel

class OrderAdapter (
    private val context: Context,
    private var orderList: List<Order>,
    private val viewModel: ManageOrderViewModel,
    private val userList: List<User>
) : RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    inner class OrderViewHolder(val binding: OrderCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val binding: OrderCardBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.order_card, parent, false)
        return OrderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val binding = holder.binding
        val order = orderList[position]
        val matchingUser = userList.find { it.username == order.username }

        binding.user = matchingUser
        binding.orderObject = order
        binding.manageOrderViewModel = viewModel
    }

    override fun getItemCount(): Int {
        return orderList.size
    }
}