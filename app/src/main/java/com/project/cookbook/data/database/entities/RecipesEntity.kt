package com.project.cookbook.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.project.cookbook.models.FoodRecipe
import com.project.cookbook.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}