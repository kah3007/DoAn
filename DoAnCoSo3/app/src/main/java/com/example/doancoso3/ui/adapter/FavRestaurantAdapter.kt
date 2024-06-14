package com.example.doancoso3.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.Restaurant
import com.example.doancoso3.databinding.RestaurantCardBinding
import com.example.doancoso3.ui.fragment.FavoriteFragmentArgs
import com.example.doancoso3.ui.fragment.FavoriteFragmentDirections
import com.example.doancoso3.ui.fragment.HomeFragmentArgs
import com.example.doancoso3.ui.fragment.HomeFragmentDirections
import com.example.doancoso3.ui.viewmodel.FavoriteViewModel
import com.example.doancoso3.ui.viewmodel.HomeViewModel
import com.example.doancoso3.utils.changePage

class FavRestaurantAdapter (
    private val context: Context,
    private var restaurantList: List<Restaurant>,
    private val viewModel: FavoriteViewModel,
    private val args: FavoriteFragmentArgs
) : RecyclerView.Adapter<FavRestaurantAdapter.FavRestaurantViewHolder>() {
    private lateinit var view: View

    inner class FavRestaurantViewHolder(val binding: RestaurantCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavRestaurantViewHolder {
        val binding: RestaurantCardBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context), R.layout.restaurant_card, parent, false
        )
        return FavRestaurantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavRestaurantViewHolder, position: Int) {
        val binding = holder.binding
        val restaurant = restaurantList[position]
        holder.binding.restaurantObject = restaurant

        var isFavorite = restaurant.isFav == 1

//        val url = "https://picsum.photos/200"
//        Glide.with(context).load(url).into(holder.binding.ivFood)

        if (isFavorite) {
            binding.ivFavoriteButton.setImageResource(
                context.resources.getIdentifier(R.drawable.vc_favorite.toString(), "drawable", context.packageName)
            )
        }

        binding.ivFavoriteButton.setOnClickListener {
            if (isFavorite) {
                viewModel.removeFavorite(view,restaurant.id)
                binding.ivFavoriteButton.setImageResource(
                    context.resources.getIdentifier(R.drawable.vc_favorite_border.toString(), "drawable", context.packageName)
                )
            } else {
                viewModel.setFavorite(view, restaurant.id)
                binding.ivFavoriteButton.setImageResource(
                    context.resources.getIdentifier(R.drawable.vc_favorite.toString(), "drawable", context.packageName)
                )
            }

            isFavorite = !isFavorite
        }

        binding.cardRestaurant.setOnClickListener {
            val direction = FavoriteFragmentDirections.actionFavoriteFragmentToRestaurantDetailFragment(restaurant.id, args.username)
            Navigation.changePage(it, direction)
        }
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }
    fun updateRestaurants(newRes: List<Restaurant>){
        restaurantList = newRes
        notifyDataSetChanged()
    }
    fun setView(newView: View) {
        view = newView
    }
}