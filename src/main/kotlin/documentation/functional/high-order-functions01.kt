package documentation.functional

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    val sumResult = calculate(4, 5, ::sum)              // 다른 함수를 매개변수로 받는다. ("::" 을 이용해서 함수를 참조하도록 한다.)
    val mulResult = calculate(4, 5) {a, b -> a * b}     // 함수를 리턴해서 새롭게 재정의한다.
    println("sumResult :: $sumResult")
    println("sumResult :: $mulResult")
}