package com.mamvuno.foodspot

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mamvuno.foodspot.navigation.NavigationHost
import com.mamvuno.foodspot.ui.theme.FoodSpotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    paddingValues ->
                    NavigationHost(paddingValues)
                }
            }
        }
    }
}