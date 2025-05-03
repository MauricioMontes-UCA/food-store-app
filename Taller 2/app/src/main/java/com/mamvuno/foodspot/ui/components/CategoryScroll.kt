package com.mamvuno.foodspot.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.mamvuno.foodspot.models.Restaurant

@Composable
fun CategoryScroll(
    navController: NavController,
    restaurantList: List<Restaurant>,
    scaffoldPaddingValues: PaddingValues
) {
    LazyRow(
        modifier = Modifier.padding(scaffoldPaddingValues)
    ) {
        items(restaurantList) {
                restaurant -> RestaurantCard(navController, restaurant)
        }
    }
}