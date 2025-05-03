package com.mamvuno.foodspot.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.compose.AsyncImage
import com.mamvuno.foodspot.models.Dish
import com.mamvuno.foodspot.models.Restaurant
import com.mamvuno.foodspot.navigation._RestaurantScreen

@Composable
fun RestaurantCard(
    navController: NavController,
    restaurant: Restaurant,
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp)
            .clickable { navController.navigate(_RestaurantScreen(restaurant.id)) },
        shape = RoundedCornerShape(16.dp),
    ) {
        Column {
            AsyncImage(
                model = restaurant.imageURL,
                contentDescription = "Picture of restaurant",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(16f / 9f)
            )
            Text(
                text = restaurant.name,
                modifier = Modifier
                    .padding(8.dp),
                style = MaterialTheme.typography.titleMedium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
fun PreviewRestaurantCard() {
    val navController = rememberNavController()

    RestaurantCard( navController,
        Restaurant(
            id = 1,
            name = "Sazón del Barrio",
            description = "Auténticos sabores mexicanos con un toque moderno.",
            imageURL = "https://beta-planet.gvi.co.uk/wp-content/uploads/2023/01/2048082323-2023-jan-27-12-36-17-000000-tamales-typical-mexican-food-made-from-corn-or-co-2022-10-31-10-06-15-utc.jpg",
            categories = listOf("Comida Mexicana", "Comida Saludable"),
            menu = listOf(
                Dish(1, "Tacos de Cochinita", "Tortillas suaves rellenas de cochinita pibil y cebolla morada encurtida.", "https://www.pequerecetas.com/wp-content/uploads/2020/03/cochinita-pibil-mexico.jpg"),
                Dish(2, "Ensalada de Nopal", "Fresca ensalada de nopal con jitomate, queso fresco y orégano.", "https://recetinas.com/wp-content/uploads/2019/10/ensalada-de-nopales.jpg"),
                Dish(3, "Quesadillas de Flor", "Quesadillas con flor de calabaza y queso oaxaca.", "https://canalcocina.es/medias/images/1108_CocinaInternacionalMexico_QuesadillasFlorCalabaza.jpg")
            )
        )
    )
}