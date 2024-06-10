package com.example.doancoso3.utils

import android.content.Context
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

fun Navigation.changePage(view: View, id: Int) {
    findNavController(view).navigate(id)
}

fun Navigation.changePage(view: View, id: NavDirections) {
    findNavController(view).navigate(id)
}