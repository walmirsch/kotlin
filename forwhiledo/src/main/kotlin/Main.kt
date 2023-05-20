fun main() {
    var x = 0
    while(x < 10) {
        println("x = $x")
        x += 3
    }
    do {
        println("x = $x")
        x -= 3
    } while(x > 0)
for(item in 1..10) {
print("$item, ")
}
for(ch in "Testando") {
    println(ch)
}
    for(item in 10..20 step 2) {
println(item)
    }
    // Precisa consertar
/*
    for (item  in 20 downto 5 step -2) {
        println(item)
    }
*/
    val myArray = arrayOf(10, 20, 30, 40, 50)
    for(item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
} // main

