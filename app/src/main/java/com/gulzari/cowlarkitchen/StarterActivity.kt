package com.gulzari.cowlarkitchen

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class StarterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)

        val starterList: ListView = findViewById(R.id.list_view_starters)


        val dishes = mutableListOf<Dish>(
            Dish(
                "Mushroom and tofu maki",
                "Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu",
                999
            ),
            Dish(
                "Egg and avocado uramaki",
                "Pasta in a souce made from free range eggs and fresh avocado",
                1199
            ),
            Dish("Melon and lemon soup",
                "Fresh melon and lemon combined into creamy soup",
                1199
            ),
            Dish(
                "Coconut and chocolate mousse",
                "A creamy mousse made with fresh coconut and milk chocolate",
                899
            ),
            Dish(
                "Spinach and cabbage wontons",
                "Thin wonton cases stuffed with fresh spinach and chinese cabbage",
                799
            ),
            Dish(
                "Broccoli and cucumber soup",
                "Fresh broccoli and cucumber combined into creamy soup",
                899
            ),
            Dish(
                "Chilli and aubergine dip",
                "A dip made from scotch bonnet chilli and fresh aubergine",
                999
            ),
            Dish(
                "Chickpea and chilli gyoza",
                "Thin pastry cases stuffed with fresh chickpea and green chilli",
                699
            ),
            Dish(
                "Sprout and pineapple soup",
                "Fresh sprout and pineapple combined into creamy soup",
                899
            ),
            Dish("Egusi and borscht soup",
                "Egusi and borscht combined into creamy soup",
                1299
            )
        )

        val dishesAdapter = ArrayAdapter<Dish>(this@StarterActivity, android.R.layout.simple_list_item_1, dishes)
        starterList.adapter = dishesAdapter

    }
}