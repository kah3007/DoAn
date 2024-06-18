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
import androidx.lifecycle.ViewModel
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentEditFoodBinding
import com.example.doancoso3.ui.viewmodel.EditFoodViewModel

class EditFoodFragment : Fragment() {
    private lateinit var binding: FragmentEditFoodBinding
    private lateinit var viewModel: EditFoodViewModel
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
    ): View? {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_edit_food, container, false)

        viewModel = EditFoodViewModel(requireContext())
        viewModel.foodId = args.getInt("food_id", 0)
        viewModel.loadLastedFoodInfo(args.getInt("food_id", 0))
        binding.editFoodFragment = this
        binding.editFoodViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        setupObservers()

        return binding.root
    }
    private fun setupObservers() {
        viewModel.foodLastedInfo?.observe(viewLifecycleOwner, Observer { Food ->
            Food?.let {
                val formattedPrice = "${Food.foodPrice}"
                binding.editTextCurrent.setText(Food.foodName)
                binding.editTextNew.setText(Food.foodDescription)
                binding.editTextAgainNew.setText(formattedPrice)
            }
        })
    }
    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
}