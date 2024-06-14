package com.example.foodie.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.foodie.R

public class SignUpFragmentDirections private constructor() {
  public companion object {
    public fun actionSignUpFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpFragment_to_loginFragment)

    public fun actionSignUpFragmentToHomePageFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpFragment_to_homePageFragment)
  }
}
