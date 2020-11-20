package com.eman.trudocapp.presentation.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.eman.trudocapp.R
import com.eman.trudocapp.domain.model.Business
import com.eman.trudocapp.databinding.ItemBusinessBinding
import com.eman.trudocapp.presentation.NavigationListener

class MainBusinessAdapter(
    private var businesses: ArrayList<Business>,
    var listener: NavigationListener
) :
    RecyclerView.Adapter<MainBusinessAdapter.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding = DataBindingUtil.inflate<ItemBusinessBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_business,
            parent,
            false
        )
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = businesses.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.binding.businessApi = businesses.get(position)
        holder.binding.listener = listener
    }

    class DataViewHolder(val binding: ItemBusinessBinding) : RecyclerView.ViewHolder(binding.root)

    fun addData(list: ArrayList<Business>) {
        businesses=(list)
    }


}