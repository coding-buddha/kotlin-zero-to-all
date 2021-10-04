package tip

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalStateException

/**
 * 무분별한 남용은 안된다.
 * 특정 함수에서 어떤 조건을 통한 프로세스가 이루어지는 부분에서 필요하다.
 */
class EarlyExitCondition {

    @Test
    fun requireTest() {

        // given
        val number = -1

        // when
        val exception = assertThrows<IllegalArgumentException> {
            require(number >= 0) {
                "숫자는 항상 0 이상이어야 합니다."
            }
        }

        // then
        exception.message shouldBe "숫자는 항상 0 이상이어야 합니다."
        exception.javaClass shouldBe java.lang.IllegalArgumentException::class.java
    }

    @Test
    fun checkTest() {

        // given
        val number = -1

        // when
        val exception = assertThrows<IllegalStateException> {
            check(number >= 0) {
                "숫자는 항상 0 이상이어야 합니다."
            }
        }

        // then
        exception.message shouldBe "숫자는 항상 0 이상이어야 합니다."
        exception.javaClass shouldBe java.lang.IllegalStateException::class.java
    }
}