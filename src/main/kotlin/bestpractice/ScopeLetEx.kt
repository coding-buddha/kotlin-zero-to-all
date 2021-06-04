package bestpractice

fun main() {

    // 람다 내 context 는 it 로 잡힌다.
    // 리턴 값은 새로운 람다 내 context object 가 될 수 있다.
    val noneAddress = Person("park", 20).address ?: "주소가 없지롱"

    println(noneAddress == "주소가 없지롱")
    println()

    val seoul = Person("park", 20).apply {
        setAddress("서울")
    }.address ?: "주소가 없지롱"

    println(seoul == "서울")
    println()

    // address?.let {} 구문을 아래와 같이 변경할 수 있다.
    // address ?: {}

    val busan = Person("lee", 24).also {
        it.setAddress("아무 주소를 넣는다.")
    }.address?.let {
        "부산"
    }
    println(busan == "부산")
}