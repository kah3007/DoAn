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
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentManageOrderBinding
import com.example.doancoso3.ui.adapter.OrderAdapter
import com.example.doancoso3.ui.adapter.OrderHistoryAdminAdapter
import com.example.doancoso3.ui.viewmodel.ManageOrderViewModel

class ManageOrderFragment : Fragment() {
    private lateinit var binding: FragmentManageOrderBinding
    private val viewModel: ManageOrderViewModel by viewModels()
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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_manage_order, container, false)
        viewModel.loadOrder(args.getString("username","" ))
        viewModel.username = args.getString("username","" )
        viewModel.loadOrderHistory()

        binding.manageOrderViewModel = viewModel
        binding.orderHistoryAdminAdapter = OrderHistoryAdminAdapter(requireContext(), emptyList(), emptyList(), viewModel = viewModel)
        binding.orderAdapter = OrderAdapter(requireContext(), emptyList(), viewModel, emptyList())
        binding.manageOrderFragment = this
        binding.lifecycleOwner = viewLifecycleOwner

        setupObservers()
        return binding.root
    }
    private fun setupObservers() {
        viewModel.orderList?.observe(viewLifecycleOwner, Observer {
            it?.let { orders ->
                binding.orderAdapter?.updateOrder(orders)
                binding.rvOrder.setItemViewCacheSize(orders.size)
            }
        })
        viewModel.userList?.observe(viewLifecycleOwner, Observer{
            it?.let{users ->
                binding.orderAdapter?.updateUser(users)
                binding.orderHistoryAdminAdapter?.updateUser(users)
            }
        })
        viewModel.orderHistory?.observe(viewLifecycleOwner, Observer{
            it?.let { ordershistory ->
                binding.orderHistoryAdminAdapter?.updateOrder(ordershistory)
                binding.rvOrderHistory.setItemViewCacheSize(ordershistory.size)
            }
        })
    }

    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
}