package com.example.foodie.ui.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AccountDetailFragmentArgs(
  public val action: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("action", this.action)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("action", this.action)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AccountDetailFragmentArgs {
      bundle.setClassLoader(AccountDetailFragmentArgs::class.java.classLoader)
      val __action : String?
      if (bundle.containsKey("action")) {
        __action = bundle.getString("action")
        if (__action == null) {
          throw IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue")
      }
      return AccountDetailFragmentArgs(__action)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AccountDetailFragmentArgs {
      val __action : String?
      if (savedStateHandle.contains("action")) {
        __action = savedStateHandle["action"]
        if (__action == null) {
          throw IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue")
      }
      return AccountDetailFragmentArgs(__action)
    }
  }
}
