package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TilStringTest {

    @Test
    @DisplayName("스트링의 길이 수를 확인한다.")
    fun stringSizeTest() {

        // given
        val helloWorld = "Hello World"

        // then
        helloWorld.length shouldBe 11
    }

    @Test
    @DisplayName("스트링 for loop 를 해본다.")
    fun stringForLoop() {

        // given
        val helloWorld = "Hello World"

        var index = 0
        for(element in helloWorld) {
            element shouldBe helloWorld[index++]
        }
    }

}