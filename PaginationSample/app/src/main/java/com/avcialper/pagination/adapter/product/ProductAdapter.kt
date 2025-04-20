package com.avcialper.pagination.adapter.product

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.avcialper.pagination.data.model.Product
import com.avcialper.pagination.databinding.ItemProductBinding

class ProductAdapter(
    diffUtil: DiffUtil.ItemCallback<Product>
) : PagingDataAdapter<Product, ProductViewHolder>(diffUtil) {
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = getItem(position)
        holder.bind(product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemProductBinding.inflate(layoutInflater, parent, false)
        return ProductViewHolder(binding)
    }
}