package com.example.foodie.ui.fragment

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.foodie.R
import kotlin.Int
import kotlin.String

public class AccountFragmentDirections private constructor() {
  private data class ActionAccountFragmentToAccountDetailFragment(
    public val action: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_accountFragment_to_accountDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("action", this.action)
        return result
      }
  }

  public companion object {
    public fun actionAccountFragmentToAccountDetailFragment(action: String): NavDirections =
        ActionAccountFragmentToAccountDetailFragment(action)

    public fun actionAccountFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_accountFragment_to_loginFragment)
  }
}
