package com.mamvuno.foodspot.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mamvuno.foodspot.models.Restaurant
import com.mamvuno.foodspot.navigation._BrowseScreen
import com.mamvuno.foodspot.navigation._MainScreen
import com.mamvuno.foodspot.navigation._ShoppingCartScreen
import com.mamvuno.foodspot.ui.components.BottomNavItem
import com.mamvuno.foodspot.ui.components.DishScroll

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantScreen(
    navController: NavController,
    restaurant: Restaurant,
    scaffoldPaddingValues: PaddingValues
) {
    var query by remember { mutableStateOf("") }
    var filteredList = restaurant.menu.filter { it.name.contains(query, ignoreCase = true) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = restaurant.name,
                        style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            )
        },
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
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = restaurant.description,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            TextField(
                value = query,
                onValueChange = { query = it },
                placeholder = { Text("Buscar platillo...") },
                leadingIcon = {
                    Icon(
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

            DishScroll(
                dishList = filteredList,
                scaffoldPaddingValues = innerPadding
            )
        }
    }
}