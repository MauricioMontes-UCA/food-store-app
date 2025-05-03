package com.mamvuno.foodspot.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.mamvuno.foodspot.data.restaurants
import com.mamvuno.foodspot.ui.screens.BrowseScreen
import com.mamvuno.foodspot.ui.screens.MainScreen
import com.mamvuno.foodspot.ui.screens.RestaurantScreen
import com.mamvuno.foodspot.ui.screens.ShoppingCartScreen

@Composable
fun NavigationHost(scaffoldPaddingValues: PaddingValues) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = _MainScreen
    ) {
        composable<_MainScreen>{
            MainScreen(
                navController = navController,
                scaffoldPaddingValues = scaffoldPaddingValues
            )
        }
        composable<_BrowseScreen>{
            BrowseScreen(
                navController = navController,
                scaffoldPaddingValues = scaffoldPaddingValues
            )
        }
        composable<_ShoppingCartScreen> {
            ShoppingCartScreen(
                navController = navController,
                scaffoldPaddingValues = scaffoldPaddingValues
            )
        }
        composable<_RestaurantScreen> {
            backStackEntry -> val args = backStackEntry.toRoute<_RestaurantScreen>()
            val restaurant = restaurants.find { it.id == args.id }

            if (restaurant != null){
                RestaurantScreen(
                    navController = navController,
                    restaurant = restaurant,
                    scaffoldPaddingValues = scaffoldPaddingValues
                )
            }
        }
    }
}