package com.example.foodie.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.foodie.R

public class FavoritesFragmentDirections private constructor() {
  public companion object {
    public fun actionFavoritesFragmentToCartFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favoritesFragment_to_cartFragment)
  }
}
