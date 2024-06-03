package com.example.doancoso3.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doancoso3.data.DAO.CartFoodDAO
import com.example.doancoso3.data.DAO.FoodDAO
import com.example.doancoso3.data.DAO.RestaurantDAO
import com.example.doancoso3.data.entity.CartFood
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.data.entity.Restaurant
import com.example.doancoso3.data.retrofit.rest
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RestaurantDetailModel: ViewModel() {
    private val _foodList = MutableLiveData<List<Food>>()
    val foodList: MutableLiveData<List<Food>>? = _foodList

    private val _cartFoodObject = MutableLiveData<CartFood>()
    val cartFoodObject: MutableLiveData<CartFood> = _cartFoodObject

    private val _addCartStatus = MutableLiveData<Boolean>()
    val addCartStatus: MutableLiveData<Boolean> = _addCartStatus

    private val _restaurantObject = MutableLiveData<Restaurant>()
    val restaurantObject: LiveData<Restaurant> = _restaurantObject

    private var mApiService: FoodDAO? = rest.client.create(FoodDAO::class.java)
    private var mCartApiService: CartFoodDAO? = rest.client.create(CartFoodDAO::class.java)
        private var mRestaurantService: RestaurantDAO? = rest.client.create(RestaurantDAO::class.java)

    fun loadFood(restaurantId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mApiService?.loadFood(restaurantId)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _foodList.postValue(response.foodList)
                    } else {
                    }
                } else {
                }
            } catch (e: Exception) {
            }
        }
    }
    fun loadCartFood(username: String, restaurantId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mCartApiService?.loadCart(username, restaurantId)
                if (response != null) {
                    if (response.success) {
                        _cartFoodObject.postValue(response.cartFoods)
                    } else {
                        // Xử lý khi không thành công
                    }
                } else {
                    // Xử lý khi không có phản hồi
                }
            } catch (e: Exception) {
                // Xử lý ngoại lệ
            }
        }
    }
    fun loadRestaurant(restaurantId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mRestaurantService?.loadResById(restaurantId)
                if (response != null) {
                    if (response.success) {
                        if (response.restaurantList.isNotEmpty()) {
                            _restaurantObject.postValue(response.restaurantList[0])
                        } else {
                        }
                    } else {
                    }
                } else {
                }
            } catch (e: Exception) {
            }
        }
    }
    fun foodQuantityChange(action: String, tempCartFoodObject: CartFood) {
        when (action) {
            "Decrease" -> {
                if (tempCartFoodObject.quantity != 1) {
                    tempCartFoodObject.quantity -= 1
                }
            }

            "Increase" -> {
                tempCartFoodObject.quantity += 1
            }
        }
//        tempCartFoodObject.foodPrice = tempCartFoodObject.foodQuantity * foodPrice

        addToCart(tempCartFoodObject)

        _cartFoodObject.value = tempCartFoodObject
    }
    fun addToCart(CartFood: CartFood) {
        CoroutineScope(Dispatchers.Main).launch {
//            mApiService.addToCart(CartFood.foodName, CartFood.foodImageName, CartFood.foodPrice, CartFood.foodQuantity, CartFood.username)
            _addCartStatus.value = true
        }
    }
}