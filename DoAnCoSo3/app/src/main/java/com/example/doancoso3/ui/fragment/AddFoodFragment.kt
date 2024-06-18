package com.example.doancoso3.ui.fragment

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentAddFoodBinding
import com.example.doancoso3.ui.viewmodel.AddFoodViewModel
import com.google.firebase.storage.FirebaseStorage
import java.util.*

class AddFoodFragment : Fragment() {
    private lateinit var binding: FragmentAddFoodBinding
    private lateinit var viewModel: AddFoodViewModel

    private val PICK_IMAGE_REQUEST = 1
    private var imageUri: Uri? = null
    private lateinit var args: Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            args = it
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_food, container, false)

        viewModel = AddFoodViewModel(requireContext())
        viewModel.username = args.getString("username","" )

        binding.addFoodFragment = this
        binding.addFoodViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.imageView.setOnClickListener {
            openFileChooser()
        }

        binding.buttonAdd.setOnClickListener {
            uploadImageToFirebase()
        }

        return binding.root
    }

    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }

    private fun openFileChooser() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.data != null) {
            imageUri = data.data
            binding.imageView.setImageURI(imageUri)
        }
    }

    private fun uploadImageToFirebase() {
        if (imageUri != null) {
            val fileName = UUID.randomUUID().toString()
            val storageReference = FirebaseStorage.getInstance().getReference("images/$fileName")

            storageReference.putFile(imageUri!!)
                .addOnSuccessListener {
                    storageReference.downloadUrl.addOnSuccessListener { uri ->
                        val imageUrl = uri.toString()
                        viewModel.img.postValue(imageUrl)
                        viewModel.onAddButtonClick()
                    }
                }
                .addOnFailureListener { e ->
                    Toast.makeText(requireContext(), "Failed to upload image: ${e.message}", Toast.LENGTH_SHORT).show()
                }
        } else {
            Toast.makeText(requireContext(), "No file selected", Toast.LENGTH_SHORT).show()
        }
    }
}
