package com.pamo.foodapp.interfaces

import com.pamo.foodapp.entities.Category
import com.pamo.foodapp.entities.Meal
import com.pamo.foodapp.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Interface for REST methods to get reponses for given URIs
 */
interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>


}