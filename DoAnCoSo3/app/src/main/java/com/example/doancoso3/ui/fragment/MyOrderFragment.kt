package com.example.doancoso3.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentMyOrderBinding
import com.example.doancoso3.databinding.FragmentOrderDetailBinding
import com.example.doancoso3.ui.adapter.OrderAdapter
import com.example.doancoso3.ui.adapter.OrderHistoryUserAdapter
import com.example.doancoso3.ui.adapter.OrderUserAdapter
import com.example.doancoso3.ui.viewmodel.MyOderViewModel

class MyOrderFragment : Fragment() {
    private lateinit var binding: FragmentMyOrderBinding
    private val viewModel: MyOderViewModel by viewModels()
    private lateinit var args: Bundle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            args = it
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_order, container, false)

        viewModel.username = args.getString("username","")
        viewModel.loadOrder()
        viewModel.loadOrderHistory()
        viewModel.loadRes()
        binding.myOderViewModel = viewModel
        binding.orderHistoryUserAdapter = OrderHistoryUserAdapter(requireContext(), emptyList(), emptyList(), viewModel)
        binding.orderUserAdapter = OrderUserAdapter(requireContext(), emptyList(), emptyList(), viewModel)
        binding.myOrderFragment = this
        binding.lifecycleOwner = viewLifecycleOwner

        setupObservers()

        return binding.root
    }
    private fun setupObservers() {
        viewModel.orderList?.observe(viewLifecycleOwner, Observer {
            it?.let { orders ->
                binding.orderUserAdapter?.updateOrder(orders)
                binding.rvOrder.setItemViewCacheSize(orders.size)
            }
        })
        viewModel.orderHistory?.observe(viewLifecycleOwner, Observer{
            it?.let { ordershistory ->
                binding.orderHistoryUserAdapter?.updateOrder(ordershistory)
                binding.rvOrderHistory.setItemViewCacheSize(ordershistory.size)
            }
        })
        viewModel.restaurantList?.observe(viewLifecycleOwner, Observer{
            it?.let{restaurants ->
                binding.orderUserAdapter?.updateRestaurants(restaurants)
                binding.orderHistoryUserAdapter?.updateRestaurants(restaurants)
            }
        })
    }
    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
}