package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("char array 테스트는")
class TilCharArrayTest {

    @Test
    @DisplayName("charArray 를 선언한다.")
    fun initCharArray() {

        // given
        val chars: CharArray = CharArray(5)

        // when
        chars[0] = 'H'
        chars[1] = 'e'
        chars[2] = 'l'
        chars[3] = 'l'
        chars[4] = 'o'

        // then
        chars.joinToString("") shouldBe "Hello"

        // when & then
        chars[0] = ('H' + 32)
        chars.joinToString("") shouldBe "hello"
    }

    @Test
    @DisplayName("array -> String 으로 변환한다.")
    fun arrayToStringTest() {

        // given
        val chars = arrayOf('H', 'e', 'l', 'l', 'o')

        // when
        val hello = chars.joinToString("")

        // then
        hello shouldBe "Hello"
    }

    @Test
    @DisplayName("array -> charArray -> String 으로 변환한다.")
    fun arrayToCharArrayToStringTest() {

        // given
        val chars = arrayOf('H', 'e', 'l', 'l', 'o')

        // when
        val helloCharArray = chars.toCharArray()
        val hello = String(helloCharArray)

        // then
        hello shouldBe "Hello"
    }
}