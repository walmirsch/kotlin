class Person(var firstName: String, var age: Int){
    init {
        println("Created a person named $firstName $age")
    }

    override fun toString(): String {
        return "Pessoa: $firstName tem $age"
    }
} // Person

