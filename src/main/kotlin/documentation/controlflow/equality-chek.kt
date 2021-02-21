package documentation.controlflow.step04

fun main() {
    val authors = setOf("Park", "Sung", "Dong")
    val writers = setOf("Sung", "Dong", "Park")

    println(authors == writers)     // true : authors.equals(writers), 요소의 순서는 무시된다.
    println(authors === writers)    // false : distinct references.1
}