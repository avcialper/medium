package com.avcialper.pagination

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.avcialper.pagination.data.model.Product
import com.avcialper.pagination.data.repository.ProductRepository
import com.avcialper.pagination.paging.ProductPagingSource
import kotlinx.coroutines.flow.Flow

class ProductViewModel : ViewModel() {

    private val productRepository = ProductRepository()

    fun getProducts(): Flow<PagingData<Product>> {
        return Pager(PagingConfig(5)) {
            ProductPagingSource(productRepository)
        }.flow.cachedIn(viewModelScope)
    }

}