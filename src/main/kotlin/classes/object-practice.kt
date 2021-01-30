package classes

/**
 * 공통된 속성을 가질 수 있다.
 * 인스턴스를 만들지 않고 공통된 인스턴스 (싱글톤 느낌이 강하다.)
 */
object Counter {
    var count = 0;

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0;
    }
}

fun main() {
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)
    Counter.clear()
    println(Counter.count)
}