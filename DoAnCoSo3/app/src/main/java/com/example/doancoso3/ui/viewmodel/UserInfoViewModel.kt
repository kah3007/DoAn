package com.example.doancoso3.ui.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doancoso3.data.DAO.UserDAO
import com.example.doancoso3.data.entity.Order
import com.example.doancoso3.data.entity.UserInfo
import com.example.doancoso3.data.retrofit.rest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class UserInfoViewModel(private val context: Context): ViewModel() {
    var username: String = ""
    var address: String = ""
    var ward: String = ""
    var note: String = ""

    private val _userLastestInfo = MutableLiveData<UserInfo>()
    val userLastestInfo: MutableLiveData<UserInfo> = _userLastestInfo

    private var mUserService: UserDAO? = rest.client.create(UserDAO::class.java)

    fun onUpdateButtonClick() {
        if (address.isNotEmpty() && ward.isNotEmpty() && note.isNotEmpty()) {
            if(address == userLastestInfo.value!!.Address && ward == userLastestInfo.value!!.Ward && note == userLastestInfo.value!!.Note){
                Toast.makeText(context, "Its the same information", Toast.LENGTH_SHORT).show()
            }
            else{
                viewModelScope.launch(Dispatchers.IO) {
                    try {
                        val response = mUserService?.updateUserInfo(username = username, address = address, ward = ward, note = note)
                        if (response != null && response.success) {
                            if (response.success == true) {
                                withContext(Dispatchers.Main) {
                                    Toast.makeText(context, "User info updated successfully", Toast.LENGTH_SHORT).show()
                                }
                            } else {
                                withContext(Dispatchers.Main) {
                                    Toast.makeText(context, "${response?.message}", Toast.LENGTH_SHORT).show()
                                }                        }
                        } else {
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "${response?.message}", Toast.LENGTH_SHORT).show()
                            }
                        }
                    } catch (e: Exception) {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "Error updating user info: ${e.message}", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        } else {
            Toast.makeText(context, "Please enter all information", Toast.LENGTH_SHORT).show()
        }
    }
    fun loadLastedUserInfo(username: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = mUserService?.loadLastestUserInfo(username = username)
                if (response != null && response.success) {
                    if (response.success == true) {
                        _userLastestInfo.postValue(response.userInfo)
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
