package collections.operation

// any method
fun anyOperation() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val anyNegativeNumbers = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }

    // Boolean 타입을 리턴한다
    // 적어도 하나이상의 값이 조건에 만족하기만 하면 된다.
    println("anyOperation result")
    println(anyNegativeNumbers)
    println(anyGT6)
}

fun allOperation() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val allEven = numbers.all {it % 2 == 0}
    val allLess6 = numbers.all {it < 6}

    // boolean 타입 리턴, 모든 요소가 만족해야 한다
    println("allOperation result")
    println(allEven)
    println(allLess6)
}

fun noneOperation() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val allEven = numbers.none {it % 2 == 1}
    val allLess6 = numbers.none {it > 6}

    // boolean 타입 리턴, 모든 요소가 불만족해야한다.
    println("noneOperation result")
    println(allEven)
    println(allLess6)
}

fun main() {
    anyOperation()
    println()
    allOperation()
    println()
    noneOperation()
}