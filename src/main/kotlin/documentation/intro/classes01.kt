package documentation.intro

/**
 * 클래스에 본문이 없으면 중괄호 생략이 가능하다.
 */

// non-parameterized default constructor : 코틀린이 자동으로 생성
class Customer

// two parameterized, immutable id & mutable email
class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()

    val contact = Contact(1, "pasudo123@naver.com")
    println("id : ${contact.id} email : ${contact.email}")
    contact.email = "oraedoa@gmail.com"
    println("id : ${contact.id} email : ${contact.email}")
}