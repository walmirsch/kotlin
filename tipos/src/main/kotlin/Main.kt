fun main() {
    val myPhrase = "uma string"
    val myPi = 3.14
    val myInt = 42
    val myLong = 9977989623232L
    val myFloat = 1.99f

    val aString: String
    val aDouble: Double
    val anInt: Int

    val aShort: Short = 12
    val aByte: Byte = 127
    val otherInt: Int = 7
    val otherLong: Long = otherInt.toLong()
    println(myPhrase)

    println("Pi: $myPi")
    println(myInt)
println(myLong)
    println(myFloat)
    aString = "outra string"
    println(aString)
    aDouble = 555.5
    println(aDouble)
    anInt = 444
    println(anInt)
    println(aShort)
    println(aByte)

    println(otherLong)
} // main

