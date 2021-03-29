package til

import io.kotest.matchers.collections.shouldBeOneOf
import io.kotest.matchers.shouldBe
import model.sealed.AdvancedPaymentOptionEnum
import model.sealed.PaymentOptionEnum
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.math.BigDecimal

/**
 * https://blog.kotlin-academy.com/enum-vs-sealed-class-which-one-to-choose-dc92ce7a4df5
 */
@DisplayName("Sealed 를 공부하기 위함 : 그 이전에 enum 테스트")
class EnumTest {

    @Test
    @DisplayName("enum 을 테스트")
    fun enumTest() {
        val card1 = PaymentOptionEnum.CARD
        val card2 = PaymentOptionEnum.CARD

        (card1 == card2) shouldBe true
        (card1 === card2) shouldBe true

        /** card1 의 commission 을 변경했는데, card2 에도 영향이 미친다. **/
        card1.commission = BigDecimal.TEN
        card1.commission shouldBe BigDecimal.valueOf(10)
        card2.commission shouldBe BigDecimal.valueOf(10)

        val transfer = PaymentOptionEnum.TRANSFER
        transfer.commission shouldBe BigDecimal.valueOf(0)

        val cash = PaymentOptionEnum.CASH
        cash.commission shouldBe BigDecimal.valueOf(0)
    }

    @Test
    @DisplayName("advanced enum 을 테스트")
    fun advancedEnumTest() {
        val card1 = AdvancedPaymentOptionEnum.CARD
        val card2 = AdvancedPaymentOptionEnum.CARD

        (card1 == card2) shouldBe true
        (card1 === card2) shouldBe true

        card1.commission shouldBe BigDecimal.valueOf(10)
        card2.commission shouldBe BigDecimal.valueOf(10)

        val transfer = AdvancedPaymentOptionEnum.TRANSFER
        transfer.commission shouldBe BigDecimal.valueOf(0)

        val cash = AdvancedPaymentOptionEnum.CASH
        cash.commission shouldBe BigDecimal.valueOf(1)

        val randomPaymentOption = AdvancedPaymentOptionEnum.values().random()
        randomPaymentOption.commission shouldBeOneOf listOf(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN)
    }
}