package com.example.doancoso3.ui.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.doancoso3.utils.changePage
import com.example.doancoso3.ui.fragment.HomeRestaurantFragmentDirections
import com.google.android.material.snackbar.Snackbar

class HomeRestaurantViewModel: ViewModel() {
    fun onClickLogout(view: View){
        Snackbar.make(view, "Do you want to logout ?", Snackbar.LENGTH_SHORT)
            .setAction("Yes") {
                val direction = HomeRestaurantFragmentDirections.actionHomeRestaurantFragmentToLoginFragment()
                Navigation.changePage(view, direction)
            }
            .show()
    }
}
