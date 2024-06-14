package com.example.doancoso3.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.doancoso3.R
import com.example.doancoso3.data.entity.Restaurant
import com.example.doancoso3.databinding.RestaurantCardBinding
import com.example.doancoso3.ui.fragment.HomeFragmentArgs
import com.example.doancoso3.ui.fragment.HomeFragmentDirections
import com.example.doancoso3.ui.viewmodel.HomeViewModel
import com.example.doancoso3.utils.changePage
import com.google.android.gms.tasks.Task
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import java.io.File
import java.io.IOException

class RestaurantAdapter(
    private val context: Context,
    private var restaurantList: List<Restaurant>,
    private val viewModel: HomeViewModel,
    private val args: HomeFragmentArgs
) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {
    private lateinit var view: View
    private val storageReference = FirebaseStorage.getInstance().reference // Initialize storageReference
    inner class RestaurantViewHolder(val binding: RestaurantCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val binding: RestaurantCardBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context), R.layout.restaurant_card, parent, false
        )
        return RestaurantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val binding = holder.binding
        val restaurant = restaurantList[position]
        holder.binding.restaurantObject = restaurant

        var isFavorite = restaurant.isFav == 1

        val imagePath = restaurant.img
        if (imagePath != null && imagePath.isNotEmpty()) {
            val storageRef = storageReference.child(imagePath)

            // Create a temporary file to store the downloaded image
            val tempFile: File
            try {
                tempFile = File.createTempFile("image", "jpg")
            } catch (e: IOException) {
                e.printStackTrace()
                return
            }

            storageRef.getFile(tempFile).addOnCompleteListener { task: Task<FileDownloadTask.TaskSnapshot?> ->
                if (task.isSuccessful) {
                    Glide.with(context)
                        .load(tempFile)
                        .into(holder.binding.ivFood)
                } else {
                    // Handle failures
                    Log.e("TAG", "Failed to download file: ${task.exception}")
                }
            }
        } else {
        }

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
            val direction = HomeFragmentDirections.actionHomeFragmentToRestaurantDetailFragment(restaurant.id, args.username)
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
