package model.generics

/**
 * https://blog.kotlin-academy.com/kotlin-generics-variance-modifiers-36b82c7caa39
 */
class NewCup<out T>

open class B
class A: B()

fun main() {

    /** type match **/
    val newCupOfB: NewCup<B> = NewCup<B>()

    /** type match : 상위 클래스로 캐스팅 가능 **/
    val newCupOfAToB: NewCup<B> = NewCup<A>()

    /** type mismatch **/
    // val newCupOfBToA: NewCup<A> = NewCup<B>()

    /** type match **/
    val newCupOfAny: NewCup<Any> = NewCup<Int>()

    /** type mismatch **/
    // val nothing: NewCup<Nothing> = NewCup<Int>()
}