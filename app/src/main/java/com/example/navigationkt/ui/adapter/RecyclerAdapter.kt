package com.example.navigationkt.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigationkt.databinding.ItemListBinding
import com.example.navigationkt.ui.OnItemClickListener
import com.example.navigationkt.ui.model.RecyclerModel

class RecyclerAdapter(
    private val recyclerList: ArrayList<RecyclerModel>,
    private val listener : OnItemClickListener
): RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>(),View.OnClickListener{

    inner class RecyclerViewHolder (private val binding: ItemListBinding)
        :RecyclerView.ViewHolder(binding.root) {
        fun onBind(recyclerModel: RecyclerModel) {
            Glide.with(binding.ivImage.context)
                .load(recyclerModel.imageUrl)
                .into(binding.ivImage)
            binding.tvName.text = recyclerModel.name
            binding.tvCost.text = recyclerModel.cost
            binding.root.tag = recyclerModel
            binding.mainContainer.setBackgroundColor(Color.parseColor(recyclerModel.color))

        }
    }
    fun setData(model : RecyclerModel){
        recyclerList.add(model)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
       val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context))
        binding.root.setOnClickListener(this)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
      holder.onBind(recyclerList[position])
    }

    override fun getItemCount(): Int {
        return recyclerList.size
    }

    override fun onClick(view : View?) {
        listener.onClick(view?.tag as RecyclerModel)
    }

}