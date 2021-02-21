package documentation.intro

fun strLength(notNull: String): Int {
    return notNull.length
}

/**
 * NullPointer exception 을 없애기 위해 코틀린에서는 변수에 null 을 할당하지 않는다.
 */
fun main() {
    var neverNull: String = "This can't be null"

    // compile error
    // neverNull = null

    var nullable: String? = "You can keep a null here"
    println("nullable1 : $nullable")
    nullable = null
    println("nullable2 : $nullable")

    var inferredNonNull = "The compiler assumes non-null"

    // compile error
    // inferredNonNull = null

    strLength(neverNull)

    // type mismatch
    // nullable 은 null 값이 할당되었기 때문에 컴파일 에러가 발생한다.
    // strLength(nullable)


}
