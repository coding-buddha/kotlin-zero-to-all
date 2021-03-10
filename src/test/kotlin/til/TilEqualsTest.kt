package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

data class Person(val name: String)
class Employee(val name: String)

@DisplayName("비교 테스트")
class TilEqualsTest {

    @Test
    @DisplayName("String 리터럴 비교 테스트")
    fun stringLiteralst() {
        val value1 = "park"
        val value2 = "park"

        (value1 == value2) shouldBe true    // data variable 를 비교한다.
        (value1.equals(value2)) shouldBe true   // 변수 또는 개체의 내용을 비교한다.
        (value1 === value2) shouldBe true  // data variable 의 참조를 비교한다.
    }

    @Test
    @DisplayName("String 변수 할당 비교 테스트")
    fun stringVariableTest() {
        val value1 = String().plus("park")
        val value2 = String().plus("park")

        (value1 == value2) shouldBe true    // data variable 를 비교한다.
        (value1.equals(value2)) shouldBe true   // 변수 또는 개체의 내용을 비교한다.
        (value1 === value2) shouldBe false  // data variable 의 참조를 비교한다.
    }

    @Test
    @DisplayName("data class person 비교 테스트")
    fun personTest() {
        val person1 = Person("park")
        val person2 = Person("park")

        (person1 == person2) shouldBe true
        (person1 === person2) shouldBe false
        (person1.equals(person2)) shouldBe true // data class 이기 때문에 equals 비교 시 일치한다.

        (person1.name == person2.name) shouldBe true
        (person1.name.equals(person2.name)) shouldBe true
        (person1.name === person2.name) shouldBe true
    }

    @Test
    @DisplayName("class employee 비교 테스트")
    fun employeeTest() {
        val employee1 = Employee("park")
        val employee2 = Employee("park")

        (employee1 == employee2) shouldBe false
        (employee1 === employee2) shouldBe false
        (employee1.equals(employee2)) shouldBe false // data class 가 아니면 equals 비교 시 일치하지 않는다.

        (employee1.name == employee2.name) shouldBe true
        (employee1.name.equals(employee2.name)) shouldBe true
        (employee1.name === employee2.name) shouldBe true
    }
}