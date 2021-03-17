package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

interface Box {
    var name: String
    val source: String

    fun getMyName(): String
}

class BlackBox : Box {
    override var name: String = ""
    override val source: String = ""
    override fun getMyName(): String {
        return this.name
    }
}

class WhiteBox(
    override var name: String,
    override val source: String
) : Box {
    override fun getMyName(): String {
        return this.name
    }
}

@DisplayName("인터페이스 테스트는")
class TilInterfaceTest {

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