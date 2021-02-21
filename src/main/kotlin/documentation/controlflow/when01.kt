package documentation.controlflow

/**
 * switch 구문 대신에 when 이라는 키워드를 사용
 */
fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

/**
 * 모든 분기는 단 하나의 조건을 만족할 때까지 순차적으로 진행된다.
 * 하나라도 만족하게 된다면, 바로 해당 내용을 수행한다.
 */
fun cases(obj: Any) {
    when(obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass