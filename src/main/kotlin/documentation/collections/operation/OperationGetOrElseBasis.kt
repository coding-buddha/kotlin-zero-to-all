package documentation.collections.operation

fun main() {
    val list = listOf(0, 10, 20)

    // 해당 인덱스 내 값을 반환하는데 비어있다면, Else로 설정한 값을 반환하도록 한다.
    println(list.getOrElse(1) {42})
    println(list.getOrElse(10) {42})

    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x"){1})
    map["x"] = 3
    println(map.getOrElse("x"){1})
    map["x"] = null

    // null 로 할당되었기 때문에 디폴트 값이 반환ㅎ된다.
    println(map.getOrElse("x"){1})
}