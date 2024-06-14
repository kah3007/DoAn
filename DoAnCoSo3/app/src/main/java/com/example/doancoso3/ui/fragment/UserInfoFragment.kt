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
import com.example.doancoso3.databinding.FragmentRestaurantDetailBinding
import com.example.doancoso3.databinding.FragmentUserInfoBinding
import com.example.doancoso3.ui.viewmodel.RestaurantDetailModel
import com.example.doancoso3.ui.viewmodel.UserInfoViewModel
import com.example.doancoso3.utils.changePage

class UserInfoFragment : Fragment() {
    private lateinit var binding: FragmentUserInfoBinding
    private lateinit var viewModel: UserInfoViewModel
    private lateinit var args: UserInfoFragmentArgs
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user_info, container, false)
        args = UserInfoFragmentArgs.fromBundle(requireArguments())

        viewModel = UserInfoViewModel(requireContext())

        viewModel.username = args.username
        viewModel.loadLastedUserInfo(args.username)
        binding.userInfoViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        setupObservers()
        return binding.root
    }
    private fun setupObservers() {
        viewModel.userLastestInfo?.observe(viewLifecycleOwner, Observer { userInfo ->
            userInfo?.let {
                binding.editTextCurrent.setText(userInfo.Address)
                binding.editTextNew.setText(userInfo.Ward)
                binding.editTextAgainNew.setText(userInfo.Note)
            }
        })
    }

}