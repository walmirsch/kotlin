interface Vehicle {
    val makerName: String
    fun go() {
        println("Vrum")
    }
    fun stop() {
        println("Break noise")
    }
    fun getKmPerLiter() : Int {
        return 17
    }
    fun getDoors() : Int
} // Vehicle