package com.pdmtaller2.MauricioMontes_00042823.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.MauricioMontes_00042823.data.restaurants
import com.pdmtaller2.MauricioMontes_00042823.navigation._BrowseScreen
import com.pdmtaller2.MauricioMontes_00042823.navigation._MainScreen
import com.pdmtaller2.MauricioMontes_00042823.navigation._ShoppingCartScreen
import com.pdmtaller2.MauricioMontes_00042823.ui.components.BottomNavItem
import com.pdmtaller2.MauricioMontes_00042823.ui.components.VariantRestaurantCard

@Composable
fun BrowseScreen(
    navController: NavController,
    scaffoldPaddingValues: PaddingValues
) {
    var query by remember { mutableStateOf("") }

    val filteredItems = restaurants.filter { restaurant ->
        restaurant.name.contains(query, ignoreCase = true) ||
        restaurant.menu.any { dish ->
            dish.name.contains(query, ignoreCase = true)
        }
    }.ifEmpty {
        restaurants.filter { restaurant ->
            restaurant.categories.any { category ->
                category.contains(query, ignoreCase = true)
            }
        }
    }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                windowInsets = WindowInsets(0.dp),
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface,
                content = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        BottomNavItem(
                            label = "List",
                            icon = Icons.Filled.Home,
                            onClick = { navController.navigate(_MainScreen) }
                        )
                        BottomNavItem(
                            label = "Browse",
                            icon = Icons.Filled.Menu,
                            onClick = { navController.navigate(_BrowseScreen) }
                        )
                        BottomNavItem(
                            label = "Cart",
                            icon = Icons.Filled.ShoppingCart,
                            onClick = { navController.navigate(_ShoppingCartScreen) }
                        )
                    }
                }
            )
        },
        modifier = Modifier.padding(scaffoldPaddingValues)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = query,
                onValueChange = { query = it },
                placeholder = { Text("Buscar platillo...") },
                leadingIcon = {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Ícono de búsqueda",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(28.dp),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant,
                    focusedContainerColor = MaterialTheme.colorScheme.surface,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    cursorColor = MaterialTheme.colorScheme.primary
                ),
                textStyle = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = innerPadding
            ) {
                items(filteredItems) { restaurant ->
                    VariantRestaurantCard(navController, restaurant)
                }
            }
        }
    }
}
