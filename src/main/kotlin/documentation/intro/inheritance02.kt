package documentation.intro

// 파라미터 생성자를 받도록 하기 위함이다.
open class Tiger(private val origin: String) {
    fun sayHello() {
        println("A tiger $origin says: grrhhh!")
    }
}

// 클래스만 상속받도록 되어있다.
// 서브클래스에서는 상위 클래스의 생성자를 디폴트 생성자가 아닌 파라미터 있는 생성자로 선언되어있는 상태이다.
class SiberianTiger : Tiger("Siberia")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}