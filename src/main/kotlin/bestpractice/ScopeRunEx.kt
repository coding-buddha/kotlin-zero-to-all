package bestpractice

fun main() {

    // 람다 내 context 는 this 로 잡힌다.
    // 리턴 값은 람다 내 새로운 context object 가 될 수 있다.
    val address1 = Person("park", 35).address?.run {
        "주소가 없어서 실행되었당"
    }
    println(address1 == null)
    println()

    val address2 = Person("park", 35).apply {
        setAddress("seoul")
    }.address?.run {
        "주소가 있어서 실행되었당"
    }
    println(address2 == "주소가 있어서 실행되었당")
    println()
}