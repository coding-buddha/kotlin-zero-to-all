package documentation.intro

fun main() {

    // var 는 mutable
    var a: String = "initial"
    println(a)

    // val 은 immutable
    val b: Int = 1
    val c = 3   // 컴파일단계에서 타입추론을 수행
    println(b)
    println(c)

    // variable 은 값이 있어야 출력할 수 있다. 없으면 아래의 에러가 발생한다.
    // Variable 'e' must be initialized
//    val e: Int
//    println(e)

    val d: Int
    if(randomMethod()) {
        d = 1
    } else {
        d = 2
    }
    println("result : $d")
}

fun randomMethod(): Boolean {
    return (0..10).random() % 2 == 0
}