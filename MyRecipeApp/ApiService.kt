package eu.tutorials.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// https://colabear754.tistory.com/119

private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)

interface ApiService{
    @GET("categories.php")
    suspend fun getCategories():CategoriesResponse
}

/*try and catch and finally
package eu.tutorials.kotlinbasics

fun main() {
    var number: Int
    println("Please enter a number")
    try {
        val number = readln().toInt()
        println("User entered $number)
    }catch(e:Exception) {
        println("Error ${e.message}")
    }finally {
        println("This will be execute regradless. Error or no error")
        number = 0
    }
 */
