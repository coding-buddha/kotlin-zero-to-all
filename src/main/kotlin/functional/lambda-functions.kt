package functional

/**
 * 람다의 5가지 사용방법
 */
val upperCase1: (String) -> String = {str: String -> str.toUpperCase()}
val upperCase2: (String) -> String = {str -> str.toUpperCase()}
val upperCase3 = {str:String -> str.toUpperCase()}
val upperCase4: (String) -> String = {it.toUpperCase()} // 단일 매개변수에 대해서 명시적으로 이름을 지정할 필요는 없지만 대신 it 라는 변수를 사용해야한다.
val upperCase5: (String) -> String = String::toUpperCase

fun main() {
    println(upperCase1("apple1"))
    println(upperCase2("apple2"))
    println(upperCase3("apple3"))
    println(upperCase4("apple4"))
    println(upperCase5("apple5"))
}