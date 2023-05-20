fun main() {
val anInt : Int = 9
    val otherInt = 199
    val lowest = if (anInt < otherInt) anInt else otherInt
println(lowest)

    val temp = 25
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
} // main

