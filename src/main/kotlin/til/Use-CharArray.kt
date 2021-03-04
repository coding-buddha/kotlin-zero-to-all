package til

fun main() {
    // (1) 문자배열을 문자열로 만든다.
    val chars = arrayOf('A', 'B', 'C')

    println(String(chars.toCharArray()))
    println(chars.joinToString("")) // ABC
    println(String(chars.toCharArray()) == chars.joinToString("")) // true

    val helloChars = charArrayOf('H', 'e', 'l', 'l', 'o')
    println(helloChars)
    println(helloChars is CharArray)    // true
    println(String(helloChars))
    println(String(helloChars) is String)   // true


    // (2) 문자열을 문자배열로 만든다.
    println("============================")
    val array = "Hello World".toCharArray()
    println(array[0])
    println(String(array)[0])
}