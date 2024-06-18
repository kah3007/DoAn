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
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.databinding.FoodAdminCardBinding
import com.example.doancoso3.ui.fragment.ManageFoodFragmentDirections
import com.example.doancoso3.ui.viewmodel.ManageFoodViewModel
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.IOException

class FoodAdminAdapter (
    private val context: Context,
    private var foodList: List<Food>,
    private val viewModel: ManageFoodViewModel,
) : RecyclerView.Adapter<FoodAdminAdapter.FoodAdminViewHolder>() {
    private val storageReference = FirebaseStorage.getInstance().reference
    inner class FoodAdminViewHolder(val binding: FoodAdminCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdminViewHolder {
        val binding: FoodAdminCardBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context), R.layout.food_admin_card, parent, false
        )
        return FoodAdminViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodAdminViewHolder, position: Int) {
        val binding = holder.binding
        val food = foodList[position]
        val imagePath = food.img

        if (imagePath != null && imagePath.isNotEmpty()) {
            val storageRef = storageReference.child(imagePath)

            val tempFile: File
            try {
                tempFile = File.createTempFile("image", "jpg")
            } catch (e: IOException) {
                e.printStackTrace()
                return
            }

            storageRef.getFile(tempFile).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Glide.with(context)
                        .load(tempFile)
                        .into(binding.ivFood)
                } else {
                    // Handle failures
                    Log.e("TAG", "Failed to download file: ${task.exception}")
                }
            }
        }

        binding.foodObject = food
        binding.manageFoodViewModel = viewModel

        binding.buttonEdit.setOnClickListener {
            val direction = ManageFoodFragmentDirections.actionManageFoodFragmentToEditFoodFragment(food.foodId, food.foodRestaurantId)
            Navigation.findNavController(it).navigate(direction)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    fun updateFoodList(newFoodList: List<Food>) {
        foodList = newFoodList
        notifyDataSetChanged()
    }
}
