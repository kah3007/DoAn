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
import com.example.doancoso3.databinding.FragmentOrderDetailBinding
import com.example.doancoso3.ui.adapter.OrderDetailAdapter
import com.example.doancoso3.ui.viewmodel.OrderDetailViewModel
import com.example.doancoso3.utils.changePage

class OrderDetailFragment : Fragment() {
    private lateinit var binding: FragmentOrderDetailBinding
    private val viewModel: OrderDetailViewModel by viewModels()
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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_order_detail, container, false)

        viewModel.loadOrderDetail(args.getInt("orderID", 0))
        viewModel.loadUserInfo(args.getString("username",""))
        viewModel.loadFood(args.getInt("restaurantId",0))
        viewModel.loadOrder(args.getInt("orderID", 0))
        binding.orderDetailViewModel = viewModel
        binding.orderDetailFragment = this
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
        viewModel.orderStatus?.observe(viewLifecycleOwner, Observer{
            it?.let{orderStatus ->
                if(orderStatus == 3){
                    val direction = OrderDetailFragmentDirections.actionOrderDetailFragmentToManageOrderFragment()
                    Navigation.changePage(requireView(), direction)
                }
            }
        })
        viewModel.userInfo?.observe(viewLifecycleOwner, Observer{
            it?.let { userInfo ->
                binding.tvAddress.text = "Address: " + userInfo.Address
                binding.tvWard.text = "Ward: " +userInfo.Ward
                binding.tvNote.text = "Note for driver: " + userInfo.Note
            }
        })
    }
    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
}
