package com.example.foodie.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.foodie.R
import com.example.foodie.`data`.entity.Food
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

public class HomePageFragmentDirections private constructor() {
  private data class ActionHomePageFragmentToProductDetailFragment(
    public val food: Food,
    public val isFavorite: Boolean,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homePageFragment_to_productDetailFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionHomePageFragmentToProductDetailFragment(food: Food, isFavorite: Boolean):
        NavDirections = ActionHomePageFragmentToProductDetailFragment(food, isFavorite)
  }
}
