package com.mamvuno.foodspot.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mamvuno.foodspot.navigation._BrowseScreen
import com.mamvuno.foodspot.navigation._MainScreen
import com.mamvuno.foodspot.navigation._ShoppingCartScreen
import com.mamvuno.foodspot.ui.components.BottomNavItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShoppingCartScreen(
    navController: NavController,
    scaffoldPaddingValues: PaddingValues
){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Shopping Cart",
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
        modifier = Modifier.padding(scaffoldPaddingValues),

    ) { innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Implementing soon...")
        }
    }
}
