package com.pdmtaller2.MauricioMontes_00042823

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.pdmtaller2.MauricioMontes_00042823.navigation.NavigationHost
import com.pdmtaller2.MauricioMontes_00042823.ui.theme.FoodSpotByMmontesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByMmontesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                        paddingValues ->
                    NavigationHost(paddingValues)
                }
            }
        }
    }
}