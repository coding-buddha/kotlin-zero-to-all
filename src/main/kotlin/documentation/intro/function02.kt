package documentation.intro

fun main() {

    // 중위 표현을 할 수 있다.
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    // 기본적으로 제공하는 pair 의 to infix 함수를 호출하였음
    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Mclaren" onto "Lucas"
    println(myPair)

    val park = Person("Park")
    val lee = Person("lee")
    park likes lee
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}