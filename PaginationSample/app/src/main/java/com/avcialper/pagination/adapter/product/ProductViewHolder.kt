package com.avcialper.pagination.adapter.product

import androidx.recyclerview.widget.RecyclerView
import com.avcialper.pagination.data.model.Product
import com.avcialper.pagination.databinding.ItemProductBinding

class ProductViewHolder(
    private val binding: ItemProductBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(product: Product?) {
        binding.textName.text = product?.name ?: "pagination"
    }

}