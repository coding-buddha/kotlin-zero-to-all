package collections.operation

fun main() {
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    val first = words.find {it.startsWith("some")}      // 앞에서 탐색
    val last = words.findLast {it.startsWith("some")}   // 뒤에서 탐색
    val nothing = words.find {it.contains("nothing")}
    val inInclude = words.find {it.contains("in")}

    println(first)      // 문자열 리스트의 요소 반환
    println(last)       // 문자열 리스트의 요소 반환
    println(nothing)    // 찾지 못한 경우에 nothing
    println(inInclude)  // 찾은 경우에 find
}