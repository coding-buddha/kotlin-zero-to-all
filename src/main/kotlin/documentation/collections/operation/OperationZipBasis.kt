package documentation.collections.operation

fun main() {
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    // zip 은 두 개의 컬렉션이 주어지고 그 두개를 새로운 컬렉션으로 만들어준다.
    val resultPairs = A zip B
    val resultReduce = A.zip(B) {a, b -> "$a$b"}

    println(A)
    println(B)
    println(resultPairs)
    println(resultReduce)
}