package com.example.foodie.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.foodie.`data`.entity.Food
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductDetailFragmentArgs(
  public val food: Food,
  public val isFavorite: Boolean,
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Food::class.java)) {
      result.putParcelable("food", this.food as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Food::class.java)) {
      result.putSerializable("food", this.food as Serializable)
    } else {
      throw UnsupportedOperationException(Food::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putBoolean("isFavorite", this.isFavorite)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Food::class.java)) {
      result.set("food", this.food as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Food::class.java)) {
      result.set("food", this.food as Serializable)
    } else {
      throw UnsupportedOperationException(Food::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("isFavorite", this.isFavorite)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ProductDetailFragmentArgs {
      bundle.setClassLoader(ProductDetailFragmentArgs::class.java.classLoader)
      val __food : Food?
      if (bundle.containsKey("food")) {
        if (Parcelable::class.java.isAssignableFrom(Food::class.java) ||
            Serializable::class.java.isAssignableFrom(Food::class.java)) {
          __food = bundle.get("food") as Food?
        } else {
          throw UnsupportedOperationException(Food::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__food == null) {
          throw IllegalArgumentException("Argument \"food\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"food\" is missing and does not have an android:defaultValue")
      }
      val __isFavorite : Boolean
      if (bundle.containsKey("isFavorite")) {
        __isFavorite = bundle.getBoolean("isFavorite")
      } else {
        throw IllegalArgumentException("Required argument \"isFavorite\" is missing and does not have an android:defaultValue")
      }
      return ProductDetailFragmentArgs(__food, __isFavorite)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductDetailFragmentArgs {
      val __food : Food?
      if (savedStateHandle.contains("food")) {
        if (Parcelable::class.java.isAssignableFrom(Food::class.java) ||
            Serializable::class.java.isAssignableFrom(Food::class.java)) {
          __food = savedStateHandle.get<Food?>("food")
        } else {
          throw UnsupportedOperationException(Food::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__food == null) {
          throw IllegalArgumentException("Argument \"food\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"food\" is missing and does not have an android:defaultValue")
      }
      val __isFavorite : Boolean?
      if (savedStateHandle.contains("isFavorite")) {
        __isFavorite = savedStateHandle["isFavorite"]
        if (__isFavorite == null) {
          throw IllegalArgumentException("Argument \"isFavorite\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"isFavorite\" is missing and does not have an android:defaultValue")
      }
      return ProductDetailFragmentArgs(__food, __isFavorite)
    }
  }
}
