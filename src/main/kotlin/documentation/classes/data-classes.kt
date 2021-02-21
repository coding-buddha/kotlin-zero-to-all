package documentation.classes

/**
 * equals(), hashCode()
 * toString()
 * copy()
 * component{N}()
 *
 * https://kotlinlang.org/docs/reference/data-documentation.classes.html
 */
data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    println(user)   // toString() auto generated

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser : ${user == secondUser}")   // true : equals() auto generated
    println("user == thirdUser : ${user == thirdUser}")     // false

    println(user.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())                // copy() 메소드를 통해서 new instance 를 만들 수 있다.
    println(user.copy(name = "Max"))    // copy() 를 이용하여, 속성값을 변경할 수 있다.
    println(user.copy(id = 2))

    println("name == ${user.component1()}") // component{N}() 메소드를 이용하게 되면 속성 값의 순서를 획득할 수 있다.
    println("id == ${user.component2()}")
}