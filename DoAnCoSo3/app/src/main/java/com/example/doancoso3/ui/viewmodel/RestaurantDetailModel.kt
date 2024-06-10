package com.example.doancoso3.ui.viewmodel

import android.util.Log
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
    var username = ""
    var restaurantId = 0

    private val _foodList = MutableLiveData<List<Food>>()
    val foodList: MutableLiveData<List<Food>>? = _foodList

    private val _cartFoodList = MutableLiveData<List<CartFood>>()
    val cartFoodList: LiveData<List<CartFood>> = _cartFoodList

//    private val _addCartStatus = MutableLiveData<Boolean>()
//    val addCartStatus: MutableLiveData<Boolean> = _addCartStatus

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
                        Log.e("RestaurantDetailModel", "Failed to load food: ${response.success}")
                    }
                } else {
                    Log.e("RestaurantDetailModel", "Response is null or unsuccessful.")
                }
            } catch (e: Exception) {
                Log.e("RestaurantDetailModel", "Error loading food: ${e.message}")
            }
        }
    }

    fun loadCartFood(username: String, restaurantId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mCartApiService?.loadCart(username, restaurantId)
                if (response != null) {
                    if (response.success) {
                        _cartFoodList.postValue(response.cartFoods)
                    } else {
                        Log.e(
                            "RestaurantDetailModel",
                            "Failed to load cart food: ${response.success}"
                        )
                    }
                } else {
                    Log.e("RestaurantDetailModel", "No response for cart food request.")
                }
            } catch (e: Exception) {
                Log.e("RestaurantDetailModel", "Error loading cart food: ${e.message}")
            }
        }
    }

    fun loadRestaurant(restaurantId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mRestaurantService?.loadResById(restaurantId)
                if (response != null) {
                    if (response.success) {
                        val restaurant = response.restaurantList?.firstOrNull()
                        if (restaurant != null) {
                            _restaurantObject.postValue(restaurant!!)
                        } else {
                            Log.e("RestaurantDetailModel", "No restaurant found with the given ID.")
                        }
                    } else {
                        Log.e(
                            "RestaurantDetailModel",
                            "Failed to load restaurant: ${response.success}"
                        )
                    }
                } else {
                    Log.e("RestaurantDetailModel", "No response for restaurant request.")
                }
            } catch (e: Exception) {
                Log.e("RestaurantDetailModel", "Error loading restaurant: ${e.message}")
            }
        }
    }

    fun foodQuantityChange(action: String, tempCartFoodObject: CartFood?, food: Food) {
        var cartFoodObject = tempCartFoodObject
        if (cartFoodObject == null) {
            cartFoodObject = CartFood(
                restaurantId = restaurantId,
                username = username,
                foodId = food.foodId,
            )
        }
        when (action) {
            "Decrease" -> {
                if (cartFoodObject.quantity > 1) {
                    cartFoodObject.quantity -= 1
                    cartFoodObject.total = cartFoodObject.quantity * food.foodPrice
                    addToCart(cartFoodObject)
                } else {
                    delete_cart(cartFoodObject)
                }
            }

            "Increase" -> {
                cartFoodObject.quantity += 1
                cartFoodObject.total = cartFoodObject.quantity * food.foodPrice
                addToCart(cartFoodObject)
            }
        }
    }

    fun addToCart(cartFoodObject: CartFood) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mCartApiService?.addToCart(
                    cartFoodObject.cartFoodId,
                    cartFoodObject.restaurantId,
                    cartFoodObject.username,
                    cartFoodObject.foodId,
                    cartFoodObject.quantity,
                    cartFoodObject.total
                )
                if (response != null) {
                    if (response.success) {
                        if (cartFoodObject.cartFoodId == 0) {
                            addNewCartFoodToList(response.cartFoods[0])
                        } else {
                            updateCartFoodInList(response.cartFoods[0])
                        }
                    } else {
                        Log.e("RestaurantDetailModel", "Failed to add cart: ${response.success}")
                    }
                } else {
                    Log.e("RestaurantDetailModel", "No response for cart request.")
                }
            } catch (e: Exception) {
                Log.e("RestaurantDetailModel", "Error adding cart food: ${e.message}")
            }
        }
    }

    private fun addNewCartFoodToList(newCartFood: CartFood) {
        val currentCartFoods = _cartFoodList.value.orEmpty().toMutableList()
        currentCartFoods.add(newCartFood)
        _cartFoodList.postValue(currentCartFoods)
    }

    private fun updateCartFoodInList(updatedCartFood: CartFood) {
        val currentCartFoods = _cartFoodList.value.orEmpty().toMutableList()
        val index = currentCartFoods.indexOfFirst { it.cartFoodId == updatedCartFood.cartFoodId }
        if (index != -1) {
            currentCartFoods[index] = updatedCartFood
            _cartFoodList.postValue(currentCartFoods)
        }
    }
    private fun removeFromCart(cartFoodObject: CartFood) {
        val currentCartFoods = _cartFoodList.value.orEmpty().toMutableList()
        val index = currentCartFoods.indexOfFirst { it.cartFoodId == cartFoodObject.cartFoodId }
        if (index != -1) {
            currentCartFoods.removeAt(index)
            _cartFoodList.postValue(currentCartFoods)
        }
    }
    fun delete_cart(cartFoodObject: CartFood){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mCartApiService?.deleteCart(cartFoodObject.cartFoodId)
                if (response != null) {
                    if (response.success) {
                        removeFromCart(cartFoodObject)
                    } else {
                        Log.e("CartFoodModel", "Failed to delete cart food: ${response.success}")
                    }
                } else {
                    Log.e("CartFoodModel", "No response for cart food request.")
                }
            } catch (e: Exception) {
                Log.e("CartFoodModel", "Error loading cart food: ${e.message}")
            }
        }
    }
}