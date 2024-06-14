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
import androidx.navigation.Navigation
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentOrderDetailUserBinding
import com.example.doancoso3.ui.adapter.OrderDetailAdapter
import com.example.doancoso3.ui.viewmodel.OrderDetailUserViewModel
import com.example.doancoso3.utils.changePage

class OrderDetailUserFragment : Fragment() {
    private lateinit var binding: FragmentOrderDetailUserBinding
    private val viewModel: OrderDetailUserViewModel by viewModels()
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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_order_detail_user, container, false)

        viewModel.loadOrderDetail(args.getInt("orderID", 0))
        viewModel.loadFood(args.getInt("restaurantId",0))
        viewModel.loadOrder(args.getInt("orderID", 0))

        binding.orderDetailUserViewModel = viewModel
        binding.orderDetailUserFragment = this
        binding.orderDetailAdapter = OrderDetailAdapter(requireContext(), emptyList(), emptyList())
        binding.lifecycleOwner = viewLifecycleOwner
        setupObservers()

        return binding.root
    }
    private fun setupObservers() {
        viewModel.orderDetailList?.observe(viewLifecycleOwner, Observer {
            it?.let { orderdetail ->
                binding.orderDetailAdapter?.updateOrderDetail(orderdetail)
                binding.rvOrderDetail.setItemViewCacheSize(orderdetail.size)
            }
        })
        viewModel.foodList?.observe(viewLifecycleOwner, Observer{
            it?.let{foods ->
                binding.orderDetailAdapter?.updateFood(foods)
            }
        })
        viewModel.order?.observe(viewLifecycleOwner, Observer{
            it?.let{order ->
                binding.orderObject = order
            }
        })
    }
    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
}