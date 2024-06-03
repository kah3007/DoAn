package com.example.doancoso3.ui.viewmodel
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doancoso3.data.DAO.RestaurantDAO
import com.example.doancoso3.data.entity.Restaurant
import com.example.doancoso3.data.retrofit.rest
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _restaurantList = MutableLiveData<List<Restaurant>>()
    val restaurantList: MutableLiveData<List<Restaurant>>? = _restaurantList
    private var mApiService: RestaurantDAO? = rest.client.create(RestaurantDAO::class.java)

    init {
        loadRestaurants()
    }

    fun loadRestaurants() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mApiService?.loadRestaurant()
                if (response != null && response.success) {
                    if (response.success == true) {
                        _restaurantList.postValue(response.restaurantList)
                    } else {
                        // Handle unsuccessful response
                    }
                } else {
                    // Handle unsuccessful response
                }
            } catch (e: Exception) {
                // Handle exception
            }
        }
    }
    fun setFavorite(view: View, foodId: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            val response = mApiService?.set_Fav(foodId)
            response?.let {
                if (it.success) {
                } else {
                    Snackbar.make(view, it.message, Snackbar.LENGTH_SHORT).show()
                }
            } ?: run {
                Snackbar.make(view, "Failed to update favorite", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
    fun removeFavorite(view: View, foodId: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            CoroutineScope(Dispatchers.Main).launch {
                val response = mApiService?.remove_Fav(foodId)
                response?.let {
                    if (it.success) {
                    } else {
                        Snackbar.make(view, it.message, Snackbar.LENGTH_SHORT).show()
                    }
                } ?: run {
                    Snackbar.make(view, "Failed to update favorite", Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }
}