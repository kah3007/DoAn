package com.example.doancoso3.ui.viewmodel

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.navigation.Navigation
import com.example.doancoso3.BR
import com.example.doancoso3.R
import com.example.doancoso3.utils.changePage

class LoginViewModel: BaseObservable() {
    var userData = MutableLiveData<List<String>>()
    @get:Bindable
    var username: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.username)
        }

    @get:Bindable
    var password: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.password)
        }
    fun onClickLogin(){
        if (username.isNotEmpty() && password.isNotEmpty()) {
            userData.value = arrayListOf(username, password)
        } else {
            userData.value = arrayListOf("")
        }
    }
    fun clickTextView(view: View) {
        Navigation.changePage(view, R.id.action_loginFragment_to_signUpFragment)
    }
}