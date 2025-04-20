package com.avcialper.pagination.data.repository

import com.avcialper.pagination.data.model.Product
import com.avcialper.pagination.data.model.ProductResponse
import kotlinx.coroutines.delay

class ProductRepository {

    companion object {
        const val PAGE_SIZE = 5
        const val PAGE_ITEM_SIZE = 20
        const val DELAY = 2000L
    }

    suspend fun getData(page: Int): ProductResponse {
        /*
            page    startPosition   endPosition
            1       0               19
            2       20              39
            3       40              59
         */
        val startPosition = (page - 1) * PAGE_ITEM_SIZE
        val endPosition = startPosition + PAGE_ITEM_SIZE - 1

        val products = (startPosition..endPosition).map { position ->
            Product(position, "Product $position")
        }

        val nextPage = if (page == PAGE_SIZE) null else page + 1

        // API'dan veri çekme işlemi süresinde oluşan yüklenme durumu simülasyonu
        delay(DELAY)

        return ProductResponse(products, nextPage)
    }

}