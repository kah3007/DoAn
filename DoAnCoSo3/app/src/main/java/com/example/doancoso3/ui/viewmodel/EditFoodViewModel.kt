package com.example.doancoso3.ui.viewmodel
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doancoso3.data.DAO.FoodDAO
import com.example.doancoso3.data.entity.Food
import com.example.doancoso3.data.retrofit.rest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EditFoodViewModel(private val context: Context) : ViewModel() {
    var foodId: Int = 0
    val name = MutableLiveData<String>()
    val description = MutableLiveData<String>()
    val price = MutableLiveData<String>()

    private val _foodLastedInfo = MutableLiveData<Food>()
    val foodLastedInfo: MutableLiveData<Food> = _foodLastedInfo

    private var mFoodService: FoodDAO? = rest.client.create(FoodDAO::class.java)

    fun getPriceAsString(): String {
        return price.value ?: ""
    }

    fun setPriceFromString(priceString: String) {
        price.value = priceString
    }

    fun onUpdateButtonClick() {
        val nameValue = name.value
        val descriptionValue = description.value
        val priceValue = price.value?.toFloatOrNull()

        if (!nameValue.isNullOrEmpty() && !descriptionValue.isNullOrEmpty() && priceValue != null) {
            if (nameValue == foodLastedInfo.value?.foodName &&
                descriptionValue == foodLastedInfo.value?.foodDescription &&
                priceValue == foodLastedInfo.value?.foodPrice) {
                Toast.makeText(context, "It's the same information", Toast.LENGTH_SHORT).show()
            } else {
                viewModelScope.launch(Dispatchers.IO) {
                    try {
                        val response = mFoodService?.updateFoodInfo(
                            foodId = foodId,
                            name = nameValue,
                            description = descriptionValue,
                            price = priceValue
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
        } else {
            Toast.makeText(context, "Please enter all information", Toast.LENGTH_SHORT).show()
        }
    }
    fun loadLastedFoodInfo(foodId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mFoodService?.loadLastedFoodInfo(foodId)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _foodLastedInfo.postValue(response.foodList[0])
                    } else {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "${response?.success}", Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, "${response?.success}", Toast.LENGTH_SHORT).show()
                    }
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Error updating user info: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
