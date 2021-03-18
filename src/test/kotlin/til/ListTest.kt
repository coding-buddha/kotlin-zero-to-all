package til

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class ListTest {

    @Test
    fun listSubListTest() {

        // given
        val list = mutableListOf(1, 2, 3, 4)

        // when
        val newList = list.subList(0, 1)

        // then
        newList.size shouldBe 1
    }

    @Test
    fun listRemoveTest() {

        // given
        val list = listOf(1, 2)

        // when
        list.apply {

        }

        // then
    }
}