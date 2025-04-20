package com.avcialper.pagination.data.model

data class ProductResponse(
    val products: List<Product>,
    val nextPage: Int?
)