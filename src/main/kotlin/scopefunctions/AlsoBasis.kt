package scopefunctions

fun writeCreationLog(person: Person) {
    println("A new person ${person.name} was created")
}

/**
 * also 는 apply 와 유사한데, it 표기를 쓰는 부분이 다르다.
 * it 를 통해서 객체의 레퍼런스를 넘기는데 용이하다.
 * 해당 작업은 call chain 과 같은 작업을 하는데 편리하다.
 */
fun main() {

    val jake = Person("Jake", 30, "frontend developer")
        .also {
            writeCreationLog(it)
        }
}