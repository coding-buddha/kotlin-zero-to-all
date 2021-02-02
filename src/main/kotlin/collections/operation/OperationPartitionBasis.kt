package collections.operation

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val evenOdd = numbers.partition { it % 2 == 0 }

    println(numbers)
    println(evenOdd) // partition 을 통해서 목록을 Pair 작성함
    println("${evenOdd.first.size} : ${evenOdd.first}")
    println("${evenOdd.second.size} : ${evenOdd.second}")

    println("=======")
    // 각각을 쌍으로 분리시킴
    val (positives, negatives) = numbers.partition { it > 0 }
    println(positives)
    println(negatives)
}