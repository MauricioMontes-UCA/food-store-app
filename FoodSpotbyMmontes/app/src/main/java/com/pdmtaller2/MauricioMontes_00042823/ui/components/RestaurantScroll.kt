package com.pdmtaller2.MauricioMontes_00042823.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.MauricioMontes_00042823.models.Restaurant

@Composable
fun RestaurantScroll(
    navController: NavController,
    restaurantList: List<Restaurant>,
    scaffoldPaddingValues: PaddingValues
) {
    val mapCategoryRestaurant = groupRestaurantsByCategory(restaurantList)

    LazyColumn {
        mapCategoryRestaurant.forEach {
            (category, restaurants) -> item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 12.dp)
                )
                CategoryScroll(navController, restaurants,scaffoldPaddingValues)
            }
        }
    }
}

fun groupRestaurantsByCategory(restaurants: List<Restaurant>): Map<String, List<Restaurant>> {
    val categoryList = mutableListOf<String>()

    for (restaurant in restaurants) {
        for (category in restaurant.categories){
            categoryList.add(category)
        }
    }

    categoryList.toSet().toList()

    return categoryList.associateWith {
            category -> restaurants.filter { it.categories.contains(category) }
    }
}