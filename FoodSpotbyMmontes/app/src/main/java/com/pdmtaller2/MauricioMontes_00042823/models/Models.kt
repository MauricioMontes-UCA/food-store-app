package com.pdmtaller2.MauricioMontes_00042823.models

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageURL: String,
)

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageURL: String,
    val categories: List<String>,
    val menu: List<Dish>
)