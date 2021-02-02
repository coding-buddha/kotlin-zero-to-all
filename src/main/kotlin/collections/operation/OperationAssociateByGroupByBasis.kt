package collections.operation

data class Person (
    val name: String,
    val city: String,
    val phone: String
)

fun main() {

    val people = listOf(
        Person("park", "seoul", "010-1234-0000"),
        Person("kim", "busan", "010-1234-1111"),
        Person("lee", "incheon", "010-1234-2222"),
        Person("jue", "busan", "010-1234-3333"),
        Person("yong", "daejeon", "010-1234-4444"))

    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(Person::phone, Person::city)

    // city 를 기준으로 그룹핑한다
    val peopleCities = people.groupBy(Person::city, Person::name)

    println(phoneBook)
    println(cityBook)
    println(peopleCities)
    println(peopleCities.get("busan"))
    println(peopleCities.get("busan")!!.size)   // 항상 값이 존재해야함을 !! 표기로 설정한다.
    println(peopleCities.get("busan")!![1])
}