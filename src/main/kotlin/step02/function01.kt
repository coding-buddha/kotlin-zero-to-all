package step02

/**
 * Unit 은 아무것도 리턴하지 않겠다는 의미
 */
fun printMessage(message: String): Unit {
  println(message)
}

/**
 * 옵셔널적인 디폴트 파라미터 "Info" 를 반환,
 * return type 은 omitted 이다. 즉 생략을 의미한다. (=Unit) 과 동일한 의미
 */
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
  println("[$prefix] $message")
}

/**
 * 리턴 타입을 Int 로 명시하였다.
 */
fun sum(x: Int, y: Int): Int {
  return x + y
}

/**
 * 단일 함수는 리턴 타입을 추론할 수 있다.
 */
fun mul(x: Int, y: Int) = x * y

fun main() {
  printMessage("Hello")
  printMessageWithPrefix("Hello")
  printMessageWithPrefix("Hello", "Log")

  // named arguments 를 줌으로써 인자값 위치를 변경할 수 있다.
  printMessageWithPrefix(prefix = "Park", message = "Hello")
  println(sum(1, 2))
  println(mul(5, 2))
}
