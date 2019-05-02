package basics

fun main() {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))
    println(numbers.filter (::isEven))
}

fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0