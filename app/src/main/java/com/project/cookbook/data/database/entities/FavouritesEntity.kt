package com.project.cookbook.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.project.cookbook.models.Result
import com.project.cookbook.util.Constants.Companion.FAVOURITE_RECIPES_TABLE

@Entity(tableName = FAVOURITE_RECIPES_TABLE)
class FavouritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)