package documentation.functional

/**
 * (Int) -> Int 는 매개변수 Int 타입을 받아서 Int 를 반환하겠다는 의미
 * 메소드 참조로 square 메소드를 반환한다.
 */
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    val func = operation()
    println(func(5))
}