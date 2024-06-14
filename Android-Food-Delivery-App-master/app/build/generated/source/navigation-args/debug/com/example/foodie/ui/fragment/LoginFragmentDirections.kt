package com.example.foodie.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.foodie.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToSignUpFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_signUpFragment)

    public fun actionLoginFragmentToHomePageFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_homePageFragment)
  }
}
