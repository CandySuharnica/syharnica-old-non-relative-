package com.zakdroid.candysuharnica.model.dbRoom.basket

data class BasketItem(
    val id: Int,
    val productId: Int,
    val name: String,
    val count: Int,
    val imgURL: String,
    val amountWeight: Int,
    val amountPrice: Double
)