package com.avcialper.pagination.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.avcialper.pagination.data.model.Product
import com.avcialper.pagination.data.repository.ProductRepository

class ProductPagingSource(
    private val productRepository: ProductRepository
) : PagingSource<Int, Product>() {

    private var isErrorShowed = false

    override fun getRefreshKey(state: PagingState<Int, Product>): Int? {
        return state.anchorPosition?.let {
            // Kullanıcının en son gördüğü sayfaya ait nextPage ve prevPage verilerini
            // anchorPosition içerisinden alarak kullanılacak page numarası alınabilir.
            //      prevKey == null -> anchorPage ilk sayfa
            //      nextKey == null -> anchorPage son sayfa
            //      prevKey ve nextKey null ise başlangıç sayfası
            val anchorPage = state.closestPageToPosition(it)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Product> {
        return try {
            val page = params.key ?: 1
            val response = productRepository.getData(page)

            if (response.nextPage == 3 && !isErrorShowed) {
                isErrorShowed = true
                throw Exception("Error")
            }

            LoadResult.Page(
                data = response.products,
                prevKey = null, // sadece ileri yönlü pagination
                nextKey = response.nextPage
            )
        } catch (e: Exception) {
            e.printStackTrace()
            LoadResult.Error(e)
        }
    }
}