fun <T: Comparable>T> max(param1: T, param2: T): T {
    val result = param1.compareTo(param2)
    return if(result > 0) param1 else param2
} // max

