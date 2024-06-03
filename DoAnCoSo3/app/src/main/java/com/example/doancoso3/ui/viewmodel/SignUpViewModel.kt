package com.example.doancoso3.ui.viewmodel

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.navigation.Navigation
import com.example.doancoso3.BR
import com.example.doancoso3.R
import com.example.doancoso3.utils.changePage

class SignUpViewModel : BaseObservable() {
    var userData = MutableLiveData<List<String>>()
    // Biến lưu trữ tên người dùng
    @get:Bindable
    var username: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.username)
        }

    // Biến lưu trữ mật khẩu
    @get:Bindable
    var password: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.password)
        }

    // Biến lưu trữ email
    @get:Bindable
    var email: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }
    fun onClickSignUp(){
        if (username.isNotEmpty() && password.isNotEmpty() && email.isNotEmpty()) {
            userData.value = arrayListOf(username, password, email)
        } else {
            userData.value = arrayListOf("")
        }
    }
    fun clickTextView(view: View) {
        Navigation.changePage(view, R.id.action_signUpFragment_to_loginFragment)
    }
}
