package com.example.doancoso3.ui.viewmodel

import android.view.View
import androidx.databinding.BaseObservable
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.doancoso3.R
import com.example.doancoso3.utils.changePage
import androidx.databinding.ObservableField

class HomeRestaurantViewModel: BaseObservable() {

    fun onClickManageFood() {
    }
    fun onClickManageOrder(view: View) {
        val manageOrderDestinationId = R.id.action_homeRestaurantFragment_to_manageOrderFragment
        Navigation.changePage(view, manageOrderDestinationId)
    }

}
