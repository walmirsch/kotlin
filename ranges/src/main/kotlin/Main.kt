fun main() {
    val serie: IntRange = 1..10
    for (i in serie) {
        println("$i")
    }
    for (i in 1..100) {
        if (i % 2 == 0)
            print("$i ")
    }
    println()

    val numerosPares: IntProgression = 2..20 step 2
    numerosPares.forEach { print("$it ") }
    println()

    val numerosParesReverso: IntProgression = 50 downTo 2 step 2
    numerosParesReverso.forEach { print("$it ") }
    println()

    val salarios: DoubleArray = doubleArrayOf(1500.0, 2000.0, 3500.0, 4200.0, 5000.0)
    val base = 1500.0
    val topo = 4000.0
    var contador = 0
    for (salario in salarios) {
        if (salario in base..topo)
            contador++
    }
    println("$contador")
    println()

    val alfabeto: CharRange = 'a'..'z'
    alfabeto.forEach { print("$it ") }
    println()
    if('k' in alfabeto)
        println("O caractere 'k' está contido no alfabeto")
} // main