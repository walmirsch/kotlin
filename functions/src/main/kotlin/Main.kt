fun main() {
println("10 + 20 = ${myMathFunction(10, 20)}")
    println("25 + 15 = ${myExpressionBodyFunction(25, 15)}")
    println("10 + 10 = ${myExpressionBodyFunctionWithInference(10, 10)}")
    println("5 + 5 = ${myFunctionWithDefaults(5, 5)}")
    println("5 + 5 = ${myFunctionWithDefaults(5, 5, "Hello")}")

} // main

fun myMathFunction(a: Int, b: Int) : Int {
return  a + b
}

fun myExpressionBodyFunction(a: Int, b: Int) : Int = a + b

fun myExpressionBodyFunctionWithInference(a: Int, b: Int) = a + b
fun myFunctionWithDefaults(a: Int = 1, b: Int = 5, message: String = "Hi") : Int {
val result = a + b
    println(message)
    return result
}

