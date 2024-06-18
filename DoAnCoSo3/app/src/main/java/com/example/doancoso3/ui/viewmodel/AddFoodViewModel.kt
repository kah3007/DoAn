package com.example.doancoso3.ui.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doancoso3.data.DAO.FoodDAO
import com.example.doancoso3.data.retrofit.rest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddFoodViewModel(private val context: Context): ViewModel() {
    var username = ""

    val name = MutableLiveData<String>()
    val description = MutableLiveData<String>()
    val price = MutableLiveData<String>()

    val img = MutableLiveData<String>()

    private var mFoodService: FoodDAO? = rest.client.create(FoodDAO::class.java)

    fun onAddButtonClick(){
        val nameValue = name.value
        val descriptionValue = description.value
        val imgValue = img.value
        val priceValue = price.value?.toFloatOrNull()
        if (!nameValue.isNullOrEmpty() && !descriptionValue.isNullOrEmpty() && !imgValue.isNullOrEmpty() && priceValue != null) {
            viewModelScope.launch(Dispatchers.IO) {
                try {
                    val response = mFoodService?.addFood(
                        name = nameValue,
                        description = descriptionValue,
                        username = username,
                        price = priceValue,
                        img = imgValue
                    )
                    if (response != null && response.success) {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "Update food successfully", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "Failed to update food", Toast.LENGTH_SHORT).show()
                        }
                    }
                } catch (e: Exception) {
                    Log.e("MyOrderViewModel", " Failed to load user: ${e.message}")
                }
            }
        }
        else{
            Toast.makeText(context, "Please enter all information", Toast.LENGTH_SHORT).show()
        }
    }

}