package com.pdmtaller2.MauricioMontes_00042823.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdmtaller2.MauricioMontes_00042823.models.Dish

@Composable
fun DishScroll(
    dishList: List<Dish>,
    scaffoldPaddingValues: PaddingValues
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = scaffoldPaddingValues
    ) {
        items(dishList) {
                dish -> DishCard(dish)
        }
    }
}

@Preview
@Composable
fun PreviewDishScroll() {
    val menu = listOf(
        Dish(1, "Tacos de Cochinita", "Tortillas suaves rellenas de cochinita pibil y cebolla morada encurtida.", "https://www.pequerecetas.com/wp-content/uploads/2020/03/cochinita-pibil-mexico.jpg"),
        Dish(2, "Ensalada de Nopal", "Fresca ensalada de nopal con jitomate, queso fresco y orégano.", "https://recetinas.com/wp-content/uploads/2019/10/ensalada-de-nopales.jpg"),
        Dish(3, "Quesadillas de Flor", "Quesadillas con flor de calabaza y queso oaxaca.", "https://canalcocina.es/medias/images/1108_CocinaInternacionalMexico_QuesadillasFlorCalabaza.jpg")
    )

    Scaffold {
        innerPadding -> DishScroll(menu, innerPadding)
    }
}