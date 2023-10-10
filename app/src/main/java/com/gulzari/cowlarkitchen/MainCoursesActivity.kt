package com.gulzari.cowlarkitchen

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainCoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_courses)

        val mainCoursesList = findViewById<ListView>(R.id.list_view_main_courses)

        var mainCourses = mutableListOf<Dish>(
            Dish("Bean and rocket salad",
                "Bean and fresh rocket served on a bed of lettuce",
                699
            ),
            Dish(
                "Red cabbage and mango salad",
                "Red cabbage and fresh mango served on a bed of lettuce",
                899
            ),
            Dish(
                "Cardamom and cannellini soup",
                "Green cardamom and dried cannellini combined into smooth soup",
                499
            ),
            Dish(
                "Chickpea and tahini panini",
                "A hot, pressed panini filled with fresh chickpea and tahini",
                999
            ),
            Dish(
                "Chard and aubergine vindaloo",
                "Hot vindaloo made with fresh chard and aubergine",
                749
            ),
            Dish(
                "Stilton and aubergine fusilli",
                "Fresh egg pasta in a sauce made from stilton and salted aubergine",
                1199
            ),
            Dish("Feijoa and mint salad",
                "Fresh feijoa and mint served on a bed of lettuce",
                399
            ),
            Dish(
                "Mustard and mango soup",
                "Dijon mustard and fresh mango combined into smooth soup",
                799
            ),
            Dish(
                "Papaya and tomato salad",
                "Fresh papaya and plum tomatoes served on a bed of lettuce",
                649
            ),
            Dish(
                "Bean and sweetcorn vindaloo",
                "Hot vindaloo made with bean and creamed sweetcorn",
                599
            )
        )
        val dishesAdapter = ArrayAdapter<Dish>(this@MainCoursesActivity, android.R.layout.simple_list_item_1, mainCourses)

        mainCoursesList.adapter = dishesAdapter

    }
}