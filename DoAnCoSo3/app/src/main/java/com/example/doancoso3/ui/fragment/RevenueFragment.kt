package com.example.doancoso3.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.doancoso3.R
import com.example.doancoso3.databinding.FragmentRevenueBinding
import com.example.doancoso3.ui.adapter.OrderHistoryAdminAdapter
import com.example.doancoso3.ui.viewmodel.RevenueViewModel
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale

class RevenueFragment : Fragment(), AdapterView.OnItemSelectedListener {
    private lateinit var binding: FragmentRevenueBinding
    private lateinit var viewModel: RevenueViewModel
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
    ): View {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.bg_page)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_revenue, container, false)

        viewModel = RevenueViewModel(requireContext())
        viewModel.username = args.getString("username","" )

        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.loadOrderHistory()

        binding.orderHistoryAdminAdapter = OrderHistoryAdminAdapter(requireContext(), emptyList(), emptyList(), viewModel2 = viewModel)
        binding.revenueFragment = this
        binding.revenueViewModel = viewModel

        setupSpinner()
        setupObservers()

        return binding.root
    }

    private fun setupSpinner() {
        val spinner: Spinner = binding.unit
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.unit,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        spinner.onItemSelectedListener = this
    }

    private fun setupObservers() {
        viewModel.orderHistory?.observe(viewLifecycleOwner, Observer{
            it?.let { ordershistory ->
                binding.orderHistoryAdminAdapter?.updateOrder(ordershistory)
                binding.rvOrder.setItemViewCacheSize(ordershistory.size)
            }
        })
        viewModel.userList?.observe(viewLifecycleOwner, Observer{
            it?.let{users ->
                binding.orderHistoryAdminAdapter?.updateUser(users)
            }
        })
        viewModel.total.observe(viewLifecycleOwner, Observer{
            it?.let { total->
                binding.total = it.toString()
            }
        })
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val selectedOption = parent?.getItemAtPosition(position).toString()
        viewModel.updateHintText(selectedOption)
        when (selectedOption) {
            "Date" -> filterByDate()
            "Month" -> filterByMonth()
            "Year" -> filterByYear()

        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

    private fun filterByDate() {
        val currentDate = binding.date.text.toString().trim()
        if (isValidDateFormat(currentDate, "dd/MM/yyyy")) {
            binding.orderHistoryAdminAdapter?.filterOrdersByDate(currentDate)
            viewModel._total.postValue(binding.orderHistoryAdminAdapter?.getTotalPrice())
        } else {
            Toast.makeText(requireContext(), "Invalid date format. Please enter DD/MM/YYYY", Toast.LENGTH_SHORT).show()
        }
    }

    private fun filterByMonth() {
        val currentMonth = binding.date.text.toString().trim()

        if (isValidDateFormat(currentMonth, "MM/yyyy")) {
            binding.orderHistoryAdminAdapter?.filterOrdersByMonth(currentMonth)
            viewModel._total.postValue(binding.orderHistoryAdminAdapter?.getTotalPrice())
        } else {
            Toast.makeText(requireContext(), "Invalid month format. Please enter MM/YYYY", Toast.LENGTH_SHORT).show()
        }
    }
    private fun filterByYear() {
        val currentYear = binding.date.text.toString().trim()

        if (isValidDateFormat(currentYear, "yyyy")) {
            binding.orderHistoryAdminAdapter?.filterOrdersByYear(currentYear)
            viewModel._total.postValue(binding.orderHistoryAdminAdapter?.getTotalPrice())
        } else {
            Toast.makeText(requireContext(), "Invalid month format. Please enter YYYY", Toast.LENGTH_SHORT).show()
        }
    }
    private fun isValidDateFormat(dateString: String, format: String): Boolean {
        return try {
            SimpleDateFormat(format, Locale.getDefault()).parse(dateString)
            true
        } catch (e: ParseException) {
            false
        }
    }
    fun goToPreviousPage() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }

}
