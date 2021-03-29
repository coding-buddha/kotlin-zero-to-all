package til

import io.kotest.matchers.shouldBe
import model.boxes.BlackBox
import model.boxes.WhiteBox
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("인터페이스 테스트는")
class InterfaceTest {

    @Test
    @DisplayName("white-box 를 만든다.")
    fun createWhiteBoxTest() {

        // given
        val box = WhiteBox("white", "white-source")

        box.name shouldBe "white"
        box.source shouldBe "white-source"
        box.getMyName() shouldBe "white"

        // when
        box.name = "new-white"

        // then
        box.name shouldBe "new-white"
        box.source shouldBe "white-source"
        box.getMyName() shouldBe "new-white"
    }

    @Test
    @DisplayName("black-box 를 만든다.")
    fun createBlackBoxTest() {

        // given
        val box = BlackBox()
        box.name shouldBe ""
        box.source shouldBe ""

        // when
        box.name = "black"

        // then
        box.name shouldBe "black"
        box.source shouldBe ""
        box.getMyName() shouldBe "black"
    }
}