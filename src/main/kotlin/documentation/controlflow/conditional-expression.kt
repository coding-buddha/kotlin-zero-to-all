package documentation.controlflow.step05

// 코틀린에는 삼항연산자는 없고 대신에 if 구문으로 사용할 수 있다.
fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(max(99, -42))
}