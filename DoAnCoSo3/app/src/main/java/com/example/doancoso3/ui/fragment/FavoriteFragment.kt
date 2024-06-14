package com.example.doancoso3.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentFavoriteBinding
import com.example.doancoso3.ui.adapter.FavRestaurantAdapter
import com.example.doancoso3.ui.viewmodel.FavoriteViewModel

class FavoriteFragment : Fragment() {
    private lateinit var binding: FragmentFavoriteBinding
    private val viewModel: FavoriteViewModel by viewModels()
    private var isAgainCreate = false
    private lateinit var args: FavoriteFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_favorite, container, false)

        args = FavoriteFragmentArgs.fromBundle(requireArguments())

        binding.favModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.restaurantAdapter = FavRestaurantAdapter(requireContext(), emptyList(), viewModel, args)

        setupObservers()
        setupSearchView()

        return binding.root
    }

    private fun setupObservers() {
        viewModel.restaurantList?.observe(viewLifecycleOwner, Observer {
            it?.let { restaurants ->
                binding.restaurantAdapter?.updateRestaurants(restaurants)
                binding.restaurantAdapter?.setView(requireView())
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
}