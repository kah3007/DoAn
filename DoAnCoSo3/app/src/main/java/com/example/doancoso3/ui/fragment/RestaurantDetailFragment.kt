package com.example.doancoso3.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.CartFood
import com.example.doancoso3.databinding.FragmentRestaurantDetailBinding
import com.example.doancoso3.ui.adapter.FoodCardAdapter
import com.example.doancoso3.ui.viewmodel.RestaurantDetailModel
import com.google.android.material.snackbar.Snackbar

class RestaurantDetailFragment : Fragment() {
    private lateinit var binding: FragmentRestaurantDetailBinding
    private val viewModel: RestaurantDetailModel by viewModels() // Khởi tạo viewModel sử dụng viewModels delegate
    private lateinit var args: RestaurantDetailFragmentArgs
    private lateinit var foodAdapter: FoodCardAdapter // Khai báo adapter là một thuộc tính của fragment
    private lateinit var cartFoodObject: CartFood // Khởi tạo cartFoodObject

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_restaurant_detail, container, false)

        val url = "https://picsum.photos/200"
        Glide.with(this).load(url).into(binding.ivDetailRestaurant)

        args = RestaurantDetailFragmentArgs.fromBundle(requireArguments())

        binding.restaurantDetailModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        val restaurantId = args.restaurantId
        val username = args.username

        Log.d("AdapterData", "Adapter foodList: $restaurantId")

        viewModel.loadFood(restaurantId)
        viewModel.loadCartFood(username, restaurantId)
        viewModel.loadRestaurant(restaurantId)

        viewModel.cartFoodObject.observe(viewLifecycleOwner, Observer {
            cartFoodObject = it
            foodAdapter = FoodCardAdapter(requireContext(), emptyList(), viewModel, cartFoodObject)
            binding.rvFoodcard.adapter = foodAdapter
        })
        setupObservers()
        return binding.root
    }

    private fun setupObservers() {
        viewModel.restaurantObject.observe(viewLifecycleOwner) { restaurant ->
            restaurant?.let {
                binding.restaurantObject = it
            }
        }

        viewModel.addCartStatus.observe(viewLifecycleOwner) {
            if (it) {
                Snackbar.make(binding.tvRestaurantName, "", Snackbar.LENGTH_SHORT).show()
            }
        }

        viewModel.foodList?.observe(viewLifecycleOwner, Observer {
            it?.let { foods ->
                foodAdapter.updateFoodList(foods) // Cập nhật danh sách món ăn trong adapter khi dữ liệu thay đổi
                binding.rvFoodcard.setItemViewCacheSize(foods.size)
                Log.d("AdapterData", "Adapter foodList: $foods")
            }
        })
    }

    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
}
