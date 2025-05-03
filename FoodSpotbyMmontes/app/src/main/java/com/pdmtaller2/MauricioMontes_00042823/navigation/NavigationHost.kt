package com.pdmtaller2.MauricioMontes_00042823.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.pdmtaller2.MauricioMontes_00042823.data.restaurants
import com.pdmtaller2.MauricioMontes_00042823.ui.screens.BrowseScreen
import com.pdmtaller2.MauricioMontes_00042823.ui.screens.MainScreen
import com.pdmtaller2.MauricioMontes_00042823.ui.screens.RestaurantScreen
import com.pdmtaller2.MauricioMontes_00042823.ui.screens.ShoppingCartScreen

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