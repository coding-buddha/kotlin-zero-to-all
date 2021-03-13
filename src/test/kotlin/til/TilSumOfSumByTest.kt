package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

data class Human(val name: String, val age: Int, val height: Double)

class TilSumOfSumByTest {

    @Test
    @DisplayName("sumOf 테스트")
    fun sumOfTest() {

        // given
        val human1 = Human("park", 10, 130.5)
        val human2 = Human("kim", 22, 188.6)
        val human3 = Human("june", 15, 162.1)
        val human4 = Human("han", 17, 173.0)

        val humans = listOf(human1, human2, human3, human4)

        // when
        val totalAge = humans.sumOf { it.age }
        val totalHeight = humans.sumOf { it.height }
        val total = humans.sumOf { it.age + it.height }

        // then
        totalAge shouldBe 10 + 22 + 15 + 17
        totalHeight shouldBe 130.5 + 188.6 + 162.1 + 173.0
        total shouldBe 10 + 22 + 15 + 17 + 130.5 + 188.6 + 162.1 + 173.0
    }

    @Test
    @DisplayName("sumBy 테스트 : Int 형만 가능하다.")
    fun sumByTest() {

        // given
        val human1 = Human("park", 10, 130.5)
        val human2 = Human("kim", 22, 188.6)
        val human3 = Human("june", 15, 162.1)
        val human4 = Human("han", 17, 173.0)

        val humans = listOf(human1, human2, human3, human4)

        // when
        val totalAge = humans.sumBy { it.age }

        // then
        totalAge shouldBe 10 + 22 + 15 + 17
    }
}