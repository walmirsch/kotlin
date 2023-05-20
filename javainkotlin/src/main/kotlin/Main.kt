    fun main() {
val cat = Animal("Garfiel", "cat", 10)
        println(cat.show())
        val dog = Animal("Toto", "dog", 30)
        println(dog.show())
        cat.weight = 20
        println(cat.show())
        // cat.kind = "horse"
}// main