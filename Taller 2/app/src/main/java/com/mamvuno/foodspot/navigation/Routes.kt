package com.mamvuno.foodspot.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

data class TopLevelRoute<T: Any>(
    val name: String,
    val route: T,
    val icon: ImageVector
)

val topLevelRoutes = listOf(
    TopLevelRoute("Main", _MainScreen, Icons.Default.Home),
    TopLevelRoute("Browse", _BrowseScreen, Icons.Default.Menu),
    TopLevelRoute("Cart", _ShoppingCartScreen, Icons.Default.ShoppingCart),
)