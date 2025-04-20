package com.avcialper.pagination.adapter.footer

import android.view.View
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.avcialper.pagination.databinding.ItemFooterBinding

class FooterViewHolder(private val binding: ItemFooterBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(loadState: LoadState, retry: () -> Unit) = with(binding) {
        when (loadState) {
            is LoadState.Error -> {
                buttonRetry.visibility = View.VISIBLE
                progressBar.visibility = View.GONE
                buttonRetry.setOnClickListener { retry() }
            }

            LoadState.Loading -> {
                buttonRetry.visibility = View.GONE
                progressBar.visibility = View.VISIBLE
            }

            is LoadState.NotLoading -> {
                buttonRetry.visibility = View.GONE
                progressBar.visibility = View.GONE
            }
        }
    }

}