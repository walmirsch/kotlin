fun main() {
var lista = mutableListOf(1, 2, 3, 2, 5, 4)
    println(lista)
println("Lista: $lista")
    println(lista[0])
    println(lista.get(0))
println(lista.indexOf(3))
    println(lista.size)
lista.sort()
    println(lista)
    lista.add(8)
    println(lista)
    lista.shuffle()
    println(lista)
    lista.removeAt(0)
    println(lista)
    lista.remove(8)
    println(lista)
    lista[3] = 20
    println(lista)

    var listaNomes = mutableListOf("Ana", "Bia", "Gabi", "Carol")
    println(listaNomes)
    listaNomes.sort()
    println(listaNomes)
    for(nome in listaNomes) {
        println(nome)
    }
var setNumeros = mutableSetOf(1, 2, 3, 4)
println("Set: $setNumeros")
    println(setNumeros.contains(2))
    var mapNomeIdade = mutableMapOf("Daniela" to 21, "Gabriela" to 19)
println(mapNomeIdade)
    mapNomeIdade["Carina"] = 30
    println(mapNomeIdade)
    mapNomeIdade.remove("Daniela")
    println(mapNomeIdade)
    mapNomeIdade.putIfAbsent("Bruna", 25)
    println(mapNomeIdade)
} // main