package com.pamo.foodapp.repository

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pamo.foodapp.entities.CategoryItems
import com.pamo.foodapp.entities.MealsItems

/**
 * Repository with methods to manipulate objects in room db
 */
@Dao
interface RecipeRepository {
    //coroutine library
    //it means that function can be paused and resumed at a later time
    @Query("SELECT * FROM categoryitems ORDER BY id DESC")
    suspend fun getAllCategory(): List<CategoryItems>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(categoryItems: CategoryItems?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeal(mealsItems: MealsItems?)

    @Query("DELETE FROM categoryitems")
    suspend fun clearDb()

    @Query("SELECT * FROM MealItems WHERE categoryName = :categoryName ORDER BY id DESC")
    suspend fun getSpecificMealList(categoryName: String): List<MealsItems>
}