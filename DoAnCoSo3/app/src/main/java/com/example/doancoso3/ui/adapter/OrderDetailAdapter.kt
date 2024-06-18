package com.example.doancoso3.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.data.entity.OrderDetail
import com.example.doancoso3.databinding.OrderDetailCardBinding
import com.google.android.gms.tasks.Task
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.IOException

class OrderDetailAdapter (
    private val context: Context,
    private var foodList: List<Food>,
    private var OrderDetailList: List<OrderDetail>,
) : RecyclerView.Adapter<OrderDetailAdapter.OrderDetailViewHolder>() {
    private val storageReference = FirebaseStorage.getInstance().reference

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

        val imagePath = matchingFood?.img
        if (imagePath != null && imagePath.isNotEmpty()) {
            val storageRef = storageReference.child(imagePath)

            // Create a temporary file to store the downloaded image
            val tempFile: File
            try {
                tempFile = File.createTempFile("image", "jpg")
            } catch (e: IOException) {
                e.printStackTrace()
                return
            }

            storageRef.getFile(tempFile).addOnCompleteListener { task: Task<FileDownloadTask.TaskSnapshot?> ->
                if (task.isSuccessful) {
                    Glide.with(context)
                        .load(tempFile)
                        .into(holder.binding.ivFood)
                } else {
                    // Handle failures
                    Log.e("TAG", "Failed to download file: ${task.exception}")
                }
            }
        } else {
        }
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