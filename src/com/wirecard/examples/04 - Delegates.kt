package com.wirecard.examples

class Foo {
    // Add a delegate that only sets name that are no longer than 5 characters and throws an exception otherwise. Hint: Veto
    var name = "Foo"

    // Add a delegate that prints the old and the new value every time the value changes. Hint: Observable
    var size = 1;
}

fun main(args: Array<String>) {
    val foo = Foo()

    foo.size = 3

    foo.name = "Oliver"
}


