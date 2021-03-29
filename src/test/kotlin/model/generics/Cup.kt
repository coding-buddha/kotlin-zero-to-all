package model.generics

/**
 * Cup 클래스에 T 라는 타입파라미터 작성
 */
class Cup<T>

fun main() {
    /** (1) 아래의 유형들은 서로간에 관계가 없다. **/
    val cupOfNumber = Cup<Number>()
    val cupOfInt = Cup<Int>()
    val cupOfAny = Cup<Any>()
    val cupOfNothing = Cup<Nothing>()

    /** (2) 다른 타입을 호환하지 못한다. : 아래의 구문은 에러가 발생한다. **/
    // val cupMismatch: Cup<Number> = Cup<Int>()
}