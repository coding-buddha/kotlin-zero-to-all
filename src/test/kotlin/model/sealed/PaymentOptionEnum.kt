package model.sealed

import java.math.BigDecimal

enum class PaymentOptionEnum {
    CASH,
    CARD,
    TRANSFER;

    var commission: BigDecimal = BigDecimal.ZERO
}

enum class AdvancedPaymentOptionEnum(val commission: BigDecimal) {
    CASH(BigDecimal.ONE),
    CARD(BigDecimal.TEN),
    TRANSFER(BigDecimal.ZERO);
}