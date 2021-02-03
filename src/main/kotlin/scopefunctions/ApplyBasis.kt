package scopefunctions

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0 , "")
}

/**
 * apply 는 객체에 대한 코드블럭을 수행하고, 객체 자체를 반환한다.
 * 블록 내에서는 this 구문을 통해서 객체 내 레퍼런스에 접근할 수 있다.
 * 해당 기능은 객체를 초기화하는데 편리하다.
 */
fun main() {
    val jake = Person()
    val stringDescription = jake.apply {
        this.name = "Jake"
        this.age = 30
        this.about = "backend developer"
    }.toString()

    println(stringDescription)
}