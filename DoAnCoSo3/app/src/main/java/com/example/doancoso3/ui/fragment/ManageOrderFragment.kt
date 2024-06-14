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
import com.example.doancoso3.ui.viewmodel.ManageOrderViewModel

class ManageOrderFragment : Fragment() {
    private lateinit var binding: FragmentManageOrderBinding
    private val viewModel: ManageOrderViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_manage_order, container, false)

        binding.manageOrderViewModel = viewModel
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
            }
        })
    }

    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
}