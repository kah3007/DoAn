package com.example.doancoso3.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentHomeBinding
import com.example.doancoso3.databinding.FragmentHomeRestaurantBinding
import com.example.doancoso3.ui.adapter.RestaurantAdapter
import com.example.doancoso3.ui.viewmodel.HomeRestaurantViewModel
import com.example.doancoso3.ui.viewmodel.HomeViewModel

class HomeRestaurantFragment : Fragment() {
    private lateinit var binding: FragmentHomeRestaurantBinding
    private lateinit var viewModel: HomeRestaurantViewModel
    private lateinit var args: HomeRestaurantFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_restaurant, container, false)

        viewModel = HomeRestaurantViewModel()
        args = HomeRestaurantFragmentArgs.fromBundle(requireArguments())

        binding.homeResViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }

}