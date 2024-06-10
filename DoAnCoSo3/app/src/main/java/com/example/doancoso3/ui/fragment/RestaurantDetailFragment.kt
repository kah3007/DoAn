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
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentRestaurantDetailBinding
import com.example.doancoso3.ui.adapter.FoodCardAdapter
import com.example.doancoso3.ui.viewmodel.RestaurantDetailModel
import com.example.doancoso3.utils.changePage
import com.google.android.material.snackbar.Snackbar
class RestaurantDetailFragment : Fragment() {
    private lateinit var binding: FragmentRestaurantDetailBinding
    private val viewModel: RestaurantDetailModel by viewModels()
    private lateinit var args: RestaurantDetailFragmentArgs
    private lateinit var foodAdapter: FoodCardAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_restaurant_detail, container, false)

        args = RestaurantDetailFragmentArgs.fromBundle(requireArguments())

        binding.restaurantDetailModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.restaurantDetailFragment = this

        val restaurantId = args.restaurantId
        val username = args.username

        viewModel.loadFood(restaurantId)
        viewModel.loadCartFood(username, restaurantId)
        viewModel.loadRestaurant(restaurantId)

        viewModel.restaurantId = restaurantId
        viewModel.username = username

        foodAdapter = FoodCardAdapter(requireContext(), emptyList(), viewModel, emptyList())
        binding.foodAdapter = foodAdapter

        setupObservers()
        binding.ivCart.setOnClickListener {
            val direction = RestaurantDetailFragmentDirections.actionRestaurantDetailFragmentToCartFoodFragment(restaurantId, username)
            Navigation.changePage(it, direction)
        }
        return binding.root
    }

    private fun setupObservers() {
        viewModel.restaurantObject.observe(viewLifecycleOwner) { restaurant ->
            restaurant?.let {
                binding.restaurantObject = it
            }
        }
//        viewModel.addCartStatus.observe(viewLifecycleOwner) {
//            if (it) {
//                Snackbar.make(binding.tvRestaurantName, "", Snackbar.LENGTH_SHORT).show()
//            }
//        }
        viewModel.foodList?.observe(viewLifecycleOwner, Observer {
            it?.let { foods ->
                binding.foodAdapter?.updateFoodList(foods)
                binding.rvFoodcard.setItemViewCacheSize(foods.size)
            }
        })
        viewModel.cartFoodList.observe(viewLifecycleOwner, Observer {
            it?.let { cartFoods ->
                binding.foodAdapter?.updateCart(cartFoods)
            }
        })
    }

    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }

}
