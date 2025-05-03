package com.pdmtaller2.MauricioMontes_00042823.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material3.BottomAppBar
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Scaffold
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.unit.dp
import com.pdmtaller2.MauricioMontes_00042823.data.restaurants
import com.pdmtaller2.MauricioMontes_00042823.navigation._BrowseScreen
import com.pdmtaller2.MauricioMontes_00042823.navigation._MainScreen
import com.pdmtaller2.MauricioMontes_00042823.navigation._ShoppingCartScreen
import com.pdmtaller2.MauricioMontes_00042823.ui.components.BottomNavItem
import com.pdmtaller2.MauricioMontes_00042823.ui.components.RestaurantScroll

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    navController: NavController,
    scaffoldPaddingValues: PaddingValues
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Food Spot",
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
        RestaurantScroll(
            navController = navController,
            restaurantList = restaurants,
            scaffoldPaddingValues = innerPadding
        )
    }
}

@Preview
@Composable
fun PreviewMainScreen(){
    val navController = rememberNavController()

    Scaffold {
        paddingValues -> MainScreen(navController, paddingValues)
    }
}