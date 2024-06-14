package com.example.foodie.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.foodie.R

public class ProductDetailFragmentDirections private constructor() {
  public companion object {
    public fun actionProductDetailFragmentToCartFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_productDetailFragment_to_cartFragment)
  }
}
