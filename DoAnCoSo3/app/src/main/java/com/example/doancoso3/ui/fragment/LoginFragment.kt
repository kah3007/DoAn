package com.example.doancoso3.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.doancoso3.R
import com.example.doancoso3.data.DAO.UserDAO
import com.example.doancoso3.data.entity.ApiResponse
import com.example.doancoso3.data.retrofit.rest
import com.example.doancoso3.databinding.FragmentLoginBinding
import com.example.doancoso3.ui.viewmodel.LoginViewModel
import com.example.doancoso3.ui.viewmodel.ShareViewModel
import com.example.doancoso3.utils.changePage
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var viewModel: LoginViewModel
    private var mApiService: UserDAO? = null
    private val sharedViewModel: ShareViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mApiService = rest.client.create(UserDAO::class.java)
        val appContext = requireContext()
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        viewModel = LoginViewModel()
        binding.isSignIn = false

        binding.loginViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.userData.observe(viewLifecycleOwner) { userData ->
            when (userData[0]) {
                "" -> {
                    Toast.makeText(appContext, "Tạo tài khoản thất bại", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    CoroutineScope(Dispatchers.Main).launch {
                        val callCreate = mApiService!!.checkUser(userData[0], userData[1])
                        callCreate.enqueue(object : Callback<ApiResponse>{
                            override fun onResponse(
                                call: Call<ApiResponse>,
                                response: Response<ApiResponse>
                            ) {
                                if (response.isSuccessful) {
                                    val apiResponse = response.body()
                                    if (apiResponse != null) {
                                        if (apiResponse.message != null) {
                                            binding.isSignIn = true
                                            sharedViewModel.username = userData[0]
                                            CoroutineScope(Dispatchers.Main).launch {
                                                delay(2000)
                                                val direction = if(apiResponse.message == 0){
                                                    LoginFragmentDirections.actionLoginFragmentToHomeFragment(userData[0])
                                                } else if(apiResponse.message == 1){
                                                    LoginFragmentDirections.actionLoginFragmentToHomeRestaurantFragment(userData[0])
                                                } else {
                                                    null
                                                }
                                                direction?.let { Navigation.changePage(requireView(), it) }
                                            }
                                        } else if (apiResponse.error != null) {
                                            Snackbar.make(binding.tvLogin, apiResponse.error, Snackbar.LENGTH_SHORT).show()
                                        }
                                    } else {
                                        Snackbar.make(binding.tvLogin, "Unexpected error", Snackbar.LENGTH_SHORT).show()
                                    }
                                } else {
                                    val errorBody = response.errorBody()?.string()
                                    Snackbar.make(binding.tvLogin, "Error: $errorBody", Snackbar.LENGTH_SHORT).show()
                                }
                            }

                            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                                Snackbar.make(binding.tvLogin, "Error: ${t.message}", Snackbar.LENGTH_SHORT).show()
                            }

                        })
                    }
                }
            }
        }
        return binding.root
    }
}
