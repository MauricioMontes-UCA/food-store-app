package com.mamvuno.foodspot.data

import com.mamvuno.foodspot.models.Dish
import com.mamvuno.foodspot.models.Restaurant

val restaurants = listOf<Restaurant>(
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
    ),
    Restaurant(
        id = 2,
        name = "Dolce Bontà",
        description = "Un rincón de Italia con pastas caseras y postres irresistibles.",
        imageURL = "https://d36tnp772eyphs.cloudfront.net/blogs/1/2018/05/shutterstock_752526229.jpg",
        categories = listOf("Comida Italiana", "Postres y Dulces"),
        menu = listOf(
            Dish(1, "Lasaña Bolognesa", "Capas de pasta, carne y salsa bechamel horneadas a la perfección.", "https://cdn0.recetasgratis.net/es/posts/7/6/5/lasana_bolonesa_facil_38567_orig.jpg"),
            Dish(2, "Tiramisú Clásico", "Postre italiano con mascarpone, café y cacao.", "https://www.nonnabox.com/wp-content/uploads/2016/01/classic_tiramisu_recipe.jpg"),
            Dish(3, "Pasta al Pesto", "Spaghetti con salsa de albahaca fresca, piñones y parmesano.", "http://milrecetas.net/wp-content/uploads/2017/08/pasta-al-pesto-3.jpg")
        )
    ),
    Restaurant(
        id = 3,
        name = "Tokyo Express",
        description = "Comida japonesa rápida, fresca y deliciosa.",
        imageURL = "https://www.tastingtable.com/img/gallery/20-japanese-dishes-you-need-to-try-at-least-once/l-intro-1664219638.jpg",
        categories = listOf("Comida Asiática", "Comida Rápida"),
        menu = listOf(
            Dish(1, "Ramen de Miso", "Caldo caliente con fideos, miso, huevo y verduras.", "https://preview.redd.it/g8qes8d5ws431.jpg?auto=webp&s=ea1e56da2c7d1c0fa6cc67c0fb5af7c698b908ca"),
            Dish(2, "Takoyaki", "Bolas de pulpo fritas con salsa y katsuobushi.", "http://thisis-japan.com/wp-content/uploads/2017/05/93c10518ad4ef76fdcd3428929517ae7.jpeg"),
            Dish(3, "Nigiri Surtido", "Variedad de nigiris de salmón, atún y camarón.", "https://www.seriouseats.com/thmb/df9eDW177N7ww1bjnRusYqM7JbQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/20230308-SEA-Onigiri-AmandaSuarez-hero-1-dc0d935d02bd4e208c0d1085fead231c.JPG")
        )
    ),
    Restaurant(
        id = 4,
        name = "Verde Vital",
        description = "Alimentación saludable y consciente para todos los días.",
        imageURL = "https://fhasal.in/wp-content/uploads/2022/09/lettuce11.jpg",
        categories = listOf("Comida Saludable", "Bebidas"),
        menu = listOf(
            Dish(1, "Bowl de Quinoa", "Quinoa con garbanzos, aguacate, espinaca y aderezo de limón.", "https://d36fw6y2wq3bat.cloudfront.net/recipes/bowl-de-quinua-con-garbanzos-coliflor-y-zanahoria/600/bowl-de-quinua-con-garbanzos-coliflor-y-zanahoria_version_1652875035.jpg"),
            Dish(2, "Smoothie de Mango", "Bebida refrescante de mango, plátano y leche de almendra.", "https://simplegreensmoothies.com/wp-content/uploads/2020/10/mango-smoothie-recipe-7.jpg"),
            Dish(3, "Wrap Vegano", "Tortilla integral rellena de hummus, vegetales y tofu grillado.", "https://assets.unileversolutions.com/recipes-v2/211058.jpg")
        )
    ),
    Restaurant(
        id = 5,
        name = "El Fogón de la Abuela",
        description = "Sabores tradicionales mexicanos hechos como en casa.",
        imageURL = "https://media.istockphoto.com/id/1209406792/es/foto/una-olla-de-agua-hirviendo-sobre-un-fuego-y-una-llama-preparaci%C3%B3n-de-alimentos-en-fogatas-en.jpg?s=170667a&w=0&k=20&c=tSif8p2ER4G835-YWTuDPbiuiAQtiCu1WfGMx7uGrHo=",
        categories = listOf("Comida Mexicana", "Postres y Dulces"),
        menu = listOf(
            Dish(1, "Pozole Rojo", "Caldo espeso con carne de cerdo, maíz y chile guajillo.", "https://vivirmejor.mx/wp-content/uploads/2020/08/Comida-Tipica-Mexicana-Pozole-02-Portada.jpg"),
            Dish(2, "Tamales de Elote", "Dulces tamalitos de elote servidos con crema.", "https://www.recetassalvadorenas.com/wp-content/uploads/2015/10/tamales-de-elote-boost.jpg"),
            Dish(3, "Agua de Jamaica", "Infusión fría de flor de jamaica con un toque de canela.", "https://cdn.kiwilimon.com/recetaimagen/3630/15252.jpg")
        )
    ),
    Restaurant(
        id = 6,
        name = "Pizza Fiamma",
        description = "Pizzas artesanales al horno de leña con ingredientes frescos.",
        imageURL = "https://www.topgastronomico.es/wp-content/uploads/2021/01/pizza-2530174_1920.jpg",
        categories = listOf("Comida Italiana", "Comida Rápida"),
        menu = listOf(
            Dish(1, "Pizza Margherita", "Masa delgada con tomate, mozzarella y albahaca.", "https://lelocalapizzas.fr/wp-content/uploads/2022/02/recette-pizza-margherita.jpg"),
            Dish(2, "Calzone de Pepperoni", "Pizza doblada rellena de pepperoni y queso.", "https://www.simplyrecipes.com/thmb/vZ4Yp9mvuRdUL9e4GPZJt4Q1ums=/2000x1333/filters:fill(auto,1)/Simply-Recipes-Pepperoni-Calzone-LEAD-5-8ac22d0fd29747e98d1da3b753e540da.jpg"),
            Dish(3, "Focaccia Rústica", "Pan italiano con romero y aceite de oliva.", "https://www.csabadallazorza.com/wp-content/uploads/2018/02/283733.jpg")
        )
    ),
    Restaurant(
        id = 7,
        name = "Wok & Roll",
        description = "Cocina asiática urbana, al estilo wok en minutos.",
        imageURL = "https://thebrilliantkitchen.com/wp-content/uploads/2022/08/Wok-1024x682.jpg",
        categories = listOf("Comida Asiática", "Comida Rápida", "Comida Saludable"),
        menu = listOf(
            Dish(1, "Arroz Frito Vegetariano", "Con zanahoria, cebolla, tofu y salsa de soya.", "https://www.menudospeques.net/images/cocinaynutricion/arroz-frito-vegetariano.jpg"),
            Dish(2, "Pollo Teriyaki", "Tiras de pollo glaseadas con salsa teriyaki sobre arroz blanco.", "https://www.tureceta.net/wp-content/uploads/2019/06/Pollo-Teriyaki.jpg"),
            Dish(3, "Fideos Udon", "Fideos gruesos salteados con vegetales asiáticos.", "https://www.cilantroandcitronella.com/wp-content/uploads/2016/08/udon-stir-fry_1_01.jpg")
        )
    ),
    Restaurant(
        id = 8,
        name = "La Frutería",
        description = "Postres naturales, fruta fresca y jugos recién exprimidos.",
        imageURL = "https://5aldia.cl/wp-content/uploads/2018/04/frutas.jpg",
        categories = listOf("Postres y Dulces", "Bebidas", "Comida Saludable"),
        menu = listOf(
            Dish(1, "Copa de Frutas Tropicales", "Mezcla de piña, papaya, mango y sandía.", "https://canalcocina.es/medias/_cache/zoom-e231d32bc3abcf4638f1fe1fa1c836c4-920-518.jpg"),
            Dish(2, "Yogurt con Granola", "Yogurt natural con granola casera y miel.", "https://lacasadelyogur.com/wp-content/uploads/2023/11/frutas-con-yogurt-y-granola-e1699280122308.jpg"),
            Dish(3, "Jugo Verde", "Mezcla detox de apio, manzana verde y espinaca.", "https://imag.bonviveur.com/jugo-verde.jpg")
        )
    ),
    Restaurant(
        id = 9,
        name = "El Taco Rebelde",
        description = "Tacos fuera de lo convencional, sabores atrevidos y picantes.",
        imageURL = "https://thekitchencommunity.org/wp-content/uploads/2021/11/shutterstock_1690419967.jpg",
        categories = listOf("Comida Mexicana", "Comida Rápida"),
        menu = listOf(
            Dish(1, "Taco de Pescado Estilo Baja", "Pescado empanizado con col morada y aderezo picante.", "https://estoyhechouncocinillas.com/wp-content/uploads/2021/01/como-hacer-tacos-de-pescado.jpg"),
            Dish(2, "Taco Vegano de Jamaica", "Flor de jamaica sazonada con especias mexicanas.", "https://theveganplanetkitchen.com/wp-content/uploads/2022/09/IMG_8180-1024x720.jpg"),
            Dish(3, "Taco de Asado Norteño", "Carne asada al carbón con cebollitas cambray.", "http://images.heb.com/is/image/HEBGrocery/recipe-hm-large/tacos-norte-os-recipe.jpg")
        )
    ),
    Restaurant(
        id = 10,
        name = "Matcha House",
        description = "Especialistas en bebidas y postres a base de matcha.",
        imageURL = "https://thesmartlocal.com/japan/wp-content/uploads/2020/04/Japanese-teas-13.jpg",
        categories = listOf("Postres y Dulces", "Bebidas", "Comida Asiática"),
        menu = listOf(
            Dish(1, "Latte de Matcha", "Té verde con leche vaporizada y espuma cremosa.", "https://thesmartlocal.com/japan/wp-content/uploads/2020/04/Japanese-teas-13.jpg"),
            Dish(2, "Pastel de Matcha", "Bizcocho esponjoso con crema de matcha.", "https://okdiario.com/img/2018/07/17/tarta-de-te-matcha-con-chocolate-blanco.jpg"),
            Dish(3, "Helado de Té Verde", "Helado artesanal con sabor intenso a matcha.", "https://www.japonalternativo.com/wp-content/uploads/2020/06/receta-helado-de-te-verde-matcha-thermomix.jpg")
        )
    )
)
