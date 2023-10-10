package com.gulzari.cowlarkitchen

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class DesertsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desserts)

        val dessertsList = findViewById<ListView>(R.id.list_view_desserts)

        var desserts = mutableListOf<Dish>(
            Dish(
                "Angel Delight",
                "powdered dessert mix produced in the United Kingdom. It is designed to be whisked with milk to create a sweet mousse-like dessert",
                1399
            ),
            Dish(
                "Dream Whip",
                "whipped topping mix that is mixed with milk and vanilla to make a whipped dessert topping, currently owned by the Kraft Heinz company",
                899
            ),
            Dish(
                "Angel cake",
                "Made with butter, caster sugar, eggs, vanilla extract, self-raising flour, baking powder, and red and yellow food colouring, it consists of two or three layers of sweet butter cake which are often coloured white, pink and yellow",
                999
            ),
            Dish(
                "Friand",
                "almond flour, egg whites, butter, and powdered sugar",
                699
            ),
            Dish(
                "Babka",
                "sweet braided bread which originated in the Jewish communities of Poland and Ukraine",
                299
            ),
            Dish(
                "Bizcocho",
                "A cookie flavored with anise and cinnamon developed in the Spanish colonial province of Santa Fe de Nuevo México",
                599
            ),
            Dish(
                "Ji dan gao",
                "steaming sponge cakes made of rice flour, milk, eggs and sugar",
                49 * 9
            ),
            Dish(
                "Kalathappam ",
                "batter of rice, coconut flakes, onions, cardamom and water is poured into hot oil",
                899
            ),
            Dish(
                "Lekach",
                "equal weight of white rye flour and dark honey, strong Austrian coffee instead of water, cloves, cinnamon, allspice, and golden raisins in the loaf, with slivered almonds on top of the loaf",
                1449
            ),
            Dish(
                "Opera cake",
                "layers of almond sponge cake soaked in coffee syrup, layered with ganache and coffee French buttercream, and covered in a chocolate glaze",
                1899
            ),
            Dish(
                "Cocoa and blackcurrant cake",
                "Moist cake made with cocoa and fresh blackcurrant",
                499
            ),
            Dish(
                "Mulberry and cardamom crumble",
                "Fresh mulberry and green cardamom topped with butter crumble",
                699
            ),
            Dish(
                "Lemon scones with chilli jam",
                "Vegan scones served with chilli jam and fresh coconut cream",
                599
            ),
            Dish(
                "Potato and banana vegan crepes",
                "Crispy vegan crepes filled with fresh potato and banana",
                599
            ),
            Dish(
                "Cinnamon and treacle buns",
                "Crumbly buns made with cinnamon and dark treacle",
                499
            )

        )

        val dishesAdapter =
            ArrayAdapter<Dish>(this@DesertsActivity, android.R.layout.simple_list_item_1, desserts)
        dessertsList.adapter = dishesAdapter
    }
}