package documentation.classes

/**
 * 외부에서 해당 클래스의 상속 사용을 제한한다.
 * 그리고 Mammal 클래스로 객체를 만들 수 없다.
 * 따라서 단일 .kt 파일 내에서 sealed 의 하위클래스가 무엇인지 파악할 수 있다.
 */
sealed class Mammal(val name: String)

class Cat(private val catName: String) : Mammal(catName)
class Human(private val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) : String {
    when(mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Park", "Developer")))
}
