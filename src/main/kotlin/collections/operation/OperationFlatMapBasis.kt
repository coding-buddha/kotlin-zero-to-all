package collections.operation

fun main() {
    val numbers = listOf(1, 2, 3)
    val tripled = numbers.flatMap {listOf(it + 0, it + 1, it + 2)}

    println(numbers)
    println(tripled)
}