package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

@DisplayName("LocalDateTime 테스트는")
class LocalDateTimeTest {

    @Test
    @DisplayName("이전날짜인지 비교한다.")
    fun localDateTimeDiffTest1() {

        // given
        val beforeDate = LocalDateTime.of(2021, 3, 17, 23, 59, 59)
        val afterDate = LocalDateTime.of(2021, 3, 18, 0, 0, 0)

        // when
        val isBefore = beforeDate.isBefore(afterDate)

        // then
        isBefore shouldBe true
    }

    @Test
    @DisplayName("이전날짜인지 비교한다. 2")
    fun localDateTimeDiffTest11() {

        // given
        val beforeDateTime = LocalDateTime.of(2021, 3, 18, 10, 10, 9)
        val afterDateTime = LocalDateTime.of(2021, 3, 18, 10, 10, 10)
        val beforeDate = beforeDateTime.toLocalDate()
        val afterDate = afterDateTime.toLocalDate()

        // when
        val isBefore = beforeDate.isBefore(afterDate)

        // then
        isBefore shouldBe false
    }

    @Test
    @DisplayName("이후날짜인지 비교한다.")
    fun localDateTimeDiffTest2() {

        // given
        val beforeDate = LocalDateTime.of(2021, 3, 17, 23, 59, 59)
        val afterDate = LocalDateTime.of(2021, 3, 18, 0, 0, 0)

        // when
        val isAfter = afterDate.isAfter(beforeDate)

        // then
        isAfter shouldBe true
    }

    @Test
    @DisplayName("두 날짜가 동일한지 비교해서 동일하지 않음을 확인할 수 있다.")
    fun localDateTimeDiffTest3() {

        // given
        val beforeDate = LocalDateTime.of(2021, 3, 18, 0, 0, 1)
        val afterDate = LocalDateTime.of(2021, 3, 18, 0, 0, 0)

        // when
        val isEquals = beforeDate.isEqual(afterDate)

        // then
        isEquals shouldBe false
    }
}