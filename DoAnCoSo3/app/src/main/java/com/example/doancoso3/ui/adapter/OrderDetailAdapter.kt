package com.example.doancoso3.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.data.entity.Order
import com.example.doancoso3.data.entity.OrderDetail
import com.example.doancoso3.data.entity.User
import com.example.doancoso3.databinding.OrderCardBinding
import com.example.doancoso3.databinding.OrderDetailCardBinding
import com.example.doancoso3.ui.fragment.ManageOrderFragmentDirections
import com.example.doancoso3.ui.viewmodel.ManageOrderViewModel
import com.example.doancoso3.ui.viewmodel.OrderDetailViewModel
import com.example.doancoso3.utils.changePage

class OrderDetailAdapter (
    private val context: Context,
    private var foodList: List<Food>,
    private var OrderDetailList: List<OrderDetail>,
) : RecyclerView.Adapter<OrderDetailAdapter.OrderDetailViewHolder>() {

    inner class OrderDetailViewHolder(val binding: OrderDetailCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderDetailViewHolder {
        val binding: OrderDetailCardBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.order_detail_card, parent, false)
        return OrderDetailViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderDetailViewHolder, position: Int) {
        val binding = holder.binding
        val order = OrderDetailList[position]
        val matchingFood = foodList.find { it.foodId == order.foodId }

        binding.foodObject = matchingFood
        binding.orderDetailObject = order
    }

    override fun getItemCount(): Int {
        return OrderDetailList.size
    }
    fun updateOrderDetail(newOrderDetail: List<OrderDetail>){
        OrderDetailList = newOrderDetail
        notifyDataSetChanged()
    }
    fun updateFood(newFood: List<Food>){
        foodList = newFood
        notifyDataSetChanged()
    }
}