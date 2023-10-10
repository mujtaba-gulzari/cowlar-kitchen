package com.gulzari.cowlarkitchen

class Dish(
    var title: String = "",
    var description: String = "",
    var price: Int = 0
) {
    override fun toString(): String {
        return title
    }
}