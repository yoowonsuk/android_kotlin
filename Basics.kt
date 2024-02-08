package eu.tutorials.kotlinbasics

fun main() {
    // Immutable List
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    // mutableListOf<dataType>
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")
    shoppingList.add("something") // adding items to lists
    shoppingList.remove("something")
    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.add(1, "cooling system")
    shoppingList.set(1, "Water Cooling")
    val hasRam = shoppingList.contains("RAM")
    for (item in shoppingList) {
        
    }
    for(item in 0 until shoppingList.size) // 0..3 (if shoppingList.size is 4)
    println(shoppingList) // shoppingList[-1] not work
}


/*
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size:String,
    val creamAmount:Int
)

fun main() {
    var count = readln().toInt()
    makeCoffee(2)
    add(num1=5, num2=10)
    var daisy = Dog("daisy")
    println("hello ${daisy.name}")
    daisy.name = "something"
    val coffeeForDenis = CoffeeDetails(0, "denis", "xxl", 0)

}

// no working
fun divide(num1: Int, num2: Int):Double {
    val result = num1 / num2.toDouble()
    return result
}
fun add (num1:Int, num2:Int):Int{
    val result = num1 + num2
    return result
}

fun askCofferDetails() {

}
fun makeCoffee(sugarCount:Int) {

}

fun makeCoffees(coffeeDetails: CoffeeDetails){

}
 */
