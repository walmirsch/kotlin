fun main() {
    val pizzasOrdered = 2
    when(pizzasOrdered) {
        0 -> println("We need orders")
        1, 2 -> println("Got some orders")
        in 3..5 -> println("Business is up")
    else -> println("Are you sure?")
    }
when {
    pizzasOrdered <= 0 -> println("none ordered")
    pizzasOrdered % 2 == 1 -> println("odd number ordered")
    pizzasOrdered % 2 == 0 -> println("Even number ordered")
}
} // main

