package documentation.collections.operation

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first {it % 2 == 0}
    val lastOdd = numbers.last {it % 2 != 0}

    println(first)      // 가장 첫번째 요소 반환
    println(last)       // 가장 마지막 요소 반환 (뒤에서부터 탐색을 수행하기 때문)
    println(firstEven)  // 조건을 만족하는 가장 첫번째 요소 반환
    println(lastOdd)    // 조건을 만족하는 가장 마지막 요소 반환 (뒤에서부터 탐색을 수행하기 때문)

    /** -------------------------------------------------------------------------------- **/

    println("--------------------------------------------------------------------------------")

    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val firstValue = empty.firstOrNull()
    val lastValue = empty.lastOrNull()

    println(firstValue)
    println(lastValue)

    val firstF = words.firstOrNull {it.startsWith('f')}
    val firstZ = words.firstOrNull {it.startsWith('z')}
    val lastF = words.lastOrNull {it.endsWith('f')} // f 로 끝나는 문자열 (뒤에서 시작)
    val lastZ = words.lastOrNull {it.endsWith('z')} // z 로 끝나는 문자열 (뒤에서 시작)`

    println(firstF)
    println(firstZ)
    println(lastF)
    println(lastZ)
}