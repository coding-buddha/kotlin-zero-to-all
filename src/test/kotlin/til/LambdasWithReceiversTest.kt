package til

import model.Human
import org.junit.jupiter.api.Test

/**
 * https://github.com/Zhuinden/guide-to-kotlin/wiki/3.)-The-Cool-Stuff#lambdas-with-receivers
 */
class LambdasWithReceiversTest {

    inline fun Human.runTransaction(crossinline transaction: Human.() -> Unit) {
        val human = this

    }

    @Test
    fun lambdaReceiversTest() {
        val human = Human("park", 30)
        human.runTransaction {

        }
    }
}