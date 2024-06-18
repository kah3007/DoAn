package com.example.doancoso3.ui
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.doancoso3.R
import com.example.doancoso3.databinding.ActivityMainBinding
import com.example.doancoso3.ui.fragment.FavoriteFragmentDirections
import com.example.doancoso3.ui.fragment.HomeFragmentDirections
import com.example.doancoso3.ui.fragment.MyOrderFragmentDirections
import com.example.doancoso3.ui.fragment.UserInfoFragment
import com.example.doancoso3.ui.fragment.UserInfoFragmentDirections
import com.example.doancoso3.ui.viewmodel.ShareViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedViewModel: ShareViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedViewModel = ViewModelProvider(this).get(ShareViewModel::class.java)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.favoriteFragment -> {
                    val currentDestination = navController.currentDestination?.id
                    if (currentDestination == R.id.homeFragment) {
                        val action = HomeFragmentDirections.actionHomeFragmentToFavoriteFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    if (currentDestination == R.id.userInfoFragment) {
                        val action = UserInfoFragmentDirections.actionUserInfoFragmentToFavoriteFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    if (currentDestination == R.id.myOrderFragment) {
                        val action = MyOrderFragmentDirections.actionMyOrderFragmentToFavoriteFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }

                    true
                }
                R.id.homeFragment -> {
                    val currentDestination = navController.currentDestination?.id
                    if (currentDestination == R.id.favoriteFragment) {
                        val action = FavoriteFragmentDirections.actionFavoriteFragmentToHomeFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    if (currentDestination == R.id.userInfoFragment) {
                        val action = UserInfoFragmentDirections.actionUserInfoFragmentToHomeFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    if (currentDestination == R.id.myOrderFragment) {
                        val action = MyOrderFragmentDirections.actionMyOrderFragmentToHomeFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    true
                }
                R.id.userInfoFragment ->{
                    val currentDestination = navController.currentDestination?.id
                    if (currentDestination == R.id.homeFragment) {
                        val action = HomeFragmentDirections.actionHomeFragmentToUserInfoFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    if (currentDestination == R.id.favoriteFragment) {
                        val action = FavoriteFragmentDirections.actionFavoriteFragmentToUserInfoFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    if (currentDestination == R.id.myOrderFragment) {
                        val action = MyOrderFragmentDirections.actionMyOrderFragmentToUserInfoFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    true
                }
                R.id.myOrderFragment ->{
                    val currentDestination = navController.currentDestination?.id
                    if (currentDestination == R.id.homeFragment) {
                        val action = HomeFragmentDirections.actionHomeFragmentToMyOrderFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    if (currentDestination == R.id.favoriteFragment) {
                        val action = FavoriteFragmentDirections.actionFavoriteFragmentToMyOrderFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    if (currentDestination == R.id.userInfoFragment) {
                        val action = UserInfoFragmentDirections.actionUserInfoFragmentToMyOrderFragment(sharedViewModel.username)
                        navController.navigate(action)
                    }
                    true
                }
                else -> false
            }
        }
        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id) {
                R.id.loginFragment, R.id.signUpFragment, R.id.homeRestaurantFragment,
                R.id.restaurantDetailFragment, R.id.cartFoodFragment, R.id.manageOrderFragment,
                R.id.manageFoodFragment,R.id.editFoodFragment,R.id.orderDetailFragment,
                R.id.editFoodFragment, R.id.addFoodFragment, R.id.revenueFragment-> binding.bottomNavigationView.visibility = View.GONE
                else -> binding.bottomNavigationView.visibility = View.VISIBLE
            }
        }
    }
}
