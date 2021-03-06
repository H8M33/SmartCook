package com.project.cookbook.data

import com.project.cookbook.data.database.RecipeDao
import com.project.cookbook.data.database.entities.FavouritesEntity
import com.project.cookbook.data.database.entities.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipeDao: RecipeDao
) {

    fun readRecipes(): Flow<List<RecipesEntity>> {
        return recipeDao.readRecipes()
    }

    fun readFavouriteRecipes(): Flow<List<FavouritesEntity>> {
        return recipeDao.readFavouriteRecipes()
    }



    suspend fun insertRecipes(recipesEntity: RecipesEntity) {
        recipeDao.insertRecipes(recipesEntity)
    }

    suspend fun insertFavouriteRecipes(favouritesEntity: FavouritesEntity) {
        recipeDao.insertFavouriteRecipe(favouritesEntity)
    }


    suspend fun deleteFavouriteRecipe(favouritesEntity: FavouritesEntity) {
        recipeDao.deleteFavouriteRecipe(favouritesEntity)
    }

    suspend fun deleteAllFavouriteRecipes() {
        recipeDao.deleteAllFavouriteRecipes()
    }
}