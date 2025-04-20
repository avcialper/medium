package com.avcialper.pagination.adapter.footer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import com.avcialper.pagination.databinding.ItemFooterBinding

class FooterAdapter(
    private val retry: () -> Unit
) : LoadStateAdapter<FooterViewHolder>() {
    override fun onBindViewHolder(holder: FooterViewHolder, loadState: LoadState) {
        holder.bind(loadState, retry)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): FooterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemFooterBinding.inflate(layoutInflater, parent, false)
        return FooterViewHolder(binding)
    }
}