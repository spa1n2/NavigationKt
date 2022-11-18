package com.example.navigationkt.ui.fragments

import android.graphics.ColorSpace.Model
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationkt.R
import com.example.navigationkt.databinding.FragmentRecyclerBinding
import com.example.navigationkt.ui.OnItemClickListener
import com.example.navigationkt.ui.adapter.RecyclerAdapter
import com.example.navigationkt.ui.model.RcyclerRepository
import com.example.navigationkt.ui.model.RecyclerModel

const val BUNDLE_KEY = "s"

class RecyclerFragment : Fragment(), OnItemClickListener {

    private var binding : FragmentRecyclerBinding? = null
    private var recyclerAdapter : RecyclerAdapter? = null
    private val repository = RcyclerRepository()
    private var model : RecyclerModel? = null
    private var list : ArrayList<RecyclerModel>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecyclerBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list =repository.getListRcyclerData()
        initialize()
        setUplIstener()
        arguments?.let {
            recyclerAdapter?.setData(it.getSerializable("OK")as RecyclerModel)
        }
    }

    private fun initialize() {
        recyclerAdapter = RecyclerAdapter(repository.getListRcyclerData() ,this)
        binding?.rvRecyler?.adapter = recyclerAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onClick(recyclerModel: RecyclerModel) {
        val bundle = Bundle()
        bundle.putSerializable( BUNDLE_KEY,recyclerModel)
        findNavController().navigate(R.id.action_recyclerFragment_to_detailFragment,bundle)
    }
    private fun setUplIstener() {
      binding?.btnAdd?.setOnClickListener {
          findNavController().navigate(R.id.addFragment)
      }
    }

}