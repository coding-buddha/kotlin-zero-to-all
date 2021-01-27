package intro.step04

/**
 * 코틀린에서 외부 자바코드와 호환되기 위하여
 * null 을 우아하게 제공하는 위하여 null 추적 방법을 사용한다.
 * */

fun describeString(maybeString: String?): String {
    // maybeString 변수에 대해 인텔리제이가 maybeString.length > 0 의 내용을 isNotEmpty() 로 변경해주었다.
    if(maybeString != null && maybeString.isNotEmpty()) {
        return "String of length ${maybeString.length}"
    }
    return "Empty of null string"
}

fun main() {
    var isNullVariable: Nothing? = null
    println(describeString(isNullVariable))

    var isNonNullVariable = "String"
    println(describeString(isNonNullVariable))

}