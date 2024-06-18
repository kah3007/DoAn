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
import com.example.doancoso3.databinding.FragmentManageFoodBinding
import com.example.doancoso3.ui.adapter.FoodAdminAdapter
import com.example.doancoso3.ui.viewmodel.ManageFoodViewModel
import com.example.doancoso3.ui.viewmodel.UserInfoViewModel
import com.example.doancoso3.utils.changePage


class ManageFoodFragment : Fragment() {
    private lateinit var binding: FragmentManageFoodBinding
    private lateinit var viewModel: ManageFoodViewModel
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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_manage_food, container, false)

        viewModel = ManageFoodViewModel(requireContext())

        viewModel.username = args.getString("username","" )
        viewModel.loadFood()

        binding.manageFoodViewModel = viewModel
        binding.manageFoodFragment = this
        binding.foodAdminAdapter = FoodAdminAdapter(requireContext(), emptyList(), viewModel)
        binding.lifecycleOwner = viewLifecycleOwner

        setupObservers()
        return binding.root
    }
    private fun setupObservers() {
        viewModel.foodList?.observe(viewLifecycleOwner, Observer { foodList ->
            foodList?.let {
                binding.foodAdminAdapter?.updateFoodList(it)
                if (!viewModel.isViewSet()) {
                    viewModel.setView(requireView())
                }
            }
        })

    }
    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
    fun goToAddFood(view:View){
        val direction = ManageFoodFragmentDirections.actionManageFoodFragmentToAddFoodFragment(args.getString("username","" ))
        Navigation.changePage(view, direction)
    }
}