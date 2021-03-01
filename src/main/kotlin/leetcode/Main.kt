package leetcode

fun main() {
    val store = mutableMapOf<Int, Int>()

    val value = store.getOrDefault(1, -1)
    println(value)
}