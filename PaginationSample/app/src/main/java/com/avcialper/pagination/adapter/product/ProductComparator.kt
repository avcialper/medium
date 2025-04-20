package com.avcialper.pagination.adapter.product

import androidx.recyclerview.widget.DiffUtil
import com.avcialper.pagination.data.model.Product

class ProductComparator : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }
}