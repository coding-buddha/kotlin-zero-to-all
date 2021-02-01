package collections.operation

fun main() {

    val numbers = listOf(1, -2, -3, 4, 5 -6, 0, 0)
    val positiveNumbers = numbers.filter { x -> x > 0 }
    val negativeNumbers = numbers.filter { X -> X < 0 }

    // it 표기법을 통해서 0 값만을 추출할 수 있다.
    val zeroNumbers = numbers.filter { it == 0 }

    println("$positiveNumbers")
    println("$negativeNumbers")
    println("$zeroNumbers")
}