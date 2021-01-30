package classes

import java.util.*

/**
 * class 는 블루프린트이다.
 * object 는 class 의 인스턴스이다.
 */
class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()   // 인스턴스를 만드는 행위
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
}