import java.math.BigDecimal

fun main() {
    /*
    val idades = IntArray(4)
    idades[0] = 33
    idades[1] = 50
    idades[2] = 20
    idades[3] =15
    */
    val idades: IntArray = intArrayOf(33, 50, 20, 15)
    var maiorIdade = Int.MIN_VALUE // 0 seviria
    for (idade in idades) {
       if(idade > maiorIdade)
           maiorIdade = idade
    }
var menorIdade = Int.MAX_VALUE // 2000, por exemplo
    idades.forEach {idade ->
        if(idade < menorIdade)
            menorIdade = idade
    }
    println("A maior idade é $maiorIdade")
    println("Maior idade: ${idades.max()}")
    println("A menor idade é $menorIdade")
    println("Menor idade: ${idades.min()}")
    val mediaIdades: Double = idades.average()
    println("Média das idades: $mediaIdades")
    val todosMaiores: Boolean = idades.all {  it >= 18}
    println("Todos maiores de idade? $todosMaiores")
    val existeMenor: Boolean = idades.any {  it < 18}
    println("Existe algum menor de idade? $existeMenor")
    val maiores: List<Int> = idades.filter {it >=18  }
    println("Maiores de idade: $maiores")
    val menores: IntArray = idades.filter { it < 18 }.toIntArray()
    println("Menores de idade ${menores.contentToString()}")
    val contem10: Boolean = idades.contains(10)
    println("Alguém tem 10 anos? $contem10")
    // val idade: =Int idades.find { it == 10 }
//     println("Idade encontrada: $idade")

    val salarios: DoubleArray = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)
    println("Salários originais: ${salarios.contentToString()}")
    val aumento = 1.1
    for (indice in salarios.indices) {
        salarios[indice] *= aumento
    }
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
println("Salários: ${salarios.contentToString()}")
} // main

