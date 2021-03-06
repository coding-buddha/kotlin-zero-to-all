package documentation.intro

fun printAll(vararg messages: String) {
    for(m in messages)
        println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for(m in messages)
        println("$prefix $m")
}

/**
 * runtime 시에, vararg 는 배열이다. * 를 이용하여, spread operator 를 사용하도록 해야한다.
 * vararg : 가변인자인데, 자바의 스프레드 연산 ... 과 유사하다
 */
fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printAll("®Hi", "Hello", "Good", "Bad")
    printAllWithPrefix("Hi", "Hello", "Good", "Bad", prefix = "Greeting")
    log("aaa", "bbb", "ccc")
}