package com.example.doancoso3.ui.viewmodel

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.Navigation
import com.example.doancoso3.data.DAO.FoodDAO
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.data.retrofit.rest
import com.example.doancoso3.ui.fragment.HomeRestaurantFragmentDirections
import com.example.doancoso3.ui.fragment.ManageFoodFragmentDirections
import com.example.doancoso3.utils.changePage
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ManageFoodViewModel(private val context: Context): ViewModel() {
    var username = ""
    private var view: View? = null
    private var isViewSet = false

    private val _foodList = MutableLiveData<List<Food>>()
    val foodList: MutableLiveData<List<Food>>? = _foodList

    private var mApiService: FoodDAO? = rest.client.create(FoodDAO::class.java)

    fun loadFood() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mApiService?.loadFoodAdmin(username)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _foodList.postValue(response.foodList)
                    } else {
                        _foodList.postValue(emptyList())
                    }
                } else {
                    Log.e("ManageFood", "Failed to load food: ${response?.success}")
                }
            } catch (e: Exception) {
                Log.e("ManageFood", "Error loading food: ${e.message}")
            }
        }
    }
    fun onClickDelete(foodId: Int) {
        view?.let {
            Snackbar.make(it, "Do you want to delete ?", Snackbar.LENGTH_SHORT)
                .setAction("Yes") {
                    viewModelScope.launch(Dispatchers.IO) {
                        try {
                            val response = mApiService?.deleteFoodById(foodId)
                            if (response?.success == true) {
                                withContext(Dispatchers.Main) {
                                    Toast.makeText(context, "Delete successfully", Toast.LENGTH_SHORT).show()
                                }
                                loadFood()
                            } else {
                            }
                        } catch (e: Exception) {
                            Log.e("ManageFood", "Error loading food: ${e.message}")
                        }
                    }
                }
                .show()
        }
    }

    fun setView(view: View) {
        this.view = view
        isViewSet = true
    }
    fun isViewSet(): Boolean {
        return isViewSet
    }
}