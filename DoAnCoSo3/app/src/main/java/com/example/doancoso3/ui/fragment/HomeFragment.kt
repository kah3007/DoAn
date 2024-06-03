package com.example.doancoso3.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentHomeBinding
import com.example.doancoso3.ui.adapter.RestaurantAdapter
import com.example.doancoso3.ui.viewmodel.HomeViewModel
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel
    private var isAgainCreate = false
    private lateinit var args: HomeFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        args = HomeFragmentArgs.fromBundle(requireArguments())

        binding.homeViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        setupObservers()
        setupSearchView()

        return binding.root
    }

    private fun setupObservers() {
        viewModel.restaurantList?.observe(viewLifecycleOwner, Observer {
            it?.let { restaurants ->
                binding.restaurantAdapter = RestaurantAdapter(requireContext(), restaurants, viewModel, requireView(), args)
                binding.rvRestaurantCard.setItemViewCacheSize(restaurants.size)
            }
        })
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (!isAgainCreate) {
                    // viewModel.searchFood(query)
                }
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                if (!isAgainCreate) {
                    // viewModel.searchFood(newText)
                }
                return true
            }
        })
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: HomeViewModel by viewModels()
        viewModel = tempViewModel
    }
    override fun onResume() {
        super.onResume()
        if (isAgainCreate) {
            binding.searchView.setQuery("", true)
            binding.restaurantAdapter = null
            viewModel.loadRestaurants()
            isAgainCreate = false
        }
    }


    override fun onPause() {
        super.onPause()
        isAgainCreate = true
    }
}
