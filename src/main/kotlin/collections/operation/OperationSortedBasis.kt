package collections.operation

fun main() {
    val shuffled = listOf(5, 3, -2, 100, 34, 11, -44)

    // 오름차순
    val natural = shuffled.sorted()

    // 내림차순
    val inverted = shuffled.sortedBy { -it }

    // 내림차순
    val descending = shuffled.sortedDescending()

    // 절대값 기준으로 내림차순을 수행한다.
    val descendingBy = shuffled.sortedByDescending { kotlin.math.abs(it) }

    println(natural)
    println(inverted)
    println(descending)
    println(descendingBy)
}