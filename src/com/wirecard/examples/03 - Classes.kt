package com.wirecard.examples

class Person(firstName: String, var lastName: String) {
    var firstName = firstName

    // Create a custom setter for firstName that cuts off names with more than 10 characters

    // Create a getter that returns the full name

}

fun main(args: Array<String>) {
    val amadeus = Person("Wolfgang", "Mozart")
//    println(oliver.fullName)
//    amadeus.firstName = "Wolfgang Amadeus"
//    println(amadeus.fullName)
}
