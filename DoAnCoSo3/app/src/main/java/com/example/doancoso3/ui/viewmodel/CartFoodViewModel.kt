package com.example.doancoso3.ui.viewmodel

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.Navigation
import com.example.doancoso3.data.DAO.CartFoodDAO
import com.example.doancoso3.data.DAO.FoodDAO
import com.example.doancoso3.data.entity.CartFood
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.data.retrofit.rest
import com.example.doancoso3.ui.fragment.CartFoodFragmentDirections
import com.example.doancoso3.utils.changePage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CartFoodViewModel: ViewModel(){
    var username = ""
    var restaurantId = 0
    private var view: View? = null

    private val _foodList = MutableLiveData<List<Food>>()
    val foodList: MutableLiveData<List<Food>> = _foodList

    private val _cartFoodList = MutableLiveData<List<CartFood>>()
    val cartFoodList: LiveData<List<CartFood>> = _cartFoodList

    private var mApiService: FoodDAO? = rest.client.create(FoodDAO::class.java)
    private var mCartApiService: CartFoodDAO? = rest.client.create(CartFoodDAO::class.java)

    private val _totalPrice = MutableLiveData<String>()
    val totalPrice: MutableLiveData<String> = _totalPrice

    fun loadFoodByCart(username: String, restaurantId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mApiService?.loadFoodByCart(username, restaurantId)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _foodList.postValue(response.foodList)
                    } else {
                    }
                } else {
                    Log.e("CartFoodModel", "Response is null or unsuccessful.")
                }
            } catch (e: Exception) {
                Log.e("CartFoodModel", "Error loading food: ${e.message}")
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
                    }
                } else {
                    Log.e("CartFoodModel", "No response for cart food request.")
                }
            } catch (e: Exception) {
                Log.e("CartFoodModel", "Error loading cart food: ${e.message}")
            }
        }
    }
    fun foodQuantityChange(action: String, tempCartFoodObject: CartFood, food: Food) {
        var cartFoodObject = tempCartFoodObject
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
                        updateCartFoodInList(cartFoodObject)
                        calculateTotalPrice()
                    } else {
                        Log.e("CartFoodModel", "Failed to add cart: ${response.success}")
                    }
                } else {
                    Log.e("CartFoodModel", "No response for cart request.")
                }
            } catch (e: Exception) {
                Log.e("CartFoodModel", "Error adding cart food: ${e.message}")
            }
        }
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
    private fun removeFromFood(cartFoodObject: CartFood) {
        val currentFoods = _foodList.value.orEmpty().toMutableList()
        val index = currentFoods.indexOfFirst { it.foodId == cartFoodObject.foodId }
        if (index != -1) {
            currentFoods.removeAt(index)
            _foodList.postValue(currentFoods)
        }
    }
    fun delete_cart(cartFoodObject: CartFood){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mCartApiService?.deleteCart(cartFoodObject.cartFoodId)
                if (response != null) {
                    if (response.success) {
                        removeFromCart(cartFoodObject)
                        removeFromFood(cartFoodObject)
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
    fun calculateTotalPrice() {
        val cartFoodList = _cartFoodList.value
        val foodList = _foodList.value

        if (cartFoodList != null && foodList != null) {
            val castedCartFoodList = cartFoodList
            val castedFoodList = foodList

            var totalPrice = 0f

            castedCartFoodList.forEach { cartFood ->
                val food = castedFoodList.find { it.foodId == cartFood.foodId }
                if (food != null) {
                    totalPrice += food.foodPrice * cartFood.quantity
                }
            }
            val totalPriceFormatted = String.format("%.3f", totalPrice)

            _totalPrice.postValue(totalPriceFormatted)
        } else {
            Log.e("CartFoodModel", "Error loading cart food: Cart food list or food list is null")
        }
    }


    fun confirmCartTotal() {
        val cartFoodList = _cartFoodList.value
        if (cartFoodList != null) {
            CoroutineScope(Dispatchers.Main).launch {
                try {
                    val response = mCartApiService?.confirmCart(username, restaurantId)
                    if (response != null) {
                        if (response.success) {
                            val direction = CartFoodFragmentDirections.actionCartFoodFragmentToHomeFragment(username)
                            view?.let { Navigation.changePage(it, direction) }
                        } else {
                        }
                    } else {
                        Log.e("CartFoodModel", "No response for cart food request.")
                    }
                } catch (e: Exception) {
                    Log.e("CartFoodModel", "Error loading cart food: ${e.message}")
                }
                    _cartFoodList.value = arrayListOf()
                    _totalPrice.value = ""
            }

        } else {
            Log.e("CartFoodModel", "Error loading cart food: Cart food list or food list is null")
        }
    }
    fun setView(view: View) {
        this.view = view
    }
}