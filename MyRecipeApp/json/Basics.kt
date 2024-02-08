package eu.tutorials.kotlinbasics

data class Potion(
    val name: String,
    val effect: String,
    val potency: Int
)

fun main() {
    val healingPotion = Potion("Headling Potion", "Restores Health", 50)
    val invisbilityPotion = Potion("Invisibility Potion", "Grants Health", 40)
    val strengthPotion = Potion("Strength Potion", "Boosts Health", 60)

    val potionList = listOf(healingPotion, invisbilityPotion, strengthPotion)
    println(potionList)
}
