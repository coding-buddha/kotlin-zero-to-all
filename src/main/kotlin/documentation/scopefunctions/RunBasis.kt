package documentation.scopefunctions

/**
 * let 과 마찬가지로 run 은 표준 라이브러리의 스코프 함수이다.
 * run 의 코드블록을 실행하고, 그 결과를 반환하는 형식으로 let 과 동일하다.
 *
 * let 과의 차이점은 객체에서 this 키워드를 통해 액세스를 수행한다는 점이다.
 * 이 경우는 객체를 인수로 전달하는 대신에 ** 객체의 메소드를 통해 호출해서 전달하는 경우 유용하다.
 */
fun getNullableLength(ns: String?): Int? {
    println("for \"$ns\":")
    // ns 가 null 이 아닌 경우에만 수행할 수 있도록 한다.

    return ns?.run {
        println("\tis empty? " + isEmpty())
        println("\tlength = $length")
        length
    }
}

fun main() {

    val length0 = getNullableLength(null)
    println("length0 : $length0")
    println()

    val length1 = getNullableLength("")
    println("length1 : $length1")
    println()

    val length2 = getNullableLength("hello world")
    println("length2 : $length2")

    val result = "test".run {
        length
    }
}