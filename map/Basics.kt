package eu.tutorials.kotlinbasics

fun main() {
    val numbers = listOf(1,2,3)
    val doubled = numbers.map{ it * 2 } // Result [2,4,6]
    println(doubled)


    val blueRoseVase = Vase(color = "Blue", design = "Rose")
    val redRoseVase = blueRoseVase.copy(color = "Red")
    println(blueRoseVase)
    println(redRoseVase)

    // nullable string
    val name : String? = "Ella" // null or string
    name?.let{
        println(it.toUpperCase())
    }
    
}

data class Vase(val color: String, val design: String)
