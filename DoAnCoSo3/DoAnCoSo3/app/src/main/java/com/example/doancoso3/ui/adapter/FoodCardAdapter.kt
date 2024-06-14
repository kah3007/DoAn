package com.example.doancoso3.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.CartFood
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.databinding.FoodCardBinding
import com.example.doancoso3.ui.viewmodel.RestaurantDetailModel

class FoodCardAdapter (
    private val context: Context,
    private var foodList: List<Food>,
    private val viewModel: RestaurantDetailModel,
    private var cartFoodObject: List<CartFood>,
) : RecyclerView.Adapter<FoodCardAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(val binding: FoodCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding: FoodCardBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context), R.layout.food_card, parent, false
        )
        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val binding = holder.binding
        val food = foodList[position]
        val matchingCartItem = cartFoodObject.find { it.foodId == food.foodId }

        binding.foodObject = food
        binding.restaurantDetailModel = viewModel
        binding.cartFoodObject = matchingCartItem ?: null
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    fun updateFoodList(newFoodList: List<Food>) {
        foodList = newFoodList
        notifyDataSetChanged()
    }
    fun updateCart(newCart: List<CartFood>){
        cartFoodObject = newCart
        notifyDataSetChanged()
    }
}
