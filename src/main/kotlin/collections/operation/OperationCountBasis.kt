package collections.operation

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val totalCount = numbers.count()
    val evenCount = numbers.count {it % 2 == 0} // 2의 배수인 것들만 카운트한다.

    println(numbers)
    println(totalCount)
    println(evenCount)
}
