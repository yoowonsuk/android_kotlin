package eu.tutorials.kotlinbasics

// class Dog constructor() {
class Dog(var name: String = "temp") { // property name, without val => parameter https://wooooooak.github.io/kotlin/2019/05/24/property/
    init {
        bark()
    }
    fun bark() {
        println("Woof Woof")
    }
}
