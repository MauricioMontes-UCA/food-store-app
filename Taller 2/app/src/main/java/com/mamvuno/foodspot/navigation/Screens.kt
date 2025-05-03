package com.mamvuno.foodspot.navigation

import kotlinx.serialization.Serializable

@Serializable
object _MainScreen

@Serializable
object _BrowseScreen

@Serializable
object  _ShoppingCartScreen

@Serializable
data class _RestaurantScreen(val id: Int)