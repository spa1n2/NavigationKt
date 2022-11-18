package com.example.navigationkt.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.navigationkt.R
import com.example.navigationkt.databinding.FragmentDetailBinding
import com.example.navigationkt.ui.model.RecyclerModel

class DetailFragment : Fragment() {
    private var binding : FragmentDetailBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
        setUpListener()
    }


    private fun getData() {

        arguments?.let { bundle -> bundle
            val recyclerModel = bundle.getSerializable(BUNDLE_KEY) as RecyclerModel
            binding?.let {
                it.tvSolo.text = recyclerModel.name
                Glide.with(it.ivSolo.context)
                    .load(recyclerModel.imageUrl)
                    .into(it.ivSolo)
            }
        }
    }
    private fun setUpListener() {
        binding?.btnArrow?.setOnClickListener{
            findNavController().navigate(R.id.recyclerFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}