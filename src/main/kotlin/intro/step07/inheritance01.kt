package intro.step07

/**
 * 코틀린 클래스는 기본이 final 이다.
 * 만약 클래스의 상속을 하고 싶다면 open 키워드를 통해서
 * open 지시자를 추가해주어야 한다.
 *
 * 코틀린 메소드도 기본이 final 이다.
 * 오버라이딩을 위해서 메소드 앞에 open 키워드를 붙여준다.
 */
open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

// 상속받을 클래스를 명시적으로 작성해준다.
// 아래의 예시에서는 Dog 클래스의 디폴트 생성자를 가리킨다.
class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}