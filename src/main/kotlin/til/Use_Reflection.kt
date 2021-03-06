package til

data class Person(
    val name: String,
    var enabled: Boolean
)

fun main() {
    Person::class.java.methods.forEach(::println)
}