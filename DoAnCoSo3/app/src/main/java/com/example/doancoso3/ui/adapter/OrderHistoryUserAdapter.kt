package com.example.doancoso3.ui.adapter
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.Order
import com.example.doancoso3.data.entity.Restaurant
import com.example.doancoso3.databinding.OrderUserCardBinding
import com.example.doancoso3.ui.fragment.MyOrderFragmentDirections
import com.example.doancoso3.ui.viewmodel.MyOderViewModel
import com.example.doancoso3.utils.changePage
import com.google.android.gms.tasks.Task
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.IOException

class OrderHistoryUserAdapter (
    private val context: Context,
    private var orderList: List<Order>,
    private var restaurantList: List<Restaurant>,
    private val viewModel: MyOderViewModel? = null,
) : RecyclerView.Adapter<OrderHistoryUserAdapter.OrderHistoryViewHolder>() {

    private val storageReference = FirebaseStorage.getInstance().reference

    inner class OrderHistoryViewHolder(val binding: OrderUserCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderHistoryViewHolder {
        val binding: OrderUserCardBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.order_user_card, parent, false)
        return OrderHistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderHistoryViewHolder, position: Int) {
        val binding = holder.binding
        val order = orderList[position]
        val matchingRes = restaurantList.find { it.id == order.restaurantId }

        if (matchingRes != null) {
            val imagePath = matchingRes.img
            if (imagePath != null && imagePath.isNotEmpty()) {
                val storageRef = storageReference.child(imagePath)
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
                            .into(holder.binding.ivRestaurant)
                    } else {
                        // Handle image download failure
                        Log.e("TAG", "Failed to download file: ${task.exception}")
                    }
                }
            }

            binding.restaurantObject = matchingRes
            binding.orderObject = order
            binding.myOrderViewModel = viewModel
            binding.orderUserCard.setOnClickListener {
                val direction = MyOrderFragmentDirections.actionMyOrderFragmentToOrderDetailUserFragment(orderID = order.orderId, restaurantId = order.restaurantId)
                Navigation.changePage(it, direction)
            }
        } else {
            Log.e("TAG", "No matching restaurant found for orderId ${order.orderId}")
        }
    }

    override fun getItemCount(): Int {
        return orderList.size
    }

    fun updateOrder(newOrder: List<Order>) {
        orderList = newOrder
        notifyDataSetChanged()
    }

    fun updateRestaurants(newRestaurants: List<Restaurant>) {
        restaurantList = newRestaurants
        notifyDataSetChanged()
    }
}
