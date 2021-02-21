package documentation.collections.operation

fun main() {
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("numbers result : ${numbers}")
    println("empty result : ${empty}")

    println("numbers max result : ${numbers.maxOrNull()}")
    println("numbers min result : ${numbers.minOrNull()}")
    println("empty result : ${empty.minOrNull()}")
}