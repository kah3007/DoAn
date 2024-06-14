package com.example.doancoso3.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.doancoso3.R
import com.example.doancoso3.databinding.CartCardBinding
import com.example.doancoso3.databinding.FragmentCartFoodBinding
import com.example.doancoso3.databinding.FragmentRestaurantDetailBinding
import com.example.doancoso3.ui.adapter.CartCardAdapter
import com.example.doancoso3.ui.adapter.FoodCardAdapter
import com.example.doancoso3.ui.viewmodel.CartFoodViewModel
import com.example.doancoso3.ui.viewmodel.RestaurantDetailModel
import com.example.doancoso3.utils.changePage
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CartFoodFragment : Fragment() {
    private lateinit var binding: FragmentCartFoodBinding
    private val viewModel: CartFoodViewModel by viewModels()
    private lateinit var args: CartFoodFragmentArgs
    private lateinit var cartAdapter: CartCardAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cart_food, container, false)

        args = CartFoodFragmentArgs.fromBundle(requireArguments())

        binding.cartFoodModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.cartFoodFragment = this

        val restaurantId = args.restaurantId
        val username = args.username

        viewModel.loadFoodByCart(username, restaurantId)
        viewModel.loadCartFood(username, restaurantId)
        viewModel.restaurantId = restaurantId
        viewModel.username = username

        cartAdapter = CartCardAdapter(requireContext(), emptyList(), viewModel, emptyList())
        binding.cartAdapter = cartAdapter

        setupObservers()

        return binding.root
    }
    private fun setupObservers() {
        viewModel.foodList?.observe(viewLifecycleOwner, Observer { foods ->
            if (foods.isNotEmpty()) {
                binding.cartAdapter?.updateFoodList(foods)
                binding.rvCartCard.setItemViewCacheSize(foods.size)
                viewModel.calculateTotalPrice()
            }
        })
        viewModel.cartFoodList.observe(viewLifecycleOwner, Observer { cartFoods ->
            if (cartFoods.isNotEmpty()) {
                binding.cartAdapter?.updateCart(cartFoods)
                viewModel.calculateTotalPrice()
            }
        })
        viewModel.totalPrice.observe(viewLifecycleOwner) {
            binding.totalPrice = it
        }
    }
    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
    fun confirmCartTotal() {
        viewModel.setView(requireView())
        Snackbar.make(binding.tvRestaurantName, "Bạn muốn xác nhận đặt hàng không ?", Snackbar.LENGTH_SHORT)
            .setAction("Có") {
                CoroutineScope(Dispatchers.Main).launch {
                    viewModel.confirmCartTotal()
                }
            }
            .show()
    }
}