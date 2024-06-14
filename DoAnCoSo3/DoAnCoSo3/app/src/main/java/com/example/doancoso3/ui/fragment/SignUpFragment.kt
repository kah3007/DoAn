package com.example.doancoso3.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.doancoso3.R
import com.example.doancoso3.data.DAO.UserDAO
import com.example.doancoso3.databinding.FragmentSignUpBinding
import com.example.doancoso3.ui.viewmodel.SignUpViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.example.doancoso3.data.entity.ApiResponse
import com.example.doancoso3.data.entity.User
import com.example.doancoso3.data.retrofit.rest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpFragment : Fragment() {

    private var mApiService: UserDAO? = null
    private lateinit var viewModel: SignUpViewModel
    private lateinit var mFragmentSignUpBinding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mApiService = rest.client.create(UserDAO::class.java)

        mFragmentSignUpBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_sign_up, container, false
        )
        mFragmentSignUpBinding.isSignUp = false
        viewModel = SignUpViewModel()

        mFragmentSignUpBinding.signUpViewModel = viewModel
        mFragmentSignUpBinding.lifecycleOwner = viewLifecycleOwner

        viewModel.userData.observe(viewLifecycleOwner) { userData ->
            if (userData[0].isEmpty()) {
                Snackbar.make(mFragmentSignUpBinding.tvSignUp, "Vui lòng điền tất cả thông tin!", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(mFragmentSignUpBinding.tvSignUp, "Bạn có xác nhận việc đăng kí không?", Snackbar.LENGTH_SHORT)
                    .setAction("Có") {
                        CoroutineScope(Dispatchers.Main).launch {
                            val newUser = User(username = userData[0], password = userData[1], email = userData[2])
                            try {
                                val callCreate = mApiService!!.addUser(newUser.username, newUser.password, newUser.email)
                                callCreate.enqueue(object : Callback<ApiResponse> {
                                    override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                                        if (response.isSuccessful) {
                                            val apiResponse = response.body()
                                            if (apiResponse != null) {
                                                if (apiResponse.message != null) {
                                                    mFragmentSignUpBinding.isSignUp = true
                                                    CoroutineScope(Dispatchers.Main).launch {
                                                        delay(2000)
                                                        Navigation.findNavController(mFragmentSignUpBinding.root).navigate(R.id.action_signUpFragment_to_loginFragment)
                                                    }
                                                } else if (apiResponse.error != null) {
                                                    Snackbar.make(mFragmentSignUpBinding.tvSignUp, apiResponse.error, Snackbar.LENGTH_SHORT).show()
                                                }
                                            } else {
                                                Snackbar.make(mFragmentSignUpBinding.tvSignUp, "Unexpected error", Snackbar.LENGTH_SHORT).show()
                                            }
                                        } else {
                                            val errorBody = response.errorBody()?.string()
                                            Log.e("Error", "Error response body: $errorBody")
                                            Snackbar.make(mFragmentSignUpBinding.tvSignUp, "Error: $errorBody", Snackbar.LENGTH_SHORT).show()
                                        }
                                    }

                                    override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                                        Log.e("Error", "Error response body: ${t.message}")
                                        Snackbar.make(mFragmentSignUpBinding.tvSignUp, "Error: ${t.message}", Snackbar.LENGTH_SHORT).show()
                                    }
                                })
                            } catch (e: Exception) {
                                Snackbar.make(mFragmentSignUpBinding.tvSignUp, "Error: ${e.message}", Snackbar.LENGTH_SHORT).show()
                            }
                        }
                    }
                    .show()
            }
        }

        return mFragmentSignUpBinding.root
    }
}