package com.example.recyclerviewpractice.data

import com.example.recyclerviewpractice.model.Model

class DataSource {

    fun loadData() : List<Model>{
        return listOf(
            Model("Susie", "playing"),
            Model("Tommy", "exploring"),
            Model("Chuckie", "napping"),
            Model("Lil", "eating" ),
            Model("Phil", "playing"),
            Model("Dill", "laughing"),
            Model("Angelica", "crying")


        )

    }
}