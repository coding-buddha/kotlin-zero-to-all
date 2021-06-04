package bestpractice

/**
 * apply 와 also 를 확인한다.
 */
fun main() {

    // 람다 내 context 는 this 로 잡힌다.
    // 리턴값은 context object 그대로 반환된다.
    val person1 = Person("park", 30).apply {
        setAddress("seoul")
    }.also {
        println("[block] : $it")
    }
    println(person1)
    println()

    // 람다 내 context 는 it 로 잡힌다.
    // 리턴값은 context object 그대로 반환한다.
    val person2 = Person("lee", 14).also {
        println("[block] : $it")
        it.setAddress("busan")
    }
    println(person2)
}