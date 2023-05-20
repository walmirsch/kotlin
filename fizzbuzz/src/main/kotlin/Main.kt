fun main() {
    val list = fizzBuzz1(100)
    println(list)
    val list2 = fizzBuzz(50)
    println(list2)
} //main

fun fizzBuzz1(n: Int): List<String> {
    val list = mutableListOf<String>()
    for (i in 1..n) {
        val item = when {
            i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }
        list.add(item)
    }
    return list
}

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()
    (1..n).forEach() {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3                == 0            -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}

