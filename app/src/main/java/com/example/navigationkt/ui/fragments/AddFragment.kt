package com.example.navigationkt.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.navigationkt.R
import com.example.navigationkt.databinding.FragmentAddBinding
import com.example.navigationkt.ui.model.RecyclerModel

class AddFragment : Fragment() {

    private var binding: FragmentAddBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpListener()
        val bundle : Bundle
    }

    private fun setUpListener() {
        binding?.btnOk?.setOnClickListener {
            val url = binding?.etImage?.text.toString().trim()
            val name = binding?.etName?.text.toString()
            val cost = binding?.etCost?.text.toString()
            val color = binding?.etColor?.text.toString()
            val bundle = Bundle()

            if (url.isEmpty() && name.isEmpty() && cost.isEmpty() && color.isEmpty()) {
                binding?.etImage?.error = "URL is empty"
                binding?.etName?.error = "Name is empty"
                binding?.etCost?.error = "Cost is empty"
                binding?.etColor?.error = "Color is empty"
            } else if (url.isEmpty()) {
                binding?.etImage?.error = "Add URL"
            } else if (name.isEmpty()) {
                binding?.etName?.error = "Add name"
            } else if (cost.isEmpty()) {
                binding?.etCost?.error = "Cost is empty"
            } else if (color.isEmpty()) {
                binding?.etColor?.error = "Color is empty"
            } else {
                val model = RecyclerModel(url, name, cost, color)
                bundle.putSerializable("OK", model)
                findNavController().navigate(R.id.recyclerFragment,bundle)

            }
        }
    }
}