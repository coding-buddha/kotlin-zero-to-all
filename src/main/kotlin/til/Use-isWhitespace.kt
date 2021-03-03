package til

/**
 * 유니코드 표준에 따라서 문자가 공백인지 여부를 결정한다.
 * 문자가 공백이면 true 를 반환한다.
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/is-whitespace.html
 */
fun main() {

    val chars = listOf(' ', '\t', '\n', 'a', '1', '\u00A0')
    val (whitespace, notWhitespaces) = chars.partition { it.isWhitespace() }

    println(whitespace)
    println(notWhitespaces)
    println("------------")

    val origin = "Hello World Kotlin"
    val nonWhiteTarget = origin.filter { !it.isWhitespace() }
    val whiteTarget = origin.filter { it.isWhitespace() }
    println("origin : $origin")
    println("nonWhiteTarget : $nonWhiteTarget")
    println("whiteTarget : $whiteTarget")
}